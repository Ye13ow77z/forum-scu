package pub.developers.forum.domain.repository;

import pub.developers.forum.common.enums.FollowedTypeEn;

import java.util.List;

/**
 * @author 13
 * @create 2025.7
 * @desc
 **/
public interface UserFollowRepository {

    List<Long> getAllFollowerIds(Long follower, FollowedTypeEn type);
}
