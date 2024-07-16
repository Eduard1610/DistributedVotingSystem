/*C:\Users\USUARIO\Documents\SD_Final\DistributedVotingSystem\elections\src\main\java\sistemasDistribuidos\elections\service\ElectionService.java */
package sistemasDistribuidos.elections.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sistemasDistribuidos.elections.model.Election;
import sistemasDistribuidos.elections.repository.ElectionRepository;

import java.util.List;

@Service
public class ElectionService {

    @Autowired
    private ElectionRepository electionRepository;

    public List<Election> findAll() {
        return electionRepository.findAll();
    }

    public Election findById(Long id) {
        return electionRepository.findById(id).orElse(null);
    }

    public Election save(Election election) {
        return electionRepository.save(election);
    }

    public void deleteById(Long id) {
        electionRepository.deleteById(id);
    }
}
