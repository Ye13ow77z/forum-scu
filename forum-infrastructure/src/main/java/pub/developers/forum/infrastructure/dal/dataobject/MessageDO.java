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
public class MessageDO extends BaseDO {

    private String channel;

    private String type;

    private String read;

    private String senderType;

    private String sender;

    private String receiverType;

    private String receiver;

    private String title;

    private String contentType;

    private String content;

}
