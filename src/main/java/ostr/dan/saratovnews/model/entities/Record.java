package ostr.dan.saratovnews.model.entities;

import lombok.Data;

import java.util.List;

@Data
public abstract class Record {
    private long Id;
    private long creatorId;
    private String title;
    private long publicationDate;
    private String description;
    private TypeOfRecord typeOfRecord;
    private List<Comment> comments;
}
