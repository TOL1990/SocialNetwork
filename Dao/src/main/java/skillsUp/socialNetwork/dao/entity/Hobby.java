package skillsUp.socialNetwork.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Тарас on 11.10.2015.
 */
@Entity
@Table(name = "HOBBIES")
public class Hobby {
    @Column(name = "HOBBY_NAME")
    String title;
    @Column(name = "HOBBY_DESCRIPTION")
    String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
