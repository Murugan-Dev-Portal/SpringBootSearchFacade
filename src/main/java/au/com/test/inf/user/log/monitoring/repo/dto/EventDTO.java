package au.com.test.inf.user.log.monitoring.repo.dto;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name="EVENT")
public class EventDTO {

    @Id
    @GeneratedValue
    @Column(name="EVENT_ID", nullable=false, length=64)
    private String eventId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "USER_ID")
    private UserDTO user = null;

    @Column(name="EVENT_TYPE", nullable=false, length=20)
    private String eventType = null;

    @Column(name="EVENT_TIME", nullable=false)
    private LocalDateTime eventTime = null;

    public EventDTO(){
        this.eventId = UUID.randomUUID().toString();
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public LocalDateTime getEventTime() {
        return eventTime;
    }

    public void setEventTime(LocalDateTime eventTime) {
        this.eventTime = eventTime;
    }
}
