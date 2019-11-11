package life.xtc.community.dto;

import lombok.Data;

@Data
public class GitHubUser {
    private String name;
    private String bio;
    private String id;
    private String avatarUrl;
}
