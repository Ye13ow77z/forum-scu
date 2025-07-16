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
public enum SearchTypeEn {
    POSTS("POSTS", "帖子"),
    ;

    private String value;
    private String desc;
}
