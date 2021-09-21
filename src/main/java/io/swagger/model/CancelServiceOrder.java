package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ErrorMessage;
import io.swagger.model.ServiceOrderRef;
import io.swagger.model.TaskStateType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Date;

import org.neo4j.ogm.annotation.Id;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Request for cancellation an existing Service order
 */
@Schema(description = "Request for cancellation an existing Service order")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-08-05T10:49:44.666Z[GMT]")


public class CancelServiceOrder   {
  @JsonProperty("id")
  @Id
  private String id;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("cancellationReason")
  private String cancellationReason = null;

  @JsonProperty("completionMessage")
  private String completionMessage = null;

  @JsonProperty("effectiveCancellationDate")
  private Date effectiveCancellationDate = null;

  @JsonProperty("requestedCancellationDate")
  private Date requestedCancellationDate = null;

  @JsonProperty("errorMessage")
  private ErrorMessage errorMessage = null;

  @JsonProperty("serviceOrder")
  private ServiceOrderRef serviceOrder = null;

  @JsonProperty("state")
  private TaskStateType state = null;

  @JsonProperty("@baseType")
  private String _atBaseType = null;

  @JsonProperty("@schemaLocation")
  private String _atSchemaLocation = null;

  @JsonProperty("@type")
  private String _atType = null;

  public CancelServiceOrder id(String id) {
    this.id = id;
    return this;
  }

  /**
   * unique identifier
   * @return id
   **/
  @Schema(description = "unique identifier")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CancelServiceOrder href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Hyperlink reference
   * @return href
   **/
  @Schema(description = "Hyperlink reference")
  
    public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public CancelServiceOrder cancellationReason(String cancellationReason) {
    this.cancellationReason = cancellationReason;
    return this;
  }

  /**
   * Reason why the order is cancelled.
   * @return cancellationReason
   **/
  @Schema(description = "Reason why the order is cancelled.")
  
    public String getCancellationReason() {
    return cancellationReason;
  }

  public void setCancellationReason(String cancellationReason) {
    this.cancellationReason = cancellationReason;
  }

  public CancelServiceOrder completionMessage(String completionMessage) {
    this.completionMessage = completionMessage;
    return this;
  }

  /**
   * an optional message describing the completion of the task if it is done as expected or it is denied for a reason (like order in an state of PoNR).
   * @return completionMessage
   **/
  @Schema(description = "an optional message describing the completion of the task if it is done as expected or it is denied for a reason (like order in an state of PoNR).")
  
    public String getCompletionMessage() {
    return completionMessage;
  }

  public void setCompletionMessage(String completionMessage) {
    this.completionMessage = completionMessage;
  }

  public CancelServiceOrder effectiveCancellationDate(Date effectiveCancellationDate) {
    this.effectiveCancellationDate = effectiveCancellationDate;
    return this;
  }

  /**
   * Date when the order is cancelled.
   * @return effectiveCancellationDate
   **/
  @Schema(description = "Date when the order is cancelled.")
  
    @Valid
    public Date getEffectiveCancellationDate() {
    return effectiveCancellationDate;
  }

  public void setEffectiveCancellationDate(Date effectiveCancellationDate) {
    this.effectiveCancellationDate = effectiveCancellationDate;
  }

  public CancelServiceOrder requestedCancellationDate(Date requestedCancellationDate) {
    this.requestedCancellationDate = requestedCancellationDate;
    return this;
  }

  /**
   * Date when the submitter wants the order to be cancelled
   * @return requestedCancellationDate
   **/
  @Schema(description = "Date when the submitter wants the order to be cancelled")
  
    @Valid
    public Date getRequestedCancellationDate() {
    return requestedCancellationDate;
  }

  public void setRequestedCancellationDate(Date requestedCancellationDate) {
    this.requestedCancellationDate = requestedCancellationDate;
  }

  public CancelServiceOrder errorMessage(ErrorMessage errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Get errorMessage
   * @return errorMessage
   **/
  @Schema(description = "")
  
    @Valid
    public ErrorMessage getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(ErrorMessage errorMessage) {
    this.errorMessage = errorMessage;
  }

  public CancelServiceOrder serviceOrder(ServiceOrderRef serviceOrder) {
    this.serviceOrder = serviceOrder;
    return this;
  }

  /**
   * Get serviceOrder
   * @return serviceOrder
   **/
  @Schema(description = "")
  
    @Valid
    public ServiceOrderRef getServiceOrder() {
    return serviceOrder;
  }

  public void setServiceOrder(ServiceOrderRef serviceOrder) {
    this.serviceOrder = serviceOrder;
  }

  public CancelServiceOrder state(TaskStateType state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   **/
  @Schema(description = "")
  
    @Valid
    public TaskStateType getState() {
    return state;
  }

  public void setState(TaskStateType state) {
    this.state = state;
  }

  public CancelServiceOrder _atBaseType(String _atBaseType) {
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

  public CancelServiceOrder _atSchemaLocation(String _atSchemaLocation) {
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

  public CancelServiceOrder _atType(String _atType) {
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
    CancelServiceOrder cancelServiceOrder = (CancelServiceOrder) o;
    return Objects.equals(this.id, cancelServiceOrder.id) &&
        Objects.equals(this.href, cancelServiceOrder.href) &&
        Objects.equals(this.cancellationReason, cancelServiceOrder.cancellationReason) &&
        Objects.equals(this.completionMessage, cancelServiceOrder.completionMessage) &&
        Objects.equals(this.effectiveCancellationDate, cancelServiceOrder.effectiveCancellationDate) &&
        Objects.equals(this.requestedCancellationDate, cancelServiceOrder.requestedCancellationDate) &&
        Objects.equals(this.errorMessage, cancelServiceOrder.errorMessage) &&
        Objects.equals(this.serviceOrder, cancelServiceOrder.serviceOrder) &&
        Objects.equals(this.state, cancelServiceOrder.state) &&
        Objects.equals(this._atBaseType, cancelServiceOrder._atBaseType) &&
        Objects.equals(this._atSchemaLocation, cancelServiceOrder._atSchemaLocation) &&
        Objects.equals(this._atType, cancelServiceOrder._atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, cancellationReason, completionMessage, effectiveCancellationDate, requestedCancellationDate, errorMessage, serviceOrder, state, _atBaseType, _atSchemaLocation, _atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelServiceOrder {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    cancellationReason: ").append(toIndentedString(cancellationReason)).append("\n");
    sb.append("    completionMessage: ").append(toIndentedString(completionMessage)).append("\n");
    sb.append("    effectiveCancellationDate: ").append(toIndentedString(effectiveCancellationDate)).append("\n");
    sb.append("    requestedCancellationDate: ").append(toIndentedString(requestedCancellationDate)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    serviceOrder: ").append(toIndentedString(serviceOrder)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
