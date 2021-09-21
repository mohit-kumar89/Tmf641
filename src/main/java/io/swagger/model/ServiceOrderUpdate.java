package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ExternalReference;
import io.swagger.model.Note;
import io.swagger.model.RelatedParty;
import io.swagger.model.ServiceOrderItem;
import io.swagger.model.ServiceOrderRelationship;
import io.swagger.model.ServiceOrderStateType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 *  Skipped properties: id,href,orderDate,jeopardyAlert,errorMessage,milestone,@baseType,@schemaLocation,@type,cancellationDate,cancellationReason,category,completionDate,startDate
 */
@Schema(description = " Skipped properties: id,href,orderDate,jeopardyAlert,errorMessage,milestone,@baseType,@schemaLocation,@type,cancellationDate,cancellationReason,category,completionDate,startDate")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-08-05T10:49:44.666Z[GMT]")


public class ServiceOrderUpdate   {
  @Id
  @GeneratedValue
  private Long id;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("expectedCompletionDate")
  private Date expectedCompletionDate = null;

  @JsonProperty("externalId")
  private String externalId = null;

  @JsonProperty("notificationContact")
  private String notificationContact = null;

  @JsonProperty("priority")
  private String priority = null;

  @JsonProperty("requestedCompletionDate")
  private Date requestedCompletionDate = null;

  @JsonProperty("requestedStartDate")
  private Date requestedStartDate = null;

  @JsonProperty("externalReference")
  @Valid
  private List<ExternalReference> externalReference = null;

  @JsonProperty("note")
  @Valid
  private List<Note> note = null;

  @JsonProperty("orderRelationship")
  @Valid
  private List<ServiceOrderRelationship> orderRelationship = null;

  @JsonProperty("relatedParty")
  @Valid
  private List<RelatedParty> relatedParty = null;

  @JsonProperty("serviceOrderItem")
  @Valid
  private List<ServiceOrderItem> serviceOrderItem = null;

  @JsonProperty("state")
  private ServiceOrderStateType state = null;

  public ServiceOrderUpdate description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A free-text description of the service order
   * @return description
   **/
  @Schema(description = "A free-text description of the service order")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ServiceOrderUpdate expectedCompletionDate(Date expectedCompletionDate) {
    this.expectedCompletionDate = expectedCompletionDate;
    return this;
  }

  /**
   * Expected delivery date amended by the provider
   * @return expectedCompletionDate
   **/
  @Schema(description = "Expected delivery date amended by the provider")
  
    @Valid
    public Date getExpectedCompletionDate() {
    return expectedCompletionDate;
  }

  public void setExpectedCompletionDate(Date expectedCompletionDate) {
    this.expectedCompletionDate = expectedCompletionDate;
  }

  public ServiceOrderUpdate externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * ID given by the consumer to facilitate searches
   * @return externalId
   **/
  @Schema(description = "ID given by the consumer to facilitate searches")
  
    public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public ServiceOrderUpdate notificationContact(String notificationContact) {
    this.notificationContact = notificationContact;
    return this;
  }

  /**
   * Contact attached to the order to send back information regarding this order
   * @return notificationContact
   **/
  @Schema(description = "Contact attached to the order to send back information regarding this order")
  
    public String getNotificationContact() {
    return notificationContact;
  }

  public void setNotificationContact(String notificationContact) {
    this.notificationContact = notificationContact;
  }

  public ServiceOrderUpdate priority(String priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Can be used by consumers to prioritize orders in a Service Order Management system
   * @return priority
   **/
  @Schema(description = "Can be used by consumers to prioritize orders in a Service Order Management system")
  
    public String getPriority() {
    return priority;
  }

  public void setPriority(String priority) {
    this.priority = priority;
  }

  public ServiceOrderUpdate requestedCompletionDate(Date requestedCompletionDate) {
    this.requestedCompletionDate = requestedCompletionDate;
    return this;
  }

  /**
   * Requested delivery date from the requestors perspective
   * @return requestedCompletionDate
   **/
  @Schema(description = "Requested delivery date from the requestors perspective")
  
    @Valid
    public Date getRequestedCompletionDate() {
    return requestedCompletionDate;
  }

  public void setRequestedCompletionDate(Date requestedCompletionDate) {
    this.requestedCompletionDate = requestedCompletionDate;
  }

  public ServiceOrderUpdate requestedStartDate(Date requestedStartDate) {
    this.requestedStartDate = requestedStartDate;
    return this;
  }

  /**
   * Order start date wished by the requestor
   * @return requestedStartDate
   **/
  @Schema(description = "Order start date wished by the requestor")
  
    @Valid
    public Date getRequestedStartDate() {
    return requestedStartDate;
  }

  public void setRequestedStartDate(Date requestedStartDate) {
    this.requestedStartDate = requestedStartDate;
  }

  public ServiceOrderUpdate externalReference(List<ExternalReference> externalReference) {
    this.externalReference = externalReference;
    return this;
  }

  public ServiceOrderUpdate addExternalReferenceItem(ExternalReference externalReferenceItem) {
    if (this.externalReference == null) {
      this.externalReference = new ArrayList<ExternalReference>();
    }
    this.externalReference.add(externalReferenceItem);
    return this;
  }

  /**
   * Get externalReference
   * @return externalReference
   **/
  @Schema(description = "")
      @Valid
    public List<ExternalReference> getExternalReference() {
    return externalReference;
  }

  public void setExternalReference(List<ExternalReference> externalReference) {
    this.externalReference = externalReference;
  }

  public ServiceOrderUpdate note(List<Note> note) {
    this.note = note;
    return this;
  }

  public ServiceOrderUpdate addNoteItem(Note noteItem) {
    if (this.note == null) {
      this.note = new ArrayList<Note>();
    }
    this.note.add(noteItem);
    return this;
  }

  /**
   * Extra-information about the order; e.g. useful to add extra delivery information that could be useful for a human process
   * @return note
   **/
  @Schema(description = "Extra-information about the order; e.g. useful to add extra delivery information that could be useful for a human process")
      @Valid
    public List<Note> getNote() {
    return note;
  }

  public void setNote(List<Note> note) {
    this.note = note;
  }

  public ServiceOrderUpdate orderRelationship(List<ServiceOrderRelationship> orderRelationship) {
    this.orderRelationship = orderRelationship;
    return this;
  }

  public ServiceOrderUpdate addOrderRelationshipItem(ServiceOrderRelationship orderRelationshipItem) {
    if (this.orderRelationship == null) {
      this.orderRelationship = new ArrayList<ServiceOrderRelationship>();
    }
    this.orderRelationship.add(orderRelationshipItem);
    return this;
  }

  /**
   * A list of service orders related to this order (e.g. prerequisite, dependent on)
   * @return orderRelationship
   **/
  @Schema(description = "A list of service orders related to this order (e.g. prerequisite, dependent on)")
      @Valid
    public List<ServiceOrderRelationship> getOrderRelationship() {
    return orderRelationship;
  }

  public void setOrderRelationship(List<ServiceOrderRelationship> orderRelationship) {
    this.orderRelationship = orderRelationship;
  }

  public ServiceOrderUpdate relatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public ServiceOrderUpdate addRelatedPartyItem(RelatedParty relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<RelatedParty>();
    }
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  /**
   * A list of parties which are involved in this order and the role they are playing
   * @return relatedParty
   **/
  @Schema(description = "A list of parties which are involved in this order and the role they are playing")
      @Valid
    public List<RelatedParty> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public ServiceOrderUpdate serviceOrderItem(List<ServiceOrderItem> serviceOrderItem) {
    this.serviceOrderItem = serviceOrderItem;
    return this;
  }

  public ServiceOrderUpdate addServiceOrderItemItem(ServiceOrderItem serviceOrderItemItem) {
    if (this.serviceOrderItem == null) {
      this.serviceOrderItem = new ArrayList<ServiceOrderItem>();
    }
    this.serviceOrderItem.add(serviceOrderItemItem);
    return this;
  }

  /**
   * A list of service order items to be processed by this order
   * @return serviceOrderItem
   **/
  @Schema(description = "A list of service order items to be processed by this order")
      @Valid
    public List<ServiceOrderItem> getServiceOrderItem() {
    return serviceOrderItem;
  }

  public void setServiceOrderItem(List<ServiceOrderItem> serviceOrderItem) {
    this.serviceOrderItem = serviceOrderItem;
  }

  public ServiceOrderUpdate state(ServiceOrderStateType state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   **/
  @Schema(description = "")
  
    @Valid
    public ServiceOrderStateType getState() {
    return state;
  }

  public void setState(ServiceOrderStateType state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceOrderUpdate serviceOrderUpdate = (ServiceOrderUpdate) o;
    return Objects.equals(this.description, serviceOrderUpdate.description) &&
        Objects.equals(this.expectedCompletionDate, serviceOrderUpdate.expectedCompletionDate) &&
        Objects.equals(this.externalId, serviceOrderUpdate.externalId) &&
        Objects.equals(this.notificationContact, serviceOrderUpdate.notificationContact) &&
        Objects.equals(this.priority, serviceOrderUpdate.priority) &&
        Objects.equals(this.requestedCompletionDate, serviceOrderUpdate.requestedCompletionDate) &&
        Objects.equals(this.requestedStartDate, serviceOrderUpdate.requestedStartDate) &&
        Objects.equals(this.externalReference, serviceOrderUpdate.externalReference) &&
        Objects.equals(this.note, serviceOrderUpdate.note) &&
        Objects.equals(this.orderRelationship, serviceOrderUpdate.orderRelationship) &&
        Objects.equals(this.relatedParty, serviceOrderUpdate.relatedParty) &&
        Objects.equals(this.serviceOrderItem, serviceOrderUpdate.serviceOrderItem) &&
        Objects.equals(this.state, serviceOrderUpdate.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, expectedCompletionDate, externalId, notificationContact, priority, requestedCompletionDate, requestedStartDate, externalReference, note, orderRelationship, relatedParty, serviceOrderItem, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceOrderUpdate {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expectedCompletionDate: ").append(toIndentedString(expectedCompletionDate)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    notificationContact: ").append(toIndentedString(notificationContact)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    requestedCompletionDate: ").append(toIndentedString(requestedCompletionDate)).append("\n");
    sb.append("    requestedStartDate: ").append(toIndentedString(requestedStartDate)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    orderRelationship: ").append(toIndentedString(orderRelationship)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    serviceOrderItem: ").append(toIndentedString(serviceOrderItem)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
