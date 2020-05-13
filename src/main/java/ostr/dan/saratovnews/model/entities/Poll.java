package ostr.dan.saratovnews.model.entities;

import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder(toBuilder = true)
public class Poll extends Record{
    private List<String> answerOptions;
    private int selectedAnswers;

}
