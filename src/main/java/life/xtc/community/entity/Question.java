package life.xtc.community.entity;

import lombok.Data;

@Data
public class Question {
    private Integer id;
    private String title;
    private String description;
    private String gmtCreated;
    private String gmtModified;
    private String creator;
    private Integer commentCount;
    private Integer viewCount;
    private Integer likeCount;
    private String tag;
}
