package skillsUp.socialNetwork.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import skillsUp.socialNetwork.coreApi.model.PlaceDto;
import skillsUp.socialNetwork.dao.PlaceDao;
import skillsUp.socialNetwork.dao.entity.Contact;

import java.util.Set;

/**
 * Created by Леонид on 26.10.2015.
 */
@Repository
@Transactional(readOnly = true)
public class PlaceDaoImpl implements PlaceDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addPlace(PlaceDto place) {

    }

    @Override
    public Set<Contact> getAllContactsForPlace(PlaceDto place) {
        return null;
    }
}
