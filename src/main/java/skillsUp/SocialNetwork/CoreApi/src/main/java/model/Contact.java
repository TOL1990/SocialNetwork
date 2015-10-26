package skillsUp.SocialNetwork.CoreApi.src.main.java.model;

import java.time.LocalDate;
import java.util.Set;

/**
 * Created by Тарас on 11.10.2015.
 */
public class Contact {
    String firstName;
    String lastName;
    LocalDate birthDate;
    Set <Hobby> hobbies;
    Set <Place> places;
}
