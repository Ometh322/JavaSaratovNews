package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Comments;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Record
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-22T15:19:35.941Z")

public class Record   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("creatorId")
  private Long creatorId = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("publicationDate")
  private OffsetDateTime publicationDate = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("numberOfComments")
  private Integer numberOfComments = null;

  @JsonProperty("numberOfLikes")
  private Integer numberOfLikes = null;

  @JsonProperty("comments")
  @Valid
  private List<Comments> comments = null;

  /**
   * Gets or Sets typeOfRecord
   */
  public enum TypeOfRecordEnum {
    NEWS("NEWS"),
    
    EVENT("EVENT"),
    
    POLL("POLL");

    private String value;

    TypeOfRecordEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeOfRecordEnum fromValue(String text) {
      for (TypeOfRecordEnum b : TypeOfRecordEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("typeOfRecord")
  private TypeOfRecordEnum typeOfRecord = null;

  public Record id(Long id) {
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

  public Record creatorId(Long creatorId) {
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

  public Record title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Record publicationDate(OffsetDateTime publicationDate) {
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

  public Record description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Record numberOfComments(Integer numberOfComments) {
    this.numberOfComments = numberOfComments;
    return this;
  }

  /**
   * Get numberOfComments
   * @return numberOfComments
  **/
  @ApiModelProperty(value = "")


  public Integer getNumberOfComments() {
    return numberOfComments;
  }

  public void setNumberOfComments(Integer numberOfComments) {
    this.numberOfComments = numberOfComments;
  }

  public Record numberOfLikes(Integer numberOfLikes) {
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

  public Record comments(List<Comments> comments) {
    this.comments = comments;
    return this;
  }

  public Record addCommentsItem(Comments commentsItem) {
    if (this.comments == null) {
      this.comments = new ArrayList<Comments>();
    }
    this.comments.add(commentsItem);
    return this;
  }

  /**
   * Get comments
   * @return comments
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Comments> getComments() {
    return comments;
  }

  public void setComments(List<Comments> comments) {
    this.comments = comments;
  }

  public Record typeOfRecord(TypeOfRecordEnum typeOfRecord) {
    this.typeOfRecord = typeOfRecord;
    return this;
  }

  /**
   * Get typeOfRecord
   * @return typeOfRecord
  **/
  @ApiModelProperty(value = "")


  public TypeOfRecordEnum getTypeOfRecord() {
    return typeOfRecord;
  }

  public void setTypeOfRecord(TypeOfRecordEnum typeOfRecord) {
    this.typeOfRecord = typeOfRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Record record = (Record) o;
    return Objects.equals(this.id, record.id) &&
        Objects.equals(this.creatorId, record.creatorId) &&
        Objects.equals(this.title, record.title) &&
        Objects.equals(this.publicationDate, record.publicationDate) &&
        Objects.equals(this.description, record.description) &&
        Objects.equals(this.numberOfComments, record.numberOfComments) &&
        Objects.equals(this.numberOfLikes, record.numberOfLikes) &&
        Objects.equals(this.comments, record.comments) &&
        Objects.equals(this.typeOfRecord, record.typeOfRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, creatorId, title, publicationDate, description, numberOfComments, numberOfLikes, comments, typeOfRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Record {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    publicationDate: ").append(toIndentedString(publicationDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    numberOfComments: ").append(toIndentedString(numberOfComments)).append("\n");
    sb.append("    numberOfLikes: ").append(toIndentedString(numberOfLikes)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    typeOfRecord: ").append(toIndentedString(typeOfRecord)).append("\n");
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

