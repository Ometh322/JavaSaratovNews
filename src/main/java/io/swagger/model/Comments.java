package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Comments
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-22T15:19:35.941Z")

public class Comments   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("creatorId")
  private Long creatorId = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("publicationDate")
  private OffsetDateTime publicationDate = null;

  @JsonProperty("numberOfLikes")
  private Integer numberOfLikes = null;

  public Comments id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Comments creatorId(Long creatorId) {
    this.creatorId = creatorId;
    return this;
  }

  /**
   * Get creatorId
   * @return creatorId
  **/
  @ApiModelProperty(value = "")


  public Long getCreatorId() {
    return creatorId;
  }

  public void setCreatorId(Long creatorId) {
    this.creatorId = creatorId;
  }

  public Comments message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Comments publicationDate(OffsetDateTime publicationDate) {
    this.publicationDate = publicationDate;
    return this;
  }

  /**
   * Get publicationDate
   * @return publicationDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getPublicationDate() {
    return publicationDate;
  }

  public void setPublicationDate(OffsetDateTime publicationDate) {
    this.publicationDate = publicationDate;
  }

  public Comments numberOfLikes(Integer numberOfLikes) {
    this.numberOfLikes = numberOfLikes;
    return this;
  }

  /**
   * Get numberOfLikes
   * @return numberOfLikes
  **/
  @ApiModelProperty(value = "")


  public Integer getNumberOfLikes() {
    return numberOfLikes;
  }

  public void setNumberOfLikes(Integer numberOfLikes) {
    this.numberOfLikes = numberOfLikes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Comments comments = (Comments) o;
    return Objects.equals(this.id, comments.id) &&
        Objects.equals(this.creatorId, comments.creatorId) &&
        Objects.equals(this.message, comments.message) &&
        Objects.equals(this.publicationDate, comments.publicationDate) &&
        Objects.equals(this.numberOfLikes, comments.numberOfLikes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, creatorId, message, publicationDate, numberOfLikes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Comments {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    publicationDate: ").append(toIndentedString(publicationDate)).append("\n");
    sb.append("    numberOfLikes: ").append(toIndentedString(numberOfLikes)).append("\n");
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

