package ostr.dan.saratovnews.model.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Builder(toBuilder = true)
@Data
@Entity
@NoArgsConstructor
public class News extends Record {

}
