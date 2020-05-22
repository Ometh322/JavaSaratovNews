package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Comments;
import io.swagger.model.Record;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Polls
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-22T15:19:35.941Z")

public class Polls extends Record  {
  @JsonProperty("answerOptions")
  @Valid
  private List<String> answerOptions = null;

  @JsonProperty("selectedAnswer")
  private Long selectedAnswer = null;

  public Polls answerOptions(List<String> answerOptions) {
    this.answerOptions = answerOptions;
    return this;
  }

  public Polls addAnswerOptionsItem(String answerOptionsItem) {
    if (this.answerOptions == null) {
      this.answerOptions = new ArrayList<String>();
    }
    this.answerOptions.add(answerOptionsItem);
    return this;
  }

  /**
   * Get answerOptions
   * @return answerOptions
  **/
  @ApiModelProperty(value = "")


  public List<String> getAnswerOptions() {
    return answerOptions;
  }

  public void setAnswerOptions(List<String> answerOptions) {
    this.answerOptions = answerOptions;
  }

  public Polls selectedAnswer(Long selectedAnswer) {
    this.selectedAnswer = selectedAnswer;
    return this;
  }

  /**
   * Get selectedAnswer
   * @return selectedAnswer
  **/
  @ApiModelProperty(value = "")


  public Long getSelectedAnswer() {
    return selectedAnswer;
  }

  public void setSelectedAnswer(Long selectedAnswer) {
    this.selectedAnswer = selectedAnswer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Polls polls = (Polls) o;
    return Objects.equals(this.answerOptions, polls.answerOptions) &&
        Objects.equals(this.selectedAnswer, polls.selectedAnswer) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(answerOptions, selectedAnswer, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Polls {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    answerOptions: ").append(toIndentedString(answerOptions)).append("\n");
    sb.append("    selectedAnswer: ").append(toIndentedString(selectedAnswer)).append("\n");
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

