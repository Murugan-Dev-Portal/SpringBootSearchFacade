package au.com.test.inf.user.log.monitoring.model;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;


/**
 * EventFilter
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2019-10-20T23:03:10.322+11:00")

public class EventFilter   {
  /**
   * Gets or Sets attribute
   */
  public enum AttributeEnum {
    TYPE("type"),
    
    TIME("time"),
    
    EMAILADDRESS("emailAddress"),
    
    USERID("userId"),
    
    WORKSTATIONIP("workStationIP");

    private String value;

    AttributeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @NotNull
  private AttributeEnum attribute = null;

  /**
   * Gets or Sets operator
   */
  public enum OperatorEnum {
    EQ("eq"),
    
    GTE("gte"),
    
    LTE("lte"),
    
    LIKE("like");

    private String value;

    OperatorEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @NotNull
  private OperatorEnum operator = null;

  @NotNull
  private String value = null;

  private TimeRange range = null;

  public EventFilter attribute(AttributeEnum attribute) {
    this.attribute = attribute;
    return this;
  }

   /**
   * Get attribute
   * @return attribute
  **/
  @ApiModelProperty(value = "")
  public AttributeEnum getAttribute() {
    return attribute;
  }

  public void setAttribute(AttributeEnum attribute) {
    this.attribute = attribute;
  }

  public EventFilter operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Get operator
   * @return operator
  **/
  @ApiModelProperty(value = "")
  public OperatorEnum getOperator() {
    return operator;
  }

  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }

  public EventFilter value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public EventFilter range(TimeRange range) {
    this.range = range;
    return this;
  }

   /**
   * Get range
   * @return range
  **/
  @ApiModelProperty(value = "")
  public TimeRange getRange() {
    return range;
  }

  public void setRange(TimeRange range) {
    this.range = range;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventFilter eventFilter = (EventFilter) o;
    return Objects.equals(this.attribute, eventFilter.attribute) &&
        Objects.equals(this.operator, eventFilter.operator) &&
        Objects.equals(this.value, eventFilter.value) &&
        Objects.equals(this.range, eventFilter.range);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attribute, operator, value, range);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventFilter {\n");
    
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
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

