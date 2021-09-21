package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.neo4j.ogm.annotation.Id;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Linked service order to the one containing this attribute
 */
@Schema(description = "Linked service order to the one containing this attribute")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-08-05T10:49:44.666Z[GMT]")


public class ServiceOrderRelationship   {
  @JsonProperty("id")
  @Id
  private String id;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("relationshipType")
  private String relationshipType = null;

  @JsonProperty("@baseType")
  private String _atBaseType = null;

  @JsonProperty("@schemaLocation")
  private String _atSchemaLocation = null;

  @JsonProperty("@type")
  private String _atType = null;

  @JsonProperty("@referredType")
  private String _atReferredType = null;

  public ServiceOrderRelationship id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the related order
   * @return id
   **/
  @Schema(required = true, description = "The id of the related order")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ServiceOrderRelationship href(String href) {
    this.href = href;
    return this;
  }

  /**
   * A hyperlink to the related order
   * @return href
   **/
  @Schema(description = "A hyperlink to the related order")
  
    public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public ServiceOrderRelationship relationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
    return this;
  }

  /**
   * The type of related order, such as: [dependency] if the order needs to be [not started] until another order item is complete (a service order in this case) or [cross-ref] to keep track of the source order (a productOrder)
   * @return relationshipType
   **/
  @Schema(required = true, description = "The type of related order, such as: [dependency] if the order needs to be [not started] until another order item is complete (a service order in this case) or [cross-ref] to keep track of the source order (a productOrder)")
      @NotNull

    public String getRelationshipType() {
    return relationshipType;
  }

  public void setRelationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
  }

  public ServiceOrderRelationship _atBaseType(String _atBaseType) {
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

  public ServiceOrderRelationship _atSchemaLocation(String _atSchemaLocation) {
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

  public ServiceOrderRelationship _atType(String _atType) {
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

  public ServiceOrderRelationship _atReferredType(String _atReferredType) {
    this._atReferredType = _atReferredType;
    return this;
  }

  /**
   * The entity type of the related order
   * @return _atReferredType
   **/
  @Schema(description = "The entity type of the related order")
  
    public String getAtReferredType() {
    return _atReferredType;
  }

  public void setAtReferredType(String _atReferredType) {
    this._atReferredType = _atReferredType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceOrderRelationship serviceOrderRelationship = (ServiceOrderRelationship) o;
    return Objects.equals(this.id, serviceOrderRelationship.id) &&
        Objects.equals(this.href, serviceOrderRelationship.href) &&
        Objects.equals(this.relationshipType, serviceOrderRelationship.relationshipType) &&
        Objects.equals(this._atBaseType, serviceOrderRelationship._atBaseType) &&
        Objects.equals(this._atSchemaLocation, serviceOrderRelationship._atSchemaLocation) &&
        Objects.equals(this._atType, serviceOrderRelationship._atType) &&
        Objects.equals(this._atReferredType, serviceOrderRelationship._atReferredType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, relationshipType, _atBaseType, _atSchemaLocation, _atType, _atReferredType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceOrderRelationship {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    relationshipType: ").append(toIndentedString(relationshipType)).append("\n");
    sb.append("    _atBaseType: ").append(toIndentedString(_atBaseType)).append("\n");
    sb.append("    _atSchemaLocation: ").append(toIndentedString(_atSchemaLocation)).append("\n");
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    _atReferredType: ").append(toIndentedString(_atReferredType)).append("\n");
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
