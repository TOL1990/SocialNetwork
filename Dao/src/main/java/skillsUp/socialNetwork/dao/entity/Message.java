package skillsUp.socialNetwork.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * Created by Тарас on 11.10.2015.
 */
@Entity
@Table(name = "Message")
public class Message {
    @Column(name = "MESSAGE_TIME")
    LocalDateTime date;
    @Column(name = "FROM")
    Contact from;
    @Column(name = "TO")
    Contact to;
    @Column(name = "CONTENT")
    String content;

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Contact getFrom() {
        return from;
    }

    public void setFrom(Contact from) {
        this.from = from;
    }

    public Contact getTo() {
        return to;
    }

    public void setTo(Contact to) {
        this.to = to;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
