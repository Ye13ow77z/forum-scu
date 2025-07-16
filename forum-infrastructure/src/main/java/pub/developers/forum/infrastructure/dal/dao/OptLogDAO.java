package pub.developers.forum.infrastructure.dal.dao;

import pub.developers.forum.infrastructure.dal.dataobject.OptLogDO;

import java.util.List;

/**
 * @author 13
 * @create 2025.7
 * @desc
 **/
public interface OptLogDAO {

    void insert(OptLogDO optLogDO);

    List<OptLogDO> query(OptLogDO optLogDO);
}
