package pub.developers.forum.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

/**
 * @author 13
 * @create 2025.7
 * @desc
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Faq extends BasePosts {

    /**
     * 最佳答案 ID
     */
    private Long solutionId;

    public Faq copy() {
        Faq faq = new Faq();

        BeanUtils.copyProperties(this, faq);

        return faq;
    }

}
