package skillsUp.socialNetwork.coreImpl.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import skillsUp.socialNetwork.dao.*;
import skillsUp.socialNetwork.coreApi.model.ContactDto;
//import  skillsUp.socialNetwork.coreApi.model.*;
import skillsUp.socialNetwork.coreApi.model.MessageDto;
import skillsUp.socialNetwork.coreApi.service.JavaContactService;
import skillsUp.socialNetwork.dao.ContactDao;
import skillsUp.socialNetwork.dao.HobbyDao;
import skillsUp.socialNetwork.dao.MessageDao;
import skillsUp.socialNetwork.dao.PlaceDao;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

/**
 * Created by Леонид on 26.10.2015.
 */
@Service
public class JavaContactServiceImpl implements JavaContactService {

    @Autowired
    private ContactDao contactDao;
    @Autowired
    private HobbyDao hobbyDao;
    @Autowired
    private PlaceDao placeDao;
    @Autowired
    private MessageDao messageDao;

    @Override
    public void createContac(String firstName, String lastName, LocalDate birthDay) {
       // System.out.println("createContac");
    }

    @Override
    public void addHobby(String title, String description) {

    }

    @Override
    public void addPlace(String title, String description, double longitude, double latitude) {

    }

    @Override
    public void addFriendShip(ContactDto first, ContactDto second) {

    }

    @Override
    public List<MessageDto> getConversation(ContactDto firstSpeaker, ContactDto seondSpeaker) {
        return null;
    }

    @Override
    public Set<ContactDto> getFriendList(ContactDto person) {
        return null;
    }
}
