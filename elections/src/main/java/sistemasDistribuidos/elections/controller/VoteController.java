package sistemasDistribuidos.elections.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sistemasDistribuidos.elections.model.Vote;
import sistemasDistribuidos.elections.service.VoteService;

@RestController
@RequestMapping("/votes")
public class VoteController {

    @Autowired
    private VoteService voteService;

    @PostMapping
    public void submitVote(@RequestBody Vote vote) {
        voteService.submitVote(vote);
    }

    @GetMapping
    public List<Vote> getAllVotes() {
        return voteService.getVotes();
    }
}
