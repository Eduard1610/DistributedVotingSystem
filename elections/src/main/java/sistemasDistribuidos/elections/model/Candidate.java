package sistemasDistribuidos.elections.model;

public class Candidate {
    private String name;

    public Candidate() {}

    public Candidate(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
