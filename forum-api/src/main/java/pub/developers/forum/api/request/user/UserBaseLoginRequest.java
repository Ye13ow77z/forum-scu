package pub.developers.forum.api.request.user;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 13
 * @create 2025.7
 * @desc
 **/
@Data
public class UserBaseLoginRequest implements Serializable {

    private String ua;

    private String ip;

}
