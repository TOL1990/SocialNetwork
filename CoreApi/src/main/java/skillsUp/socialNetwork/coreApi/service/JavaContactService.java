package skillsUp.socialNetwork.coreApi.service;


import skillsUp.socialNetwork.coreApi.model.ContactDto;
import skillsUp.socialNetwork.coreApi.model.MessageDto;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

/**
 * Created by Леонид on 26.10.2015.
 */
public interface JavaContactService {
    public void createContac(String firstName, String lastName, LocalDate birthDay);
    public void addHobby(String title, String description);
    public void addPlace(String title, String description, double longitude, double latitude);
    public void addFriendShip(ContactDto first, ContactDto second);
    List<MessageDto> getConversation (ContactDto firstSpeaker, ContactDto seondSpeaker);
    Set<ContactDto> getFriendList(ContactDto person);
}
