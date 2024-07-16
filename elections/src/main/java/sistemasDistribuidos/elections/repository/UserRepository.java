// C:\Users\USUARIO\Documents\SD_Final\DistributedVotingSystem\elections\src\main\java\sistemasDistribuidos\elections\repository\UserRepository.java
package sistemasDistribuidos.elections.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sistemasDistribuidos.elections.model.UserEntity;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByUsername(String username);
}
