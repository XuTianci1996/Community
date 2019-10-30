package life.xtc.community.mapper;

import life.xtc.community.entity.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface QuestionMapper {

    @Insert("insert into question (title,description,gmt_created,gmt_modified,creator,comment_count,view_count,like_count,tag) values (#{title},#{description},#{gmtCreated},#{gmtModified},#{creator},#{commentCount},#{viewCount},#{likeCount},#{tag})")
    void Create(Question question);

    @Select("select * from question limit #{offset},#{size}")
    List<Question> list(Integer offset, Integer size);

    @Select("select count(1) from question")
    Integer count();
}
