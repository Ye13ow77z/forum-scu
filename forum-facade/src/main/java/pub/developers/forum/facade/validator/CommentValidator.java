package pub.developers.forum.facade.validator;

import pub.developers.forum.api.request.comment.CommentCreateRequest;
import pub.developers.forum.common.support.CheckUtil;

/**
 * @author 13
 * @create 2025.7
 * @desc
 **/
public class CommentValidator {

    public static void create(CommentCreateRequest request) {
        CheckUtil.checkParamToast(request, "request");
        CheckUtil.checkParamToast(request.getPostsId(), "postsId");
        CheckUtil.checkParamToast(request.getContent(), "content");
    }
}
