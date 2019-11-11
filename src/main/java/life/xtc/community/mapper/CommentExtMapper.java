package life.xtc.community.mapper;


import life.xtc.community.entity.Comment;

public interface CommentExtMapper {
    int incCommentCount(Comment comment);
}