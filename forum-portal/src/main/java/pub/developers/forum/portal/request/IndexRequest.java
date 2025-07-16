package pub.developers.forum.portal.request;

import lombok.Data;

/**
 * @author 13
 *
 * @desc
 **/
@Data
public class IndexRequest extends BasePageRequest {

    private String type;

    private String toast;

    private String token;
}
