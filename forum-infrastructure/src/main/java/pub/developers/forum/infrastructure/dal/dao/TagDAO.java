package pub.developers.forum.infrastructure.dal.dao;

import org.apache.ibatis.annotations.Param;
import pub.developers.forum.infrastructure.dal.dataobject.TagDO;

import java.util.List;
import java.util.Set;

/**
 * @author 13
 * @create 2025.7
 * @desc
 **/
public interface TagDAO {

    void insert(TagDO tagDO);

    List<TagDO> query(TagDO tagDO);

    void update(TagDO tagDO);

    List<TagDO> queryInIds(@Param("ids") Set<Long> ids);

    void increaseRefCount(@Param("ids") Set<Long> ids);

    void decreaseRefCount(@Param("ids") Set<Long> ids);

    TagDO get(Long id);
}
