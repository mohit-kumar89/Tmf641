package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Characteristic;
import io.swagger.model.ServiceRefOrValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;

import org.neo4j.ogm.annotation.Id;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ServiceRelationship
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-08-05T10:49:44.666Z[GMT]")


public class ServiceRelationship   {
  @JsonProperty("id")
  @Id
  private String id;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("relationshipType")
  private String relationshipType = null;

  @JsonProperty("service")
  private ServiceRefOrValue service = null;

  @JsonProperty("serviceRelationshipCharacteristic")
  @Valid
  private List<Characteristic> serviceRelationshipCharacteristic = null;

  @JsonProperty("@baseType")
  private String _atBaseType = null;

  @JsonProperty("@schemaLocation")
  private String _atSchemaLocation = null;

  @JsonProperty("@type")
  private String _atType = null;

  public ServiceRelationship id(String id) {
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

  public ServiceRelationship href(String href) {
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

  public ServiceRelationship relationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
    return this;
  }

  /**
   * Get relationshipType
   * @return relationshipType
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getRelationshipType() {
    return relationshipType;
  }

  public void setRelationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
  }

  public ServiceRelationship service(ServiceRefOrValue service) {
    this.service = service;
    return this;
  }

  /**
   * Get service
   * @return service
   **/
  @Schema(description = "")
  
    @Valid
    public ServiceRefOrValue getService() {
    return service;
  }

  public void setService(ServiceRefOrValue service) {
    this.service = service;
  }

  public ServiceRelationship serviceRelationshipCharacteristic(List<Characteristic> serviceRelationshipCharacteristic) {
    this.serviceRelationshipCharacteristic = serviceRelationshipCharacteristic;
    return this;
  }

  public ServiceRelationship addServiceRelationshipCharacteristicItem(Characteristic serviceRelationshipCharacteristicItem) {
    if (this.serviceRelationshipCharacteristic == null) {
      this.serviceRelationshipCharacteristic = new ArrayList<Characteristic>();
    }
    this.serviceRelationshipCharacteristic.add(serviceRelationshipCharacteristicItem);
    return this;
  }

  /**
   * Get serviceRelationshipCharacteristic
   * @return serviceRelationshipCharacteristic
   **/
  @Schema(description = "")
      @Valid
    public List<Characteristic> getServiceRelationshipCharacteristic() {
    return serviceRelationshipCharacteristic;
  }

  public void setServiceRelationshipCharacteristic(List<Characteristic> serviceRelationshipCharacteristic) {
    this.serviceRelationshipCharacteristic = serviceRelationshipCharacteristic;
  }

  public ServiceRelationship _atBaseType(String _atBaseType) {
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

  public ServiceRelationship _atSchemaLocation(String _atSchemaLocation) {
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

  public ServiceRelationship _atType(String _atType) {
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
    ServiceRelationship serviceRelationship = (ServiceRelationship) o;
    return Objects.equals(this.id, serviceRelationship.id) &&
        Objects.equals(this.href, serviceRelationship.href) &&
        Objects.equals(this.relationshipType, serviceRelationship.relationshipType) &&
        Objects.equals(this.service, serviceRelationship.service) &&
        Objects.equals(this.serviceRelationshipCharacteristic, serviceRelationship.serviceRelationshipCharacteristic) &&
        Objects.equals(this._atBaseType, serviceRelationship._atBaseType) &&
        Objects.equals(this._atSchemaLocation, serviceRelationship._atSchemaLocation) &&
        Objects.equals(this._atType, serviceRelationship._atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, relationshipType, service, serviceRelationshipCharacteristic, _atBaseType, _atSchemaLocation, _atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceRelationship {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    relationshipType: ").append(toIndentedString(relationshipType)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    serviceRelationshipCharacteristic: ").append(toIndentedString(serviceRelationshipCharacteristic)).append("\n");
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
