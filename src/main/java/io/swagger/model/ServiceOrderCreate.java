package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ExternalReference;
import io.swagger.model.Note;
import io.swagger.model.RelatedParty;
import io.swagger.model.ServiceOrderItem;
import io.swagger.model.ServiceOrderRelationship;
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
 *  Skipped properties: id,href,orderDate,completionDate,expectedCompletionDate,startDate,state,jeopardyAlert,errorMessage,milestone
 */
@Schema(description = " Skipped properties: id,href,orderDate,completionDate,expectedCompletionDate,startDate,state,jeopardyAlert,errorMessage,milestone")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-08-05T10:49:44.666Z[GMT]")


public class ServiceOrderCreate   {
  @JsonProperty("id")
  @Id
  @GeneratedValue
  private Long id;

  @JsonProperty("cancellationDate")
  private Date cancellationDate = null;

  @JsonProperty("cancellationReason")
  private String cancellationReason = null;

  @JsonProperty("category")
  private String category = null;

  @JsonProperty("description")
  private String description = null;

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
  private List<ServiceOrderItem> serviceOrderItem = new ArrayList<ServiceOrderItem>();

  @JsonProperty("@baseType")
  private String _atBaseType = null;

  @JsonProperty("@schemaLocation")
  private String _atSchemaLocation = null;

  @JsonProperty("@type")
  private String _atType = null;

  public ServiceOrderCreate cancellationDate(Date cancellationDate) {
    this.cancellationDate = cancellationDate;
    return this;
  }

  /**
   * Date when the order is cancelled. This is used when order is cancelled. 
   * @return cancellationDate
   **/
  @Schema(description = "Date when the order is cancelled. This is used when order is cancelled. ")
  
    @Valid
    public Date getCancellationDate() {
    return cancellationDate;
  }

  public void setCancellationDate(Date cancellationDate) {
    this.cancellationDate = cancellationDate;
  }

  public ServiceOrderCreate cancellationReason(String cancellationReason) {
    this.cancellationReason = cancellationReason;
    return this;
  }

  /**
   * Reason why the order is cancelled. This is used when order is cancelled. 
   * @return cancellationReason
   **/
  @Schema(description = "Reason why the order is cancelled. This is used when order is cancelled. ")
  
    public String getCancellationReason() {
    return cancellationReason;
  }

  public void setCancellationReason(String cancellationReason) {
    this.cancellationReason = cancellationReason;
  }

  public ServiceOrderCreate category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Used to categorize the order, useful for the OM system, such as: Broadband, TVOption
   * @return category
   **/
  @Schema(description = "Used to categorize the order, useful for the OM system, such as: Broadband, TVOption")
  
    public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public ServiceOrderCreate description(String description) {
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

  public ServiceOrderCreate externalId(String externalId) {
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

  public ServiceOrderCreate notificationContact(String notificationContact) {
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

  public ServiceOrderCreate priority(String priority) {
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

  public ServiceOrderCreate requestedCompletionDate(Date requestedCompletionDate) {
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

  public ServiceOrderCreate requestedStartDate(Date requestedStartDate) {
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

  public ServiceOrderCreate externalReference(List<ExternalReference> externalReference) {
    this.externalReference = externalReference;
    return this;
  }

  public ServiceOrderCreate addExternalReferenceItem(ExternalReference externalReferenceItem) {
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

  public ServiceOrderCreate note(List<Note> note) {
    this.note = note;
    return this;
  }

  public ServiceOrderCreate addNoteItem(Note noteItem) {
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

  public ServiceOrderCreate orderRelationship(List<ServiceOrderRelationship> orderRelationship) {
    this.orderRelationship = orderRelationship;
    return this;
  }

  public ServiceOrderCreate addOrderRelationshipItem(ServiceOrderRelationship orderRelationshipItem) {
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

  public ServiceOrderCreate relatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public ServiceOrderCreate addRelatedPartyItem(RelatedParty relatedPartyItem) {
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

  public ServiceOrderCreate serviceOrderItem(List<ServiceOrderItem> serviceOrderItem) {
    this.serviceOrderItem = serviceOrderItem;
    return this;
  }

  public ServiceOrderCreate addServiceOrderItemItem(ServiceOrderItem serviceOrderItemItem) {
    this.serviceOrderItem.add(serviceOrderItemItem);
    return this;
  }

  /**
   * A list of service order items to be processed by this order
   * @return serviceOrderItem
   **/
  @Schema(required = true, description = "A list of service order items to be processed by this order")
      @NotNull
    @Valid
  @Size(min=1)   public List<ServiceOrderItem> getServiceOrderItem() {
    return serviceOrderItem;
  }

  public void setServiceOrderItem(List<ServiceOrderItem> serviceOrderItem) {
    this.serviceOrderItem = serviceOrderItem;
  }

  public ServiceOrderCreate _atBaseType(String _atBaseType) {
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

  public ServiceOrderCreate _atSchemaLocation(String _atSchemaLocation) {
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

  public ServiceOrderCreate _atType(String _atType) {
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
    ServiceOrderCreate serviceOrderCreate = (ServiceOrderCreate) o;
    return Objects.equals(this.cancellationDate, serviceOrderCreate.cancellationDate) &&
        Objects.equals(this.cancellationReason, serviceOrderCreate.cancellationReason) &&
        Objects.equals(this.category, serviceOrderCreate.category) &&
        Objects.equals(this.description, serviceOrderCreate.description) &&
        Objects.equals(this.externalId, serviceOrderCreate.externalId) &&
        Objects.equals(this.notificationContact, serviceOrderCreate.notificationContact) &&
        Objects.equals(this.priority, serviceOrderCreate.priority) &&
        Objects.equals(this.requestedCompletionDate, serviceOrderCreate.requestedCompletionDate) &&
        Objects.equals(this.requestedStartDate, serviceOrderCreate.requestedStartDate) &&
        Objects.equals(this.externalReference, serviceOrderCreate.externalReference) &&
        Objects.equals(this.note, serviceOrderCreate.note) &&
        Objects.equals(this.orderRelationship, serviceOrderCreate.orderRelationship) &&
        Objects.equals(this.relatedParty, serviceOrderCreate.relatedParty) &&
        Objects.equals(this.serviceOrderItem, serviceOrderCreate.serviceOrderItem) &&
        Objects.equals(this._atBaseType, serviceOrderCreate._atBaseType) &&
        Objects.equals(this._atSchemaLocation, serviceOrderCreate._atSchemaLocation) &&
        Objects.equals(this._atType, serviceOrderCreate._atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancellationDate, cancellationReason, category, description, externalId, notificationContact, priority, requestedCompletionDate, requestedStartDate, externalReference, note, orderRelationship, relatedParty, serviceOrderItem, _atBaseType, _atSchemaLocation, _atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceOrderCreate {\n");
    
    sb.append("    cancellationDate: ").append(toIndentedString(cancellationDate)).append("\n");
    sb.append("    cancellationReason: ").append(toIndentedString(cancellationReason)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
