package sistemasDistribuidos.elections.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sistemasDistribuidos.elections.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}