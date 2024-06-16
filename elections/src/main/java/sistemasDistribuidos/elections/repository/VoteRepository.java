package sistemasDistribuidos.elections.repository;

import java.util.ArrayList;
import java.util.List;

import sistemasDistribuidos.elections.model.Vote;

public class VoteRepository {
    private List<Vote> votes = new ArrayList<>();

    public void addVote(Vote vote) {
        votes.add(vote);
    }

    public List<Vote> getAllVotes() {
        return votes;
    }
}
