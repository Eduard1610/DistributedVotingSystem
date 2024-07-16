package sistemasDistribuidos.elections.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sistemasDistribuidos.elections.model.Election;

public interface ElectionRepository extends JpaRepository<Election, Long> {
}
