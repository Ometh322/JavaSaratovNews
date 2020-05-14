package ostr.dan.saratovnews.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ostr.dan.saratovnews.model.entities.Event;
import ostr.dan.saratovnews.repository.RecordRepository;

import java.util.List;

@Service
public class EventService implements RecordService<Event>{
    @Autowired
    private RecordRepository<Event> repository;

    @Override
    public Event createRecord(Event record) {
        return repository.save(record);
    }

    @Override
    public Event getRecord(long id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Event> getAllRecords() {
        return repository.findAll();
    }

    @Override
    public Event updateRecord(Event record) {
        return repository.save(record);
    }

    @Override
    public void deleteRecord(long id) {
        repository.deleteById(id);
    }
}
