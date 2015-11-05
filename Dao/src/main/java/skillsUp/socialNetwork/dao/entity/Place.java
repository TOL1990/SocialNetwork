package skillsUp.socialNetwork.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Тарас on 11.10.2015.
 */
@Entity
@Table(name = "PLACE")
public class Place {
    @Column(name = "TITLE")
    String title;
    @Column(name = "LONGITUDE")
    double longitude;
    @Column(name = "LATITUDE")
    double latitude;
    @Column(name = "DESCRIPTION")
    String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
