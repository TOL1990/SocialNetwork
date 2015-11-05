package skillsUp.socialNetwork.dao;


import skillsUp.socialNetwork.coreApi.model.ContactDto;

/**
 * Created by Леонид on 26.10.2015.
 */
public interface ContactDao {
    public void addContact(ContactDto contact);
    public void deleteContact(ContactDto contact);
    public void addFriendShip(ContactDto first, ContactDto second);
    public void removeFriendShip (ContactDto first, ContactDto second);
}
