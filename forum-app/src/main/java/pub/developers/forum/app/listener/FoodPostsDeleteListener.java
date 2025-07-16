package pub.developers.forum.app.listener;

import org.springframework.stereotype.Component;
import pub.developers.forum.common.support.EventBus;
import pub.developers.forum.domain.entity.BasePosts;
import pub.developers.forum.domain.repository.UserFoodRepository;

import javax.annotation.Resource;

/**
 * @author 13
 * @create 2025.7
 * @desc
 **/
@Component
public class FoodPostsDeleteListener extends EventBus.EventHandler<BasePosts> {

    @Resource
    private UserFoodRepository userFoodRepository;

    @Override
    public EventBus.Topic topic() {
        return EventBus.Topic.POSTS_DELETE;
    }

    @Override
    public void onMessage(BasePosts basePosts) {
        userFoodRepository.deleteByPostsId(basePosts.getId());
    }
}
