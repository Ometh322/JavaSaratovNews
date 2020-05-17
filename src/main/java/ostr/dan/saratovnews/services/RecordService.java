package ostr.dan.saratovnews.services;


import org.springframework.stereotype.Service;
import ostr.dan.saratovnews.model.entities.Record;

import java.util.List;

@Service
public interface RecordService<RecordType extends Record> {
    RecordType createRecord(RecordType record);
    RecordType getRecord(long id);
    List<RecordType> getAllRecords();
    RecordType updateRecord(RecordType record);
    void deleteRecord(long id);
}
