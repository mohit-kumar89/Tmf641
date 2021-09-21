package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ServiceOrderItemRef;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import java.util.Date;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A ServiceOrderErrorMessage represents an error that causes a status change in a service order.
 */
@Schema(description = "A ServiceOrderErrorMessage represents an error that causes a status change in a service order.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-08-05T10:49:44.666Z[GMT]")


public class ServiceOrderErrorMessage   {
  @JsonProperty("id")
  @Id @GeneratedValue
  private Long id;

  @JsonProperty("code")
  private String code;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("reason")
  private String reason = null;

  @JsonProperty("referenceError")
  private String referenceError = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("timestamp")
  private Date timestamp = null;

  @JsonProperty("serviceOrderItem")
  @Valid
  private List<ServiceOrderItemRef> serviceOrderItem = null;

  @JsonProperty("@baseType")
  private String _atBaseType = null;

  @JsonProperty("@schemaLocation")
  private String _atSchemaLocation = null;

  @JsonProperty("@type")
  private String _atType = null;

  public ServiceOrderErrorMessage code(String code) {
    this.code = code;
    return this;
  }

  /**
   * error code
   * @return code
   **/
  @Schema(description = "error code")
  
    public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ServiceOrderErrorMessage message(String message) {
    this.message = message;
    return this;
  }

  /**
   * More details and corrective actions related to the error
   * @return message
   **/
  @Schema(description = "More details and corrective actions related to the error")
  
    public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ServiceOrderErrorMessage reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Explanation of the reason for the error
   * @return reason
   **/
  @Schema(description = "Explanation of the reason for the error")
  
    public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public ServiceOrderErrorMessage referenceError(String referenceError) {
    this.referenceError = referenceError;
    return this;
  }

  /**
   * URI of documentation describing the error
   * @return referenceError
   **/
  @Schema(description = "URI of documentation describing the error")
  
    public String getReferenceError() {
    return referenceError;
  }

  public void setReferenceError(String referenceError) {
    this.referenceError = referenceError;
  }

  public ServiceOrderErrorMessage status(String status) {
    this.status = status;
    return this;
  }

  /**
   * error code extension like sys-ABC-2001
   * @return status
   **/
  @Schema(description = "error code extension like sys-ABC-2001")
  
    public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ServiceOrderErrorMessage timestamp(Date timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Date when the error happened
   * @return timestamp
   **/
  @Schema(description = "Date when the error happened")
  
    @Valid
    public Date getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  public ServiceOrderErrorMessage serviceOrderItem(List<ServiceOrderItemRef> serviceOrderItem) {
    this.serviceOrderItem = serviceOrderItem;
    return this;
  }

  public ServiceOrderErrorMessage addServiceOrderItemItem(ServiceOrderItemRef serviceOrderItemItem) {
    if (this.serviceOrderItem == null) {
      this.serviceOrderItem = new ArrayList<ServiceOrderItemRef>();
    }
    this.serviceOrderItem.add(serviceOrderItemItem);
    return this;
  }

  /**
   * A list of order item references corresponded to this error
   * @return serviceOrderItem
   **/
  @Schema(description = "A list of order item references corresponded to this error")
      @Valid
    public List<ServiceOrderItemRef> getServiceOrderItem() {
    return serviceOrderItem;
  }

  public void setServiceOrderItem(List<ServiceOrderItemRef> serviceOrderItem) {
    this.serviceOrderItem = serviceOrderItem;
  }

  public ServiceOrderErrorMessage _atBaseType(String _atBaseType) {
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

  public ServiceOrderErrorMessage _atSchemaLocation(String _atSchemaLocation) {
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

  public ServiceOrderErrorMessage _atType(String _atType) {
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
    ServiceOrderErrorMessage serviceOrderErrorMessage = (ServiceOrderErrorMessage) o;
    return Objects.equals(this.code, serviceOrderErrorMessage.code) &&
        Objects.equals(this.message, serviceOrderErrorMessage.message) &&
        Objects.equals(this.reason, serviceOrderErrorMessage.reason) &&
        Objects.equals(this.referenceError, serviceOrderErrorMessage.referenceError) &&
        Objects.equals(this.status, serviceOrderErrorMessage.status) &&
        Objects.equals(this.timestamp, serviceOrderErrorMessage.timestamp) &&
        Objects.equals(this.serviceOrderItem, serviceOrderErrorMessage.serviceOrderItem) &&
        Objects.equals(this._atBaseType, serviceOrderErrorMessage._atBaseType) &&
        Objects.equals(this._atSchemaLocation, serviceOrderErrorMessage._atSchemaLocation) &&
        Objects.equals(this._atType, serviceOrderErrorMessage._atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, reason, referenceError, status, timestamp, serviceOrderItem, _atBaseType, _atSchemaLocation, _atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceOrderErrorMessage {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    referenceError: ").append(toIndentedString(referenceError)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
