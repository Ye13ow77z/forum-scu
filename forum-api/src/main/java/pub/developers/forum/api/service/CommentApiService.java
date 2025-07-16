package pub.developers.forum.api.service;

import pub.developers.forum.api.model.PageRequestModel;
import pub.developers.forum.api.model.PageResponseModel;
import pub.developers.forum.api.model.ResultModel;
import pub.developers.forum.api.request.comment.CommentCreateRequest;
import pub.developers.forum.api.response.comment.CommentPageResponse;

/**
 * @author 13
 * @create 2025.7
 * @desc
 **/
public interface CommentApiService {

    ResultModel create(CommentCreateRequest request);

    ResultModel<PageResponseModel<CommentPageResponse>> page(PageRequestModel<Long> pageRequest);

}
