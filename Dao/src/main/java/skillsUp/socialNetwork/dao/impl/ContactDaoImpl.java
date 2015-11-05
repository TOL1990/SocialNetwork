package skillsUp.socialNetwork.dao.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.hibernate.SessionFactory;
import skillsUp.socialNetwork.coreApi.model.ContactDto;
import skillsUp.socialNetwork.dao.ContactDao;


/**
 * Created by Леонид on 26.10.2015.
 */
@Repository
@Transactional(readOnly = true)
public class ContactDaoImpl implements ContactDao{

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public void addContact(ContactDto contact) {

    }

    @Override
    public void deleteContact(ContactDto contact) {

    }

    @Override
    public void addFriendShip(ContactDto first, ContactDto second) {

    }

    @Override
    public void removeFriendShip(ContactDto first, ContactDto second) {

    }
}
