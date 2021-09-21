package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Characteristic;
import io.swagger.model.ConstraintRef;
import io.swagger.model.FeatureRelationship;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;

import org.neo4j.ogm.annotation.Id;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Configuration feature.
 */
@Schema(description = "Configuration feature.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-08-05T10:49:44.666Z[GMT]")


public class Feature   {
  @JsonProperty("id")
  @Id
  private String id;

  @JsonProperty("isBundle")
  private Boolean isBundle = null;

  @JsonProperty("isEnabled")
  private Boolean isEnabled = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("constraint")
  @Valid
  private List<ConstraintRef> constraint = null;

  @JsonProperty("featureCharacteristic")
  @Valid
  private List<Characteristic> featureCharacteristic = new ArrayList<Characteristic>();

  @JsonProperty("featureRelationship")
  @Valid
  private List<FeatureRelationship> featureRelationship = null;

  public Feature id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the feature.
   * @return id
   **/
  @Schema(description = "Unique identifier of the feature.")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Feature isBundle(Boolean isBundle) {
    this.isBundle = isBundle;
    return this;
  }

  /**
   * True if this is a feature group. Default is false.
   * @return isBundle
   **/
  @Schema(description = "True if this is a feature group. Default is false.")
  
    public Boolean isIsBundle() {
    return isBundle;
  }

  public void setIsBundle(Boolean isBundle) {
    this.isBundle = isBundle;
  }

  public Feature isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * True if this feature is enabled. Default is true.
   * @return isEnabled
   **/
  @Schema(description = "True if this feature is enabled. Default is true.")
  
    public Boolean isIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public Feature name(String name) {
    this.name = name;
    return this;
  }

  /**
   * This is the name for the feature.
   * @return name
   **/
  @Schema(required = true, description = "This is the name for the feature.")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Feature constraint(List<ConstraintRef> constraint) {
    this.constraint = constraint;
    return this;
  }

  public Feature addConstraintItem(ConstraintRef constraintItem) {
    if (this.constraint == null) {
      this.constraint = new ArrayList<ConstraintRef>();
    }
    this.constraint.add(constraintItem);
    return this;
  }

  /**
   * This is a list of feature constraints.
   * @return constraint
   **/
  @Schema(description = "This is a list of feature constraints.")
      @Valid
    public List<ConstraintRef> getConstraint() {
    return constraint;
  }

  public void setConstraint(List<ConstraintRef> constraint) {
    this.constraint = constraint;
  }

  public Feature featureCharacteristic(List<Characteristic> featureCharacteristic) {
    this.featureCharacteristic = featureCharacteristic;
    return this;
  }

  public Feature addFeatureCharacteristicItem(Characteristic featureCharacteristicItem) {
    this.featureCharacteristic.add(featureCharacteristicItem);
    return this;
  }

  /**
   * This is a list of Characteristics for a particular feature.
   * @return featureCharacteristic
   **/
  @Schema(required = true, description = "This is a list of Characteristics for a particular feature.")
      @NotNull
    @Valid
  @Size(min=1)   public List<Characteristic> getFeatureCharacteristic() {
    return featureCharacteristic;
  }

  public void setFeatureCharacteristic(List<Characteristic> featureCharacteristic) {
    this.featureCharacteristic = featureCharacteristic;
  }

  public Feature featureRelationship(List<FeatureRelationship> featureRelationship) {
    this.featureRelationship = featureRelationship;
    return this;
  }

  public Feature addFeatureRelationshipItem(FeatureRelationship featureRelationshipItem) {
    if (this.featureRelationship == null) {
      this.featureRelationship = new ArrayList<FeatureRelationship>();
    }
    this.featureRelationship.add(featureRelationshipItem);
    return this;
  }

  /**
   * Get featureRelationship
   * @return featureRelationship
   **/
  @Schema(description = "")
      @Valid
    public List<FeatureRelationship> getFeatureRelationship() {
    return featureRelationship;
  }

  public void setFeatureRelationship(List<FeatureRelationship> featureRelationship) {
    this.featureRelationship = featureRelationship;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Feature feature = (Feature) o;
    return Objects.equals(this.id, feature.id) &&
        Objects.equals(this.isBundle, feature.isBundle) &&
        Objects.equals(this.isEnabled, feature.isEnabled) &&
        Objects.equals(this.name, feature.name) &&
        Objects.equals(this.constraint, feature.constraint) &&
        Objects.equals(this.featureCharacteristic, feature.featureCharacteristic) &&
        Objects.equals(this.featureRelationship, feature.featureRelationship);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isBundle, isEnabled, name, constraint, featureCharacteristic, featureRelationship);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Feature {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isBundle: ").append(toIndentedString(isBundle)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    constraint: ").append(toIndentedString(constraint)).append("\n");
    sb.append("    featureCharacteristic: ").append(toIndentedString(featureCharacteristic)).append("\n");
    sb.append("    featureRelationship: ").append(toIndentedString(featureRelationship)).append("\n");
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
