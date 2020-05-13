package ostr.dan.saratovnews.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ostr.dan.saratovnews.model.entities.Record;

public interface RecordRepository<RecordType extends Record> extends JpaRepository<RecordType, Long> {

}
