package ostr.dan.saratovnews.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ostr.dan.saratovnews.model.entities.Poll;
import ostr.dan.saratovnews.model.entities.Record;
import ostr.dan.saratovnews.repository.RecordRepository;

import java.util.List;

@Service
public class PollService implements RecordService<Poll> {
    @Autowired
    private RecordRepository<Poll> repository;

    @Override
    public Poll createRecord(Poll record) {
        return repository.save(record);
    }

    @Override
    public Poll getRecord(long id) {
        return repository.getOne(id);
    }

    @Override
    public List<Poll> getAllRecords(){
        return repository.findAll();
    }

    @Override
    public Poll updateRecord(Poll record) {
        return repository.save(record);
    }

    @Override
    public void deleteRecord(long id) {
        repository.deleteById(id);
    }
}
