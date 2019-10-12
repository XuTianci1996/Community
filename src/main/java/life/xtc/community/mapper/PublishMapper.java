package life.xtc.community.mapper;

import life.xtc.community.entity.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PublishMapper {

    @Insert("insert into question (title,description,gmt_created,gmt_modified,creator,comment_count,view_count,like_count,tag) values (#{title},#{description},#{gmtCreated},#{gmtModified},#{creator},#{commentCount},#{viewCount},#{likeCount},#{tag})")
    void Create(Question question);
}
