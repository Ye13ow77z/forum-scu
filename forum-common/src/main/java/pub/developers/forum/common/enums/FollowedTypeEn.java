package pub.developers.forum.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author 13
 * @create 2025.7
 * @desc
 **/
@Getter
@AllArgsConstructor
public enum FollowedTypeEn {
    USER("USER", "用户"),
    POSTS("POSTS", "帖子"),
    ;
    private String value;
    private String desc;

    public static FollowedTypeEn getEntity(String value) {
        for (FollowedTypeEn contentType : values()) {
            if (contentType.getValue().equals(value)) {
                return contentType;
            }
        }
        return null;
    }
}
