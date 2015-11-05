package skillsUp.socialNetwork.coreApi.model;

import java.time.LocalDate;
import java.util.Set;

/**
 * Created by Тарас on 11.10.2015.
 */
public class ContactDto {
    String firstName;
    String lastName;
    LocalDate birthDate;
    Set <HobbyDto> hobbies;
    Set <PlaceDto> places;
}
