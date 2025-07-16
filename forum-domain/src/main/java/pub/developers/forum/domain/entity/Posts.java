package pub.developers.forum.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 13
 * @create 2025.7
 * @desc
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Posts extends BasePosts {

    private ArticleType type;

    private String headImg;

    private Boolean official;

    private Boolean top;

    private Long sort;

    private Boolean marrow;

    /**
     * 最佳答案 ID
     */
    private Long solutionId;
}
