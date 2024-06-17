package sistemasDistribuidos.elections.model;

public class Vote {
    private String candidateName;

    public Vote() {}

    public Vote(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }
}
