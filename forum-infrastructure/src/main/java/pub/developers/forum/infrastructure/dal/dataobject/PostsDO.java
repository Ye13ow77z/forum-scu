package pub.developers.forum.infrastructure.dal.dataobject;

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
public class PostsDO extends BaseDO {

    private String auditState;

    private String category;

    private Long authorId;

    private String title;

    private String contentType;

    private String markdownContent;

    private String htmlContent;

    private Long views;

    private Long approvals;

    private Long comments;

    private Long typeId;

    private String headImg;

    private Boolean official;

    private Boolean top;

    private Long sort;

    private Boolean marrow;

    private Long commentId;
}
