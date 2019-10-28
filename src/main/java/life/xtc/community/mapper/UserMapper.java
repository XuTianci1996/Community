package life.xtc.community.mapper;

import life.xtc.community.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Insert("insert into user (name,account_id,token,gmt_Create,gmt_Modified,avatar_url) values (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified},#{avatar_url})")
    void insertUser(User user);

    @Select("select * from user where token=#{token}")
    User fingByToken(@Param("token") String token);

    @Select("select * from user where id=#{id}")
    User findById(@Param("id")Integer id);
}
