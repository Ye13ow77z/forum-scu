package pub.developers.forum.facade.impl;

import org.springframework.stereotype.Service;
import pub.developers.forum.api.model.ResultModel;
import pub.developers.forum.api.request.github.GithubOauthLoginRequest;
import pub.developers.forum.api.service.GithubApiService;
import pub.developers.forum.app.manager.GithubManager;
import pub.developers.forum.common.support.CheckUtil;
import pub.developers.forum.facade.support.ResultModelUtil;

import javax.annotation.Resource;

/**
 * @author 13
 * @create 2025.7
 * @desc
 **/
@Service
public class GithubApiServiceImpl implements GithubApiService {

    @Resource
    private GithubManager githubManager;

    @Override
    public ResultModel<String> oauthLogin(GithubOauthLoginRequest request) {
        CheckUtil.checkParamToast(request, "request");
        CheckUtil.checkParamToast(request.getCode(), "code");

        return ResultModelUtil.success(githubManager.oauthLogin(request));
    }
}
