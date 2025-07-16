package pub.developers.forum.api.service;

import pub.developers.forum.api.model.ResultModel;
import pub.developers.forum.api.request.github.GithubOauthLoginRequest;

/**
 * @author 13
 * @create 2025.7
 * @desc
 **/
public interface GithubApiService {

    ResultModel<String> oauthLogin(GithubOauthLoginRequest request);

}
