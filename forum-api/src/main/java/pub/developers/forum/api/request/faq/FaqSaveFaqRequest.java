package pub.developers.forum.api.request.faq;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Set;

/**
 * @author 13
 * @create 2025.7
 * @desc
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FaqSaveFaqRequest implements Serializable {

    private Long id;

    private String title;

    private String contentType;

    private String markdownContent;

    private String htmlContent;

    private Set<Long> tagIds;

}
