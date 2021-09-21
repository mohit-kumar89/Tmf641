package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.neo4j.ogm.annotation.Id;
import java.util.Date;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Milestone represents an action or event marking a significant change or stage in a process like an order process.
 */
@Schema(description = "Milestone represents an action or event marking a significant change or stage in a process like an order process.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-08-05T10:49:44.666Z[GMT]")


public class Milestone   {
  @JsonProperty("id")
  @Id
  private String id;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("milestoneDate")
  private Date milestoneDate = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("@baseType")
  private String _atBaseType = null;

  @JsonProperty("@schemaLocation")
  private String _atSchemaLocation = null;

  @JsonProperty("@type")
  private String _atType = null;

  public Milestone id(String id) {
    this.id = id;
    return this;
  }

  /**
   * identifier of the Milestone
   * @return id
   **/
  @Schema(description = "identifier of the Milestone")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Milestone description(String description) {
    this.description = description;
    return this;
  }

  /**
   * free-text description of the Milestone
   * @return description
   **/
  @Schema(description = "free-text description of the Milestone")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Milestone message(String message) {
    this.message = message;
    return this;
  }

  /**
   * A string represents the message of the milestone
   * @return message
   **/
  @Schema(description = "A string represents the message of the milestone")
  
    public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Milestone milestoneDate(Date milestoneDate) {
    this.milestoneDate = milestoneDate;
    return this;
  }

  /**
   * A date time( DateTime). The date that the milestone happens
   * @return milestoneDate
   **/
  @Schema(description = "A date time( DateTime). The date that the milestone happens")
  
    @Valid
    public Date getMilestoneDate() {
    return milestoneDate;
  }

  public void setMilestoneDate(Date milestoneDate) {
    this.milestoneDate = milestoneDate;
  }

  public Milestone name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A string used to give a name to the milestone
   * @return name
   **/
  @Schema(description = "A string used to give a name to the milestone")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Milestone status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The milestone status
   * @return status
   **/
  @Schema(description = "The milestone status")
  
    public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Milestone _atBaseType(String _atBaseType) {
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

  public Milestone _atSchemaLocation(String _atSchemaLocation) {
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

  public Milestone _atType(String _atType) {
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
    Milestone milestone = (Milestone) o;
    return Objects.equals(this.id, milestone.id) &&
        Objects.equals(this.description, milestone.description) &&
        Objects.equals(this.message, milestone.message) &&
        Objects.equals(this.milestoneDate, milestone.milestoneDate) &&
        Objects.equals(this.name, milestone.name) &&
        Objects.equals(this.status, milestone.status) &&
        Objects.equals(this._atBaseType, milestone._atBaseType) &&
        Objects.equals(this._atSchemaLocation, milestone._atSchemaLocation) &&
        Objects.equals(this._atType, milestone._atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, message, milestoneDate, name, status, _atBaseType, _atSchemaLocation, _atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Milestone {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    milestoneDate: ").append(toIndentedString(milestoneDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
