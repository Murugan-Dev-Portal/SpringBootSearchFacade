package au.com.test.inf.user.log.monitoring.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;


/**
 * User information
 */
@ApiModel(description = "User information")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2019-10-20T23:03:10.322+11:00")

public class User   {
  private String id = null;

  private String emailAddress = null;

  private String workStationIP = null;

  public User id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public User emailAddress(String emailAddress) {
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

  public User workStationIP(String workStationIP) {
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
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.emailAddress, user.emailAddress) &&
        Objects.equals(this.workStationIP, user.workStationIP);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, emailAddress, workStationIP);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

