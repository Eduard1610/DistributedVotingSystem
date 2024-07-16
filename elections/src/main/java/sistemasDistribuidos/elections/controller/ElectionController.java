package sistemasDistribuidos.elections.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sistemasDistribuidos.elections.model.Election;
import sistemasDistribuidos.elections.service.ElectionService;

import java.util.List;

@RestController
@RequestMapping("/api/elections")
public class ElectionController {

    @Autowired
    private ElectionService electionService;

    @GetMapping
    public List<Election> getAllElections() {
        return electionService.findAll();
    }

    @GetMapping("/{id}")
    public Election getElectionById(@PathVariable Long id) {
        return electionService.findById(id);
    }

    @PostMapping
    public Election createElection(@RequestBody Election election) {
        return electionService.save(election);
    }

    @PutMapping("/{id}")
    public Election updateElection(@PathVariable Long id, @RequestBody Election election) {
        election.setId(id);
        return electionService.save(election);
    }

    @DeleteMapping("/{id}")
    public void deleteElection(@PathVariable Long id) {
        electionService.deleteById(id);
    }
}
