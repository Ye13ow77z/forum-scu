package pub.developers.forum.infrastructure.dal.dao;

import org.apache.ibatis.annotations.Param;
import pub.developers.forum.infrastructure.dal.dataobject.ArticleTypeDO;
import java.util.List;

/**
 * @author 13
 * @create 2025.7
 * @desc
 **/
public interface ArticleTypeDAO {

    void insert(ArticleTypeDO articleTypeDO);

    List<ArticleTypeDO> query(ArticleTypeDO articleTypeDO);

    List<ArticleTypeDO> queryInScopesAndState(@Param("scopes") List<String> scopes, @Param("auditState") String auditState);

    void update(ArticleTypeDO articleTypeDO);

    ArticleTypeDO get(@Param("id") Long id);

    void increaseRefCount(@Param("id") Long id);

    void decreaseRefCount(@Param("id") Long id);
}
