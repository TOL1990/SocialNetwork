package skillsUp.socialNetwork.dao;

import skillsUp.SocialNetwork.CoreApi.src.main.java.model.Place;
import skillsUp.socialNetwork.coreApi.model.PlaceDto;
import skillsUp.socialNetwork.dao.entity.Contact;

import java.util.Set;

/**
 * Created by Леонид on 26.10.2015.
 */
public interface PlaceDao {
    public void addPlace(PlaceDto place);
    public Set<Contact> getAllContactsForPlace(PlaceDto place);
}
