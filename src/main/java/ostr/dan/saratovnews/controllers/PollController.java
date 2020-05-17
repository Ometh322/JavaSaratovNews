package ostr.dan.saratovnews.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ostr.dan.saratovnews.model.entities.Poll;
import ostr.dan.saratovnews.services.PollService;

import java.util.List;

@RequestMapping(path = "/")
@RestController
public class PollController {
    @Autowired
    private PollService pollService;

    @PostMapping("/poll")
    public Poll createPoll(@RequestBody Poll poll) {
        return pollService.createRecord(poll);
    }

    @GetMapping("/poll/{id}")
    public Poll getPoll(@PathVariable("id") long id) {
        return pollService.getRecord(id);
    }

    @GetMapping("/polls")
    public List<Poll> getAllPolls() {
        return pollService.getAllRecords();
    }

    @PutMapping("/poll/{poll}")
    public Poll updatePoll(@PathVariable("poll") @RequestBody Poll poll) {
        return pollService.updateRecord(poll);
    }

    @DeleteMapping("/poll/{id}")
    public HttpStatus deletePoll(@PathVariable("id") long id) {
        pollService.deleteRecord(id);
        return HttpStatus.OK;
    }
}
