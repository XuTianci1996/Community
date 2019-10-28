package life.xtc.community.controller;

import life.xtc.community.dto.QuestionDTO;
import life.xtc.community.entity.Question;
import life.xtc.community.entity.User;
import life.xtc.community.mapper.QuestionMapper;
import life.xtc.community.mapper.UserMapper;
import life.xtc.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class IndexController {

    @Autowired
    UserMapper userMapper;

    @Autowired
    QuestionService questionService;

    @GetMapping("/")
    public String index(HttpServletRequest request
    , Model model)
    {
        Cookie[] cookies = request.getCookies();
        if(cookies!=null&&cookies.length>0) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("token")) {
                    String token = cookie.getValue();
                    User user = userMapper.fingByToken(token);
                    if (user != null) {
                        request.getSession().setAttribute("user", user);
                    }
                    break;
                }
            }
        }
        List<QuestionDTO> questions = questionService.list();
        model.addAttribute("questions",questions);
            return "index";
    }
}
