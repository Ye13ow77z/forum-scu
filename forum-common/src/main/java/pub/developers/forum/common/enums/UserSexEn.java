package pub.developers.forum.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import pub.developers.forum.common.exception.BizException;

/**
 * @author 13
 * @create 2025.7
 * @desc
 **/
@Getter
@AllArgsConstructor
public enum UserSexEn {
    /**
     *
     */
    UNKNOWN("UNKNOWN", "未知"),
    MAN("MAN", "男"),
    WOMAN("WOMAN", "女"),
    ;

    private String value;
    private String desc;

    public static UserSexEn getEntity(String value) {
        for (UserSexEn userSexEn : values()) {
            if (userSexEn.getValue().equalsIgnoreCase(value)) {
                return userSexEn;
            }
        }

        return null;
    }
}
