package ostr.dan.saratovnews.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ostr.dan.saratovnews.model.entities.Event;
import ostr.dan.saratovnews.services.EventService;

import java.util.List;

@Api
@RestController
@RequestMapping(path = "/")
public class EventController {
    @Autowired
    private EventService eventService;

    @ApiOperation("Создает Событие")
    @ApiResponse(code = 200, message = "Событие успешно создано")
    @PostMapping("/event")
    public Event createEvent(@RequestBody Event event) {
        return eventService.createRecord(event);
    }

    @ApiOperation("Возвращает Событие по Id")
    @ApiResponse(code = 200, message = "Событие успешно возвращено")
    @GetMapping("/event/{id}")
    public Event getEvent(@PathVariable("id") long id) {
        return eventService.getRecord(id);
    }

    @ApiOperation("Возвращает все События")
    @ApiResponse(code = 200, message = "Все События успешно возвращены")
    @GetMapping("/events")
    public List<Event> getAllEvents() {
        return eventService.getAllRecords();
    }

    @ApiOperation("Изменяет Событие")
    @ApiResponse(code = 200, message = "Событие успешно изменено")
    @PutMapping("/event/{event}")
    public Event updateEvent(@PathVariable("event") @RequestBody Event event) {
        return eventService.updateRecord(event);
    }

    @ApiOperation("Удаляет Событие")
    @ApiResponse(code = 200, message = "Событие успешно удалено")
    @DeleteMapping("/event/{id}")
    public HttpStatus deleteEvent(@PathVariable("id") long id) {
        eventService.deleteRecord(id);
        return HttpStatus.OK;
    }
}
