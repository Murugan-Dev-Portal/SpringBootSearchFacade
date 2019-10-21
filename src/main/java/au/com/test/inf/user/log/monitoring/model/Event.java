package au.com.test.inf.user.log.monitoring.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;


/**
 * This object provides information about the different events linked to the user&#39;s activity on workstations.
 **/

/**
 * This object provides information about the different events linked to the user&#39;s activity on workstations.
 */
@ApiModel(description = "This object provides information about the different events linked to the user's activity on workstations.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2019-10-20T23:03:10.322+11:00")

public class Event   {

  private Long eventId;

  private String userId = null;

  private String type = null;

  private String time = null;

  private String emailAddress = null;

  private String workStationIP = null;

  public Event userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public Event type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Event time(String time) {
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @ApiModelProperty(value = "")
  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public Event emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * Get emailAddress
   * @return emailAddress
  **/
  @ApiModelProperty(value = "")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public Event workStationIP(String workStationIP) {
    this.workStationIP = workStationIP;
    return this;
  }

   /**
   * Get workStationIP
   * @return workStationIP
  **/
  @ApiModelProperty(value = "")
  public String getWorkStationIP() {
    return workStationIP;
  }

  public void setWorkStationIP(String workStationIP) {
    this.workStationIP = workStationIP;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(this.userId, event.userId) &&
        Objects.equals(this.type, event.type) &&
        Objects.equals(this.time, event.time) &&
        Objects.equals(this.emailAddress, event.emailAddress) &&
        Objects.equals(this.workStationIP, event.workStationIP);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, type, time, emailAddress, workStationIP);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    workStationIP: ").append(toIndentedString(workStationIP)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

