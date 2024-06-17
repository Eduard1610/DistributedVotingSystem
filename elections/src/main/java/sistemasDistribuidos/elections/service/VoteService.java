package sistemasDistribuidos.elections.service;

import java.util.List;

import org.springframework.stereotype.Service;

import sistemasDistribuidos.elections.model.Vote;
import sistemasDistribuidos.elections.repository.VoteRepository;

@Service
public class VoteService {
    private final VoteRepository voteRepository = new VoteRepository();

    public void submitVote(Vote vote) {
        voteRepository.addVote(vote);
    }

    public List<Vote> getVotes() {
        return voteRepository.getAllVotes();
    }
}
