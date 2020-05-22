package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Comments;
import io.swagger.model.Record;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Events
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-22T15:19:35.941Z")

public class Events extends Record  {
  @JsonProperty("srartDate")
  private OffsetDateTime srartDate = null;

  public Events srartDate(OffsetDateTime srartDate) {
    this.srartDate = srartDate;
    return this;
  }

  /**
   * Get srartDate
   * @return srartDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getSrartDate() {
    return srartDate;
  }

  public void setSrartDate(OffsetDateTime srartDate) {
    this.srartDate = srartDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Events events = (Events) o;
    return Objects.equals(this.srartDate, events.srartDate) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(srartDate, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Events {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    srartDate: ").append(toIndentedString(srartDate)).append("\n");
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

