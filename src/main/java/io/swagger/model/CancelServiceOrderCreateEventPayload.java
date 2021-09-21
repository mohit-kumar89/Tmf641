package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.CancelServiceOrder;
import io.swagger.v3.oas.annotations.media.Schema;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The event data structure
 */
@Schema(description = "The event data structure")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-08-05T10:49:44.666Z[GMT]")


public class CancelServiceOrderCreateEventPayload   {
  @JsonProperty("id")
  @Id
  @GeneratedValue
  private Long id;

  @JsonProperty("cancelServiceOrder")
  private CancelServiceOrder cancelServiceOrder = null;

  public CancelServiceOrderCreateEventPayload cancelServiceOrder(CancelServiceOrder cancelServiceOrder) {
    this.cancelServiceOrder = cancelServiceOrder;
    return this;
  }

  /**
   * Get cancelServiceOrder
   * @return cancelServiceOrder
   **/
  @Schema(description = "")
  
    @Valid
    public CancelServiceOrder getCancelServiceOrder() {
    return cancelServiceOrder;
  }

  public void setCancelServiceOrder(CancelServiceOrder cancelServiceOrder) {
    this.cancelServiceOrder = cancelServiceOrder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelServiceOrderCreateEventPayload cancelServiceOrderCreateEventPayload = (CancelServiceOrderCreateEventPayload) o;
    return Objects.equals(this.cancelServiceOrder, cancelServiceOrderCreateEventPayload.cancelServiceOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancelServiceOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelServiceOrderCreateEventPayload {\n");
    
    sb.append("    cancelServiceOrder: ").append(toIndentedString(cancelServiceOrder)).append("\n");
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
