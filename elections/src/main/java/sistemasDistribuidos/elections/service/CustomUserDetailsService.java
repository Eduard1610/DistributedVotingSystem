// C:\Users\USUARIO\Documents\SD_Final\DistributedVotingSystem\elections\src\main\java\sistemasDistribuidos\elections\service\CustomUserDetailsService.java
package sistemasDistribuidos.elections.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import sistemasDistribuidos.elections.repository.UserRepository;
import sistemasDistribuidos.elections.model.UserEntity;

import java.util.Optional;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<UserEntity> user = userRepository.findByUsername(username);
        if (!user.isPresent()) {
            throw new UsernameNotFoundException("User not found");
        }
        UserEntity userEntity = user.get();
        return User.builder()
                .username(userEntity.getUsername())
                .password(userEntity.getPassword())
                .roles(userEntity.getRoles().split(","))
                .build();
    }
}
