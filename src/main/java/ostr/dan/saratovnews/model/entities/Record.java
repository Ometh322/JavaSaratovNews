package ostr.dan.saratovnews.model.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public abstract class Record {
    @Id
    @GeneratedValue
    private long Id;
    private long creatorId;
    private String title;
    private long publicationDate;
    private String description;
    private TypeOfRecord typeOfRecord;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Comment> comments;
}
