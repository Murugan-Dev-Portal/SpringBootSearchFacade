package au.com.test.inf.user.log.monitoring.repo.dto;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="USER")
public class UserDTO {

    @Id
    @GeneratedValue
    @Column(name="USER_ID", nullable=false, length=64)
    private String userId = null;

    @Column(name="EMAIL_ADDRESS", nullable=false, length=100)
    private String emailAddress = null;

    @Column(name="WORK_STATION_IP", nullable=false, length=15)
    private String workStationIP = null;

    public UserDTO(){
        this.userId = UUID.randomUUID().toString();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getWorkStationIP() {
        return workStationIP;
    }

    public void setWorkStationIP(String workStationIP) {
        this.workStationIP = workStationIP;
    }
}
