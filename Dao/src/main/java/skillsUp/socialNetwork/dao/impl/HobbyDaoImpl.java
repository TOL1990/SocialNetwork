package skillsUp.socialNetwork.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import skillsUp.socialNetwork.coreApi.model.HobbyDto;
import skillsUp.socialNetwork.dao.HobbyDao;
import skillsUp.socialNetwork.dao.entity.Contact;

import java.util.Set;

/**
 * Created by Леонид on 26.10.2015.
 */
@Repository
@Transactional(readOnly = true)
public class HobbyDaoImpl implements HobbyDao {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public void addHobby(HobbyDto hobby) {

    }

    @Override
    public Set<Contact> getAllContactsWithHobby(HobbyDto hobby) {
        return null;
    }
}
