package pub.developers.forum.infrastructure.dal.dao;

import org.apache.ibatis.annotations.Param;
import pub.developers.forum.infrastructure.dal.dataobject.UserFollowDO;

import java.util.List;

/**
 * @author 13
 * @create 2025.7
 * @desc
 **/
public interface UserFollowDAO {

    void insert(UserFollowDO userFollowDO);

    List<UserFollowDO> query(UserFollowDO userFollowDO);

    void delete(@Param("id") Long id);

    List<Long> getAllFollowerIds(@Param("follower") Long follower, @Param("type") String type);
}
