package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ServiceOrderItemRef;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;

import org.neo4j.ogm.annotation.Id;
import java.util.Date;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A ServiceOrderJeopardyAlert represents a predicted exception during a service order processing that would brings risk to complete successfully the ordetr.
 */
@Schema(description = "A ServiceOrderJeopardyAlert represents a predicted exception during a service order processing that would brings risk to complete successfully the ordetr.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-08-05T10:49:44.666Z[GMT]")


public class ServiceOrderJeopardyAlert   {
  @JsonProperty("id")
  @Id
  private String id;

  @JsonProperty("alertDate")
  private Date alertDate = null;

  @JsonProperty("exception")
  private String exception = null;

  @JsonProperty("jeopardyType")
  private String jeopardyType = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("serviceOrderItem")
  @Valid
  private List<ServiceOrderItemRef> serviceOrderItem = null;

  @JsonProperty("@baseType")
  private String _atBaseType = null;

  @JsonProperty("@schemaLocation")
  private String _atSchemaLocation = null;

  @JsonProperty("@type")
  private String _atType = null;

  public ServiceOrderJeopardyAlert id(String id) {
    this.id = id;
    return this;
  }

  /**
   * identifier of the JeopardyAlert
   * @return id
   **/
  @Schema(description = "identifier of the JeopardyAlert")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ServiceOrderJeopardyAlert alertDate(Date alertDate) {
    this.alertDate = alertDate;
    return this;
  }

  /**
   * A date time( DateTime). The date that the alert issued
   * @return alertDate
   **/
  @Schema(description = "A date time( DateTime). The date that the alert issued")
  
    @Valid
    public Date getAlertDate() {
    return alertDate;
  }

  public void setAlertDate(Date alertDate) {
    this.alertDate = alertDate;
  }

  public ServiceOrderJeopardyAlert exception(String exception) {
    this.exception = exception;
    return this;
  }

  /**
   *  The exception associated with this jeopardy alert
   * @return exception
   **/
  @Schema(description = " The exception associated with this jeopardy alert")
  
    public String getException() {
    return exception;
  }

  public void setException(String exception) {
    this.exception = exception;
  }

  public ServiceOrderJeopardyAlert jeopardyType(String jeopardyType) {
    this.jeopardyType = jeopardyType;
    return this;
  }

  /**
   * A string represents the type of jeopardy/risk like Normal, Hazard, Critical, ...
   * @return jeopardyType
   **/
  @Schema(description = "A string represents the type of jeopardy/risk like Normal, Hazard, Critical, ...")
  
    public String getJeopardyType() {
    return jeopardyType;
  }

  public void setJeopardyType(String jeopardyType) {
    this.jeopardyType = jeopardyType;
  }

  public ServiceOrderJeopardyAlert message(String message) {
    this.message = message;
    return this;
  }

  /**
   * A string represents the message of the alert
   * @return message
   **/
  @Schema(description = "A string represents the message of the alert")
  
    public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ServiceOrderJeopardyAlert name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A string used to give a name to the jeopardy alert
   * @return name
   **/
  @Schema(description = "A string used to give a name to the jeopardy alert")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ServiceOrderJeopardyAlert serviceOrderItem(List<ServiceOrderItemRef> serviceOrderItem) {
    this.serviceOrderItem = serviceOrderItem;
    return this;
  }

  public ServiceOrderJeopardyAlert addServiceOrderItemItem(ServiceOrderItemRef serviceOrderItemItem) {
    if (this.serviceOrderItem == null) {
      this.serviceOrderItem = new ArrayList<ServiceOrderItemRef>();
    }
    this.serviceOrderItem.add(serviceOrderItemItem);
    return this;
  }

  /**
   * A list of order item references corresponded to this alert
   * @return serviceOrderItem
   **/
  @Schema(description = "A list of order item references corresponded to this alert")
      @Valid
    public List<ServiceOrderItemRef> getServiceOrderItem() {
    return serviceOrderItem;
  }

  public void setServiceOrderItem(List<ServiceOrderItemRef> serviceOrderItem) {
    this.serviceOrderItem = serviceOrderItem;
  }

  public ServiceOrderJeopardyAlert _atBaseType(String _atBaseType) {
    this._atBaseType = _atBaseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return _atBaseType
   **/
  @Schema(description = "When sub-classing, this defines the super-class")
  
    public String getAtBaseType() {
    return _atBaseType;
  }

  public void setAtBaseType(String _atBaseType) {
    this._atBaseType = _atBaseType;
  }

  public ServiceOrderJeopardyAlert _atSchemaLocation(String _atSchemaLocation) {
    this._atSchemaLocation = _atSchemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return _atSchemaLocation
   **/
  @Schema(description = "A URI to a JSON-Schema file that defines additional attributes and relationships")
  
    public String getAtSchemaLocation() {
    return _atSchemaLocation;
  }

  public void setAtSchemaLocation(String _atSchemaLocation) {
    this._atSchemaLocation = _atSchemaLocation;
  }

  public ServiceOrderJeopardyAlert _atType(String _atType) {
    this._atType = _atType;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class Extensible name
   * @return _atType
   **/
  @Schema(description = "When sub-classing, this defines the sub-class Extensible name")
  
    public String getAtType() {
    return _atType;
  }

  public void setAtType(String _atType) {
    this._atType = _atType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceOrderJeopardyAlert serviceOrderJeopardyAlert = (ServiceOrderJeopardyAlert) o;
    return Objects.equals(this.id, serviceOrderJeopardyAlert.id) &&
        Objects.equals(this.alertDate, serviceOrderJeopardyAlert.alertDate) &&
        Objects.equals(this.exception, serviceOrderJeopardyAlert.exception) &&
        Objects.equals(this.jeopardyType, serviceOrderJeopardyAlert.jeopardyType) &&
        Objects.equals(this.message, serviceOrderJeopardyAlert.message) &&
        Objects.equals(this.name, serviceOrderJeopardyAlert.name) &&
        Objects.equals(this.serviceOrderItem, serviceOrderJeopardyAlert.serviceOrderItem) &&
        Objects.equals(this._atBaseType, serviceOrderJeopardyAlert._atBaseType) &&
        Objects.equals(this._atSchemaLocation, serviceOrderJeopardyAlert._atSchemaLocation) &&
        Objects.equals(this._atType, serviceOrderJeopardyAlert._atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, alertDate, exception, jeopardyType, message, name, serviceOrderItem, _atBaseType, _atSchemaLocation, _atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceOrderJeopardyAlert {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    alertDate: ").append(toIndentedString(alertDate)).append("\n");
    sb.append("    exception: ").append(toIndentedString(exception)).append("\n");
    sb.append("    jeopardyType: ").append(toIndentedString(jeopardyType)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    serviceOrderItem: ").append(toIndentedString(serviceOrderItem)).append("\n");
    sb.append("    _atBaseType: ").append(toIndentedString(_atBaseType)).append("\n");
    sb.append("    _atSchemaLocation: ").append(toIndentedString(_atSchemaLocation)).append("\n");
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
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
