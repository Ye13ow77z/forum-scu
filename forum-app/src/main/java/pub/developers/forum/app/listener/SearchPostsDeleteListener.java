package pub.developers.forum.app.listener;

import org.springframework.stereotype.Component;
import pub.developers.forum.common.support.EventBus;
import pub.developers.forum.domain.entity.BasePosts;
import pub.developers.forum.domain.service.SearchService;

import javax.annotation.Resource;

/**
 * @author 13
 * @create 2025.7
 * @desc
 **/
@Component
public class SearchPostsDeleteListener extends EventBus.EventHandler<BasePosts> {

    @Resource
    private SearchService searchService;

    @Override
    public EventBus.Topic topic() {
        return EventBus.Topic.POSTS_DELETE;
    }

    @Override
    public void onMessage(BasePosts basePosts) {
        searchService.deleteByPostsId(basePosts.getId());
    }
}
