package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ExternalReference;
import io.swagger.model.Note;
import io.swagger.model.RelatedParty;
import io.swagger.model.ServiceOrderErrorMessage;
import io.swagger.model.ServiceOrderItem;
import io.swagger.model.ServiceOrderJeopardyAlert;
import io.swagger.model.ServiceOrderMilestone;
import io.swagger.model.ServiceOrderRelationship;
import io.swagger.model.ServiceOrderStateType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import java.util.Date;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ServiceOrder
 */
public class ServiceOrder   {
  @JsonProperty("id")
  @Id
  private String id;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("cancellationDate")
  private Date cancellationDate = null;

  @JsonProperty("cancellationReason")
  private String cancellationReason = null;

  @JsonProperty("category")
  private String category = null;

  @JsonProperty("completionDate")
  private Date completionDate = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("expectedCompletionDate")
  private Date expectedCompletionDate = null;

  @JsonProperty("externalId")
  private String externalId = null;

  @JsonProperty("notificationContact")
  private String notificationContact = null;

  @JsonProperty("orderDate")
  private Date orderDate = null;

  @JsonProperty("priority")
  private String priority = null;

  @JsonProperty("requestedCompletionDate")
  private Date requestedCompletionDate = null;

  @JsonProperty("requestedStartDate")
  private Date requestedStartDate = null;

  @JsonProperty("startDate")
  private Date startDate = null;

  @JsonProperty("errorMessage")
  @Valid
  private List<ServiceOrderErrorMessage> errorMessage = null;

  @JsonProperty("externalReference")
  @Valid
  private List<ExternalReference> externalReference = null;

  @JsonProperty("jeopardyAlert")
  @Valid
  private List<ServiceOrderJeopardyAlert> jeopardyAlert = null;

  @JsonProperty("milestone")
  @Valid
  private List<ServiceOrderMilestone> milestone = null;

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

  @JsonProperty("@baseType")
  private String _atBaseType = null;

  @JsonProperty("@schemaLocation")
  private String _atSchemaLocation = null;

  @JsonProperty("@type")
  private String _atType = null;

  public ServiceOrder id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID created on repository side
   * @return id
   **/
  @Schema(description = "ID created on repository side")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ServiceOrder href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Hyperlink to access the order
   * @return href
   **/
  @Schema(description = "Hyperlink to access the order")
  
    public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public ServiceOrder cancellationDate(Date cancellationDate) {
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

  public ServiceOrder cancellationReason(String cancellationReason) {
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

  public ServiceOrder category(String category) {
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

  public ServiceOrder completionDate(Date completionDate) {
    this.completionDate = completionDate;
    return this;
  }

  /**
   * Effective delivery date amended by the provider
   * @return completionDate
   **/
  @Schema(description = "Effective delivery date amended by the provider")
  
    @Valid
    public Date getCompletionDate() {
    return completionDate;
  }

  public void setCompletionDate(Date completionDate) {
    this.completionDate = completionDate;
  }

  public ServiceOrder description(String description) {
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

  public ServiceOrder expectedCompletionDate(Date expectedCompletionDate) {
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

  public ServiceOrder externalId(String externalId) {
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

  public ServiceOrder notificationContact(String notificationContact) {
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

  public ServiceOrder orderDate(Date orderDate) {
    this.orderDate = orderDate;
    return this;
  }

  /**
   * Get orderDate
   * @return orderDate
   **/
  @Schema()
  
    @Valid
    public Date getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(Date orderDate) {
    this.orderDate = orderDate;
  }

  public ServiceOrder priority(String priority) {
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

  public ServiceOrder requestedCompletionDate(Date requestedCompletionDate) {
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

  public ServiceOrder requestedStartDate(Date requestedStartDate) {
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

  public ServiceOrder startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Date when the order was started for processing
   * @return startDate
   **/
  @Schema(description = "Date when the order was started for processing")
  
    @Valid
    public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public ServiceOrder errorMessage(List<ServiceOrderErrorMessage> errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  public ServiceOrder addErrorMessageItem(ServiceOrderErrorMessage errorMessageItem) {
    if (this.errorMessage == null) {
      this.errorMessage = new ArrayList<ServiceOrderErrorMessage>();
    }
    this.errorMessage.add(errorMessageItem);
    return this;
  }

  /**
   * the error(s) cause an order status change
   * @return errorMessage
   **/
  @Schema(description = "the error(s) cause an order status change")
      @Valid
    public List<ServiceOrderErrorMessage> getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(List<ServiceOrderErrorMessage> errorMessage) {
    this.errorMessage = errorMessage;
  }

  public ServiceOrder externalReference(List<ExternalReference> externalReference) {
    this.externalReference = externalReference;
    return this;
  }

  public ServiceOrder addExternalReferenceItem(ExternalReference externalReferenceItem) {
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

  public ServiceOrder jeopardyAlert(List<ServiceOrderJeopardyAlert> jeopardyAlert) {
    this.jeopardyAlert = jeopardyAlert;
    return this;
  }

  public ServiceOrder addJeopardyAlertItem(ServiceOrderJeopardyAlert jeopardyAlertItem) {
    if (this.jeopardyAlert == null) {
      this.jeopardyAlert = new ArrayList<ServiceOrderJeopardyAlert>();
    }
    this.jeopardyAlert.add(jeopardyAlertItem);
    return this;
  }

  /**
   * A list of jeopardy alerts related to this order
   * @return jeopardyAlert
   **/
  @Schema(description = "A list of jeopardy alerts related to this order")
      @Valid
    public List<ServiceOrderJeopardyAlert> getJeopardyAlert() {
    return jeopardyAlert;
  }

  public void setJeopardyAlert(List<ServiceOrderJeopardyAlert> jeopardyAlert) {
    this.jeopardyAlert = jeopardyAlert;
  }

  public ServiceOrder milestone(List<ServiceOrderMilestone> milestone) {
    this.milestone = milestone;
    return this;
  }

  public ServiceOrder addMilestoneItem(ServiceOrderMilestone milestoneItem) {
    if (this.milestone == null) {
      this.milestone = new ArrayList<ServiceOrderMilestone>();
    }
    this.milestone.add(milestoneItem);
    return this;
  }

  /**
   * A list of milestones related to this order
   * @return milestone
   **/
  @Schema(description = "A list of milestones related to this order")
      @Valid
    public List<ServiceOrderMilestone> getMilestone() {
    return milestone;
  }

  public void setMilestone(List<ServiceOrderMilestone> milestone) {
    this.milestone = milestone;
  }

  public ServiceOrder note(List<Note> note) {
    this.note = note;
    return this;
  }

  public ServiceOrder addNoteItem(Note noteItem) {
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

  public ServiceOrder orderRelationship(List<ServiceOrderRelationship> orderRelationship) {
    this.orderRelationship = orderRelationship;
    return this;
  }

  public ServiceOrder addOrderRelationshipItem(ServiceOrderRelationship orderRelationshipItem) {
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

  public ServiceOrder relatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public ServiceOrder addRelatedPartyItem(RelatedParty relatedPartyItem) {
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

  public ServiceOrder serviceOrderItem(List<ServiceOrderItem> serviceOrderItem) {
    this.serviceOrderItem = serviceOrderItem;
    return this;
  }

  public ServiceOrder addServiceOrderItemItem(ServiceOrderItem serviceOrderItemItem) {
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

  public ServiceOrder state(ServiceOrderStateType state) {
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

  public ServiceOrder _atBaseType(String _atBaseType) {
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

  public ServiceOrder _atSchemaLocation(String _atSchemaLocation) {
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

  public ServiceOrder _atType(String _atType) {
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
    ServiceOrder serviceOrder = (ServiceOrder) o;
    return Objects.equals(this.id, serviceOrder.id) &&
        Objects.equals(this.href, serviceOrder.href) &&
        Objects.equals(this.cancellationDate, serviceOrder.cancellationDate) &&
        Objects.equals(this.cancellationReason, serviceOrder.cancellationReason) &&
        Objects.equals(this.category, serviceOrder.category) &&
        Objects.equals(this.completionDate, serviceOrder.completionDate) &&
        Objects.equals(this.description, serviceOrder.description) &&
        Objects.equals(this.expectedCompletionDate, serviceOrder.expectedCompletionDate) &&
        Objects.equals(this.externalId, serviceOrder.externalId) &&
        Objects.equals(this.notificationContact, serviceOrder.notificationContact) &&
        Objects.equals(this.orderDate, serviceOrder.orderDate) &&
        Objects.equals(this.priority, serviceOrder.priority) &&
        Objects.equals(this.requestedCompletionDate, serviceOrder.requestedCompletionDate) &&
        Objects.equals(this.requestedStartDate, serviceOrder.requestedStartDate) &&
        Objects.equals(this.startDate, serviceOrder.startDate) &&
        Objects.equals(this.errorMessage, serviceOrder.errorMessage) &&
        Objects.equals(this.externalReference, serviceOrder.externalReference) &&
        Objects.equals(this.jeopardyAlert, serviceOrder.jeopardyAlert) &&
        Objects.equals(this.milestone, serviceOrder.milestone) &&
        Objects.equals(this.note, serviceOrder.note) &&
        Objects.equals(this.orderRelationship, serviceOrder.orderRelationship) &&
        Objects.equals(this.relatedParty, serviceOrder.relatedParty) &&
        Objects.equals(this.serviceOrderItem, serviceOrder.serviceOrderItem) &&
        Objects.equals(this.state, serviceOrder.state) &&
        Objects.equals(this._atBaseType, serviceOrder._atBaseType) &&
        Objects.equals(this._atSchemaLocation, serviceOrder._atSchemaLocation) &&
        Objects.equals(this._atType, serviceOrder._atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, cancellationDate, cancellationReason, category, completionDate, description, expectedCompletionDate, externalId, notificationContact, orderDate, priority, requestedCompletionDate, requestedStartDate, startDate, errorMessage, externalReference, jeopardyAlert, milestone, note, orderRelationship, relatedParty, serviceOrderItem, state, _atBaseType, _atSchemaLocation, _atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceOrder {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    cancellationDate: ").append(toIndentedString(cancellationDate)).append("\n");
    sb.append("    cancellationReason: ").append(toIndentedString(cancellationReason)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    completionDate: ").append(toIndentedString(completionDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expectedCompletionDate: ").append(toIndentedString(expectedCompletionDate)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    notificationContact: ").append(toIndentedString(notificationContact)).append("\n");
    sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    requestedCompletionDate: ").append(toIndentedString(requestedCompletionDate)).append("\n");
    sb.append("    requestedStartDate: ").append(toIndentedString(requestedStartDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    jeopardyAlert: ").append(toIndentedString(jeopardyAlert)).append("\n");
    sb.append("    milestone: ").append(toIndentedString(milestone)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    orderRelationship: ").append(toIndentedString(orderRelationship)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    serviceOrderItem: ").append(toIndentedString(serviceOrderItem)).append("\n");
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
