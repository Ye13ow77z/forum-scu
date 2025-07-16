package pub.developers.forum.common.support;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 13
 * @create 2025.7
 * @desc
 **/
public class DateUtil {

    public static String toyyyyMMddHHmmss(Date date) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
    }
}
