package pub.developers.forum.facade.validator;

import pub.developers.forum.api.model.PageRequestModel;
import pub.developers.forum.common.support.CheckUtil;

/**
 * @author 13
 * @create 2025.7
 * @desc
 **/
public class PageRequestModelValidator {

    public static void validator(PageRequestModel pageRequestModel) {
        CheckUtil.checkParamToast(pageRequestModel, "pageRequestModel");
        CheckUtil.checkParamToast(pageRequestModel.getPageNo(), "pageNo");
        CheckUtil.checkParamToast(pageRequestModel.getPageSize(), "pageSize");
        CheckUtil.checkParamToast(pageRequestModel.getFilter(), "filter");
    }

}
