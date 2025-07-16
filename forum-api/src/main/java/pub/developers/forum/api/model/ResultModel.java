package pub.developers.forum.api.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Data;

/**
 * @author 13
 * @create 2025.7
 * @desc
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResultModel<T> {
    private Integer code = 200;
    private String message = "success";
    private Boolean success = Boolean.TRUE;
    private T data;
}
