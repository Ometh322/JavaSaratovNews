package ostr.dan.saratovnews.services;


import ostr.dan.saratovnews.model.entities.Record;

import java.util.List;

public interface RecordService<RecordType extends Record> {
    RecordType createRecord(RecordType record);
    RecordType getRecord(long id);
    List<RecordType> getAllRecords();
    RecordType updateRecord(RecordType record);
    void deleteRecord(long id);
}
