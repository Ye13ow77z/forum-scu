package pub.developers.forum.domain.service;

import pub.developers.forum.domain.entity.Message;

/**
 * @author 13
 * @create 2025.7/12/7
 * @desc
 **/
public interface MailService {

    void sendHtml(Message mailMessage);

    void sendText(Message mailMessage);

}
