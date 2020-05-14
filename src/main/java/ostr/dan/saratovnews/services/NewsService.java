package ostr.dan.saratovnews.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ostr.dan.saratovnews.model.entities.News;
import ostr.dan.saratovnews.repository.RecordRepository;

import java.util.List;

@Service
public class NewsService implements RecordService<News> {
    @Autowired
    private RecordRepository<News> repository;
    @Override
    public News createRecord(News record) {
        return repository.save(record);
    }

    @Override
    public News getRecord(long id) {
        return repository.findById(id).get();
    }

    @Override
    public List<News> getAllRecords() {
        return repository.findAll();
    }

    @Override
    public News updateRecord(News record) {
        return repository.save(record);
    }

    @Override
    public void deleteRecord(long id) {
            repository.deleteById(id);
    }
}
