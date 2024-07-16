/*C:\Users\USUARIO\Documents\SD_Final\DistributedVotingSystem\elections\src\main\java\sistemasDistribuidos\elections\service\AdminService.java*/
package sistemasDistribuidos.elections.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sistemasDistribuidos.elections.model.Admin;
import sistemasDistribuidos.elections.repository.AdminRepository;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public List<Admin> findAll() {
        return adminRepository.findAll();
    }

    public Admin findById(Long id) {
        return adminRepository.findById(id).orElse(null);
    }

    public Admin save(Admin admin) {
        return adminRepository.save(admin);
    }

    public void deleteById(Long id) {
        adminRepository.deleteById(id);
    }
}
