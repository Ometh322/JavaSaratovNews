package ostr.dan.saratovnews.model.entities;

import lombok.Builder;
import lombok.Data;

@Builder(toBuilder = true)
@Data
public class Comment {
    private long id;
    private long creatorId;
    private String message;
    private long publicationDate;
}
