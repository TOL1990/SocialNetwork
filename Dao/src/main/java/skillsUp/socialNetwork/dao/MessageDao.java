package skillsUp.socialNetwork.dao;

import skillsUp.SocialNetwork.CoreApi.src.main.java.model.Message;
import skillsUp.socialNetwork.coreApi.model.MessageDto;
import skillsUp.socialNetwork.dao.entity.Contact;

import java.util.List;

/**
 * Created by Леонид on 26.10.2015.
 */
public interface MessageDao{
    public void storeMessage(MessageDto savingMessage);
    public List <MessageDto> getConvesetion (Contact first, Contact second);
}
