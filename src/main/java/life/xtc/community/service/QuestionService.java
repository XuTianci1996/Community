package life.xtc.community.service;

import life.xtc.community.dto.PaginationDTO;
import life.xtc.community.dto.QuestionDTO;
import life.xtc.community.entity.Question;
import life.xtc.community.entity.User;
import life.xtc.community.mapper.QuestionMapper;
import life.xtc.community.mapper.UserMapper;
import org.apache.ibatis.javassist.expr.NewArray;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private QuestionMapper questionMapper;

    public PaginationDTO list(Integer page,Integer size) {
        Integer total = questionMapper.count();
        Integer totalPage=0;
        //根据当前页，从数据库中查找内容
        if(total%size==0){
            totalPage = total/size;
        }else{
            totalPage = total/size+1;
        }
        //防止页码越界
        if(page<1){
            page = 1;
        }
        if(page>totalPage){
            page = totalPage;
        }
        Integer offset = size*(page-1);
        List<Question> questions = questionMapper.list(offset,size);
        List<QuestionDTO> questionDTOS = new ArrayList<>();
        PaginationDTO paginationDTO = new PaginationDTO();
        for(Question question:questions ){
            User user = userMapper.findById(question.getCreator());
            QuestionDTO questionDTO = new QuestionDTO();
            BeanUtils.copyProperties(question,questionDTO);
            questionDTO.setUser(user);
            questionDTOS.add(questionDTO);
        }
        paginationDTO.setQuestions(questionDTOS);
        paginationDTO.setTotalPage(totalPage);
        paginationDTO.setPagination(total,page,size);
        return paginationDTO;
    }
}
