package skillsUp.socialNetwork.dao;

import skillsUp.SocialNetwork.CoreApi.src.main.java.model.Hobby;
import skillsUp.socialNetwork.coreApi.model.HobbyDto;
import skillsUp.socialNetwork.dao.entity.Contact;

import java.util.Set;

/**
 * Created by Леонид on 26.10.2015.
 */
public interface HobbyDao {
    public void addHobby(HobbyDto hobby);
    public Set<Contact> getAllContactsWithHobby(HobbyDto hobby);

}
