package ostr.dan.saratovnews.model.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Builder(toBuilder = true)
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Poll extends Record {
    @OneToMany(cascade = CascadeType.ALL)
    private List<AnswerOption> answerOptions;
    private int selectedAnswer;
}
