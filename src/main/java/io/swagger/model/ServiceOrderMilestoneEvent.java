package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ServiceOrderMilestoneEventPayload;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Date;

import org.neo4j.ogm.annotation.Id;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The notification data structure
 */
@Schema(description = "The notification data structure")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-08-05T10:49:44.666Z[GMT]")


public class ServiceOrderMilestoneEvent   {
  @JsonProperty("event")
  private ServiceOrderMilestoneEventPayload event = null;

  @JsonProperty("eventId")
  @Id
  private String eventId;

  @JsonProperty("eventTime")
  private Date eventTime = null;

  @JsonProperty("eventType")
  private String eventType = null;

  @JsonProperty("correlationId")
  private String correlationId = null;

  @JsonProperty("domain")
  private String domain = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("priority")
  private String priority = null;

  @JsonProperty("timeOcurred")
  private Date timeOcurred = null;

  public ServiceOrderMilestoneEvent event(ServiceOrderMilestoneEventPayload event) {
    this.event = event;
    return this;
  }

  /**
   * Get event
   * @return event
   **/
  @Schema(description = "")
  
    @Valid
    public ServiceOrderMilestoneEventPayload getEvent() {
    return event;
  }

  public void setEvent(ServiceOrderMilestoneEventPayload event) {
    this.event = event;
  }

  public ServiceOrderMilestoneEvent eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * The identifier of the notification.
   * @return eventId
   **/
  @Schema(description = "The identifier of the notification.")
  
    public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public ServiceOrderMilestoneEvent eventTime(Date eventTime) {
    this.eventTime = eventTime;
    return this;
  }

  /**
   * Time of the event occurrence.
   * @return eventTime
   **/
  @Schema(description = "Time of the event occurrence.")
  
    @Valid
    public Date getEventTime() {
    return eventTime;
  }

  public void setEventTime(Date eventTime) {
    this.eventTime = eventTime;
  }

  public ServiceOrderMilestoneEvent eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * The type of the notification.
   * @return eventType
   **/
  @Schema(description = "The type of the notification.")
  
    public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public ServiceOrderMilestoneEvent correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }

  /**
   * The correlation id for this event.
   * @return correlationId
   **/
  @Schema(description = "The correlation id for this event.")
  
    public String getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  public ServiceOrderMilestoneEvent domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * The domain of the event.
   * @return domain
   **/
  @Schema(description = "The domain of the event.")
  
    public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public ServiceOrderMilestoneEvent title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the event.
   * @return title
   **/
  @Schema(description = "The title of the event.")
  
    public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ServiceOrderMilestoneEvent description(String description) {
    this.description = description;
    return this;
  }

  /**
   * An explnatory of the event.
   * @return description
   **/
  @Schema(description = "An explnatory of the event.")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ServiceOrderMilestoneEvent priority(String priority) {
    this.priority = priority;
    return this;
  }

  /**
   * A priority.
   * @return priority
   **/
  @Schema(description = "A priority.")
  
    public String getPriority() {
    return priority;
  }

  public void setPriority(String priority) {
    this.priority = priority;
  }

  public ServiceOrderMilestoneEvent timeOcurred(Date timeOcurred) {
    this.timeOcurred = timeOcurred;
    return this;
  }

  /**
   * The time the event occured.
   * @return timeOcurred
   **/
  @Schema(description = "The time the event occured.")
  
    @Valid
    public Date getTimeOcurred() {
    return timeOcurred;
  }

  public void setTimeOcurred(Date timeOcurred) {
    this.timeOcurred = timeOcurred;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceOrderMilestoneEvent serviceOrderMilestoneEvent = (ServiceOrderMilestoneEvent) o;
    return Objects.equals(this.event, serviceOrderMilestoneEvent.event) &&
        Objects.equals(this.eventId, serviceOrderMilestoneEvent.eventId) &&
        Objects.equals(this.eventTime, serviceOrderMilestoneEvent.eventTime) &&
        Objects.equals(this.eventType, serviceOrderMilestoneEvent.eventType) &&
        Objects.equals(this.correlationId, serviceOrderMilestoneEvent.correlationId) &&
        Objects.equals(this.domain, serviceOrderMilestoneEvent.domain) &&
        Objects.equals(this.title, serviceOrderMilestoneEvent.title) &&
        Objects.equals(this.description, serviceOrderMilestoneEvent.description) &&
        Objects.equals(this.priority, serviceOrderMilestoneEvent.priority) &&
        Objects.equals(this.timeOcurred, serviceOrderMilestoneEvent.timeOcurred);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, eventId, eventTime, eventType, correlationId, domain, title, description, priority, timeOcurred);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceOrderMilestoneEvent {\n");
    
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    timeOcurred: ").append(toIndentedString(timeOcurred)).append("\n");
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
