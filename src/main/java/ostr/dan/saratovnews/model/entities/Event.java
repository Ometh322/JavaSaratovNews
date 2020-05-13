package ostr.dan.saratovnews.model.entities;

import lombok.Builder;
import lombok.Data;

@Builder(toBuilder = true)
@Data
public class Event extends Record{
    private long startDate;
}
