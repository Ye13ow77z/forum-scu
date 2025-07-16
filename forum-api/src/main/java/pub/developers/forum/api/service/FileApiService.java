package pub.developers.forum.api.service;

import pub.developers.forum.api.model.ResultModel;
import pub.developers.forum.api.request.file.FileUploadImgRequest;

/**
 * @author 13
 * @create 2025.7
 * @desc
 **/
public interface FileApiService {

    ResultModel<String> uploadImg(FileUploadImgRequest request);

}
