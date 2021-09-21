package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AppointmentRef;
import io.swagger.model.OrderItemActionType;
import io.swagger.model.ServiceOrderItem;
import io.swagger.model.ServiceOrderItemErrorMessage;
import io.swagger.model.ServiceOrderItemRelationship;
import io.swagger.model.ServiceOrderItemStateType;
import io.swagger.model.ServiceRefOrValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;

import org.neo4j.ogm.annotation.Id;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ServiceOrderItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-08-05T10:49:44.666Z[GMT]")


public class ServiceOrderItem   {
  @JsonProperty("id")
  @Id
  private String id;

  @JsonProperty("quantity")
  private Integer quantity = null;

  @JsonProperty("action")
  private OrderItemActionType action = null;

  @JsonProperty("appointment")
  private AppointmentRef appointment = null;

  @JsonProperty("errorMessage")
  @Valid
  private List<ServiceOrderItemErrorMessage> errorMessage = null;

  @JsonProperty("service")
  private ServiceRefOrValue service = null;

  @JsonProperty("serviceOrderItem")
  @Valid
  private List<ServiceOrderItem> serviceOrderItem;

  @JsonProperty("serviceOrderItemRelationship")
  @Valid
  private List<ServiceOrderItemRelationship> serviceOrderItemRelationship = null;

  @JsonProperty("state")
  private ServiceOrderItemStateType state = null;

  @JsonProperty("@baseType")
  private String _atBaseType = null;

  @JsonProperty("@schemaLocation")
  private String _atSchemaLocation = null;

  @JsonProperty("@type")
  private String _atType = null;

  public ServiceOrderItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifier of the individual line item
   * @return id
   **/
  @Schema(required = true, description = "Identifier of the individual line item")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ServiceOrderItem quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Quantity ordered
   * @return quantity
   **/
  @Schema(description = "Quantity ordered")
  
    public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public ServiceOrderItem action(OrderItemActionType action) {
    this.action = action;
    return this;
  }

  /**
   * Get action
   * @return action
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public OrderItemActionType getAction() {
    return action;
  }

  public void setAction(OrderItemActionType action) {
    this.action = action;
  }

  public ServiceOrderItem appointment(AppointmentRef appointment) {
    this.appointment = appointment;
    return this;
  }

  /**
   * Get appointment
   * @return appointment
   **/
  @Schema(description = "")
  
    @Valid
    public AppointmentRef getAppointment() {
    return appointment;
  }

  public void setAppointment(AppointmentRef appointment) {
    this.appointment = appointment;
  }

  public ServiceOrderItem errorMessage(List<ServiceOrderItemErrorMessage> errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  public ServiceOrderItem addErrorMessageItem(ServiceOrderItemErrorMessage errorMessageItem) {
    if (this.errorMessage == null) {
      this.errorMessage = new ArrayList<ServiceOrderItemErrorMessage>();
    }
    this.errorMessage.add(errorMessageItem);
    return this;
  }

  /**
   * the error(s) cause an order item status change
   * @return errorMessage
   **/
  @Schema(description = "the error(s) cause an order item status change")
      @Valid
    public List<ServiceOrderItemErrorMessage> getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(List<ServiceOrderItemErrorMessage> errorMessage) {
    this.errorMessage = errorMessage;
  }

  public ServiceOrderItem service(ServiceRefOrValue service) {
    this.service = service;
    return this;
  }

  /**
   * Get service
   * @return service
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public ServiceRefOrValue getService() {
    return service;
  }

  public void setService(ServiceRefOrValue service) {
    this.service = service;
  }

  public ServiceOrderItem serviceOrderItem(List<ServiceOrderItem> serviceOrderItem) {
    this.serviceOrderItem = serviceOrderItem;
    return this;
  }

  public ServiceOrderItem addServiceOrderItemItem(ServiceOrderItem serviceOrderItemItem) {
    if (this.serviceOrderItem == null) {
      this.serviceOrderItem = new ArrayList<ServiceOrderItem>();
    }
    this.serviceOrderItem.add(serviceOrderItemItem);
    return this;
  }

  /**
   * A list of order items embedded to this order item
   * @return serviceOrderItem
   **/
  @Schema(description = "A list of order items embedded to this order item")
      @Valid
    public List<ServiceOrderItem> getServiceOrderItem() {
    return serviceOrderItem;
  }

  public void setServiceOrderItem(List<ServiceOrderItem> serviceOrderItem) {
    this.serviceOrderItem = serviceOrderItem;
  }

  public ServiceOrderItem serviceOrderItemRelationship(List<ServiceOrderItemRelationship> serviceOrderItemRelationship) {
    this.serviceOrderItemRelationship = serviceOrderItemRelationship;
    return this;
  }

  public ServiceOrderItem addServiceOrderItemRelationshipItem(ServiceOrderItemRelationship serviceOrderItemRelationshipItem) {
    if (this.serviceOrderItemRelationship == null) {
      this.serviceOrderItemRelationship = new ArrayList<ServiceOrderItemRelationship>();
    }
    this.serviceOrderItemRelationship.add(serviceOrderItemRelationshipItem);
    return this;
  }

  /**
   * A list of order items related to this order item
   * @return serviceOrderItemRelationship
   **/
  @Schema(description = "A list of order items related to this order item")
      @Valid
    public List<ServiceOrderItemRelationship> getServiceOrderItemRelationship() {
    return serviceOrderItemRelationship;
  }

  public void setServiceOrderItemRelationship(List<ServiceOrderItemRelationship> serviceOrderItemRelationship) {
    this.serviceOrderItemRelationship = serviceOrderItemRelationship;
  }

  public ServiceOrderItem state(ServiceOrderItemStateType state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   **/
  @Schema(description = "")
  
    @Valid
    public ServiceOrderItemStateType getState() {
    return state;
  }

  public void setState(ServiceOrderItemStateType state) {
    this.state = state;
  }

  public ServiceOrderItem _atBaseType(String _atBaseType) {
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

  public ServiceOrderItem _atSchemaLocation(String _atSchemaLocation) {
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

  public ServiceOrderItem _atType(String _atType) {
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
    ServiceOrderItem serviceOrderItem = (ServiceOrderItem) o;
    return Objects.equals(this.id, serviceOrderItem.id) &&
        Objects.equals(this.quantity, serviceOrderItem.quantity) &&
        Objects.equals(this.action, serviceOrderItem.action) &&
        Objects.equals(this.appointment, serviceOrderItem.appointment) &&
        Objects.equals(this.errorMessage, serviceOrderItem.errorMessage) &&
        Objects.equals(this.service, serviceOrderItem.service) &&
        Objects.equals(this.serviceOrderItem, serviceOrderItem.serviceOrderItem) &&
        Objects.equals(this.serviceOrderItemRelationship, serviceOrderItem.serviceOrderItemRelationship) &&
        Objects.equals(this.state, serviceOrderItem.state) &&
        Objects.equals(this._atBaseType, serviceOrderItem._atBaseType) &&
        Objects.equals(this._atSchemaLocation, serviceOrderItem._atSchemaLocation) &&
        Objects.equals(this._atType, serviceOrderItem._atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, quantity, action, appointment, errorMessage, service, serviceOrderItem, serviceOrderItemRelationship, state, _atBaseType, _atSchemaLocation, _atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceOrderItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    appointment: ").append(toIndentedString(appointment)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    serviceOrderItem: ").append(toIndentedString(serviceOrderItem)).append("\n");
    sb.append("    serviceOrderItemRelationship: ").append(toIndentedString(serviceOrderItemRelationship)).append("\n");
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
