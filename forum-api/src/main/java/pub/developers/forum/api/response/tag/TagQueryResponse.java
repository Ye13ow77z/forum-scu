package pub.developers.forum.api.response.tag;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author 13
 * @create 2025.7
 * @desc
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TagQueryResponse implements Serializable {

    private Long id;

    private String groupName;

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    private Long refCount;

}
