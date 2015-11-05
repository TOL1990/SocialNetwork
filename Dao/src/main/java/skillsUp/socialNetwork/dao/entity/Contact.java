package skillsUp.socialNetwork.dao.entity;

import java.time.LocalDate;
import java.util.Set;
import javax.persistence.*;


/**
 * Created by Тарас on 11.10.2015.
 */
@Entity
@Table(name = "CONTACT")
public class Contact {

    @Column (name = "FIRST_NAME")
    String firstName;
    @Column (name = "LAST_NAME")
    String lastName;
    @Column (name = "BIRTHDAY")
    LocalDate birthDate;
    @ManyToMany
    Set <Hobby> hobbies;
    @ManyToMany
    Set <Place> places;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Set<Hobby> getHobbies() {
        return hobbies;
    }

    public Set<Place> getPlaces() {
        return places;
    }
}
