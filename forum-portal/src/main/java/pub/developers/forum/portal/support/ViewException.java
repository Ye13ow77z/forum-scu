package pub.developers.forum.portal.support;

import lombok.Data;

/**
 * @author 13
 * @create 2025.7
 * @desc
 **/
@Data
public class ViewException extends RuntimeException {

    private String message;

    public static ViewException build(String message) {
        ViewException viewException = new ViewException();
        viewException.setMessage(message);
        return viewException;
    }

}
