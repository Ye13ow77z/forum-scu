package pub.developers.forum.domain.service;

import com.alibaba.fastjson.JSONObject;

/**
 * @author 13
 * @create 2025.7
 * @desc
 **/
public interface GithubService {

    JSONObject getUserInfo(String code);

}
