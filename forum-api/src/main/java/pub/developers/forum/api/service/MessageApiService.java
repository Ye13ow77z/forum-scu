package pub.developers.forum.api.service;

import pub.developers.forum.api.model.PageRequestModel;
import pub.developers.forum.api.model.PageResponseModel;
import pub.developers.forum.api.model.ResultModel;
import pub.developers.forum.api.request.message.MessagePageRequest;
import pub.developers.forum.api.response.message.MessagePageResponse;

/**
 * @author 13
 * @create 2025.7
 * @desc
 **/
public interface MessageApiService {

    ResultModel<PageResponseModel<MessagePageResponse>> page(PageRequestModel<MessagePageRequest> request);

    ResultModel markIsRead(Long messageId);

    ResultModel<Long> countUnRead();

}
