package pub.developers.forum.domain.repository;

import pub.developers.forum.common.model.PageRequest;
import pub.developers.forum.common.model.PageResult;
import pub.developers.forum.domain.entity.OptLog;

/**
 * @author 13
 * @create 2025.7
 * @desc
 **/
public interface OptLogRepository {

    void save(OptLog optLog);

    PageResult<OptLog> page(PageRequest<OptLog> pageRequest);
}
