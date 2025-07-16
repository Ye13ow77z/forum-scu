package pub.developers.forum.infrastructure.dal.dao;

import org.apache.ibatis.annotations.Param;
import pub.developers.forum.infrastructure.dal.dataobject.UserFoodDO;

import java.util.List;

/**
 * @author 13
 * @create 2025.7
 * @desc
 **/
public interface UserFoodDAO {

    void insert(UserFoodDO userFoodDO);

    List<UserFoodDO> query(@Param("userId") Long userId);

    void deleteByPostsId(@Param("postsId") Long postsId);
}
