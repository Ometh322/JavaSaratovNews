package ostr.dan.saratovnews.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ostr.dan.saratovnews.model.entities.News;
import ostr.dan.saratovnews.services.NewsService;

import java.util.List;

@RestController
@RequestMapping(path = "/")
public class NewsController  {
    @Autowired
    private NewsService newsService;

    @PostMapping("/news")
    public News createNews(@RequestBody News news){
        return  newsService.createRecord(news);
    }

    @GetMapping("/news/{id}")
    public News getNews(@PathVariable("id") long id){
        return newsService.getRecord(id);
    }

    @GetMapping("/news")
    public List<News> getAllNews(){
        return newsService.getAllRecords();
    }

    @PutMapping("/news/{news}")
    public News updateNews(@PathVariable("news") @RequestBody News news){
        return newsService.updateRecord(news);
    }

    @DeleteMapping("/news/{id}")
    public HttpStatus deleteNews(@PathVariable("id") long id){
        newsService.deleteRecord(id);
        return HttpStatus.OK;
    }
}
