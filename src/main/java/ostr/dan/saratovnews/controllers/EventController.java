package ostr.dan.saratovnews.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ostr.dan.saratovnews.model.entities.Event;
import ostr.dan.saratovnews.services.EventService;

import java.util.List;

@RestController
@RequestMapping(path = "/")
public class EventController {
    @Autowired
    private EventService eventService;

    @PostMapping("/event")
    public Event createEvent(@RequestBody Event event){
        return eventService.createRecord(event);
    }

    @GetMapping("/event/{id}")
    public Event getEvent(@PathVariable("id") long id){
        return eventService.getRecord(id);
    }

    @GetMapping("/events")
    public List<Event> getAllEvents(){
        return eventService.getAllRecords();
    }

    @PutMapping("/event/{event}")
    public  Event updateEvent(@PathVariable("event") @RequestBody Event event){
        return eventService.updateRecord(event);
    }

    @DeleteMapping("/event/{id}")
    public HttpStatus deleteEvent(@PathVariable("id") long id){
        eventService.deleteRecord(id);
        return HttpStatus.OK;
    }
}
