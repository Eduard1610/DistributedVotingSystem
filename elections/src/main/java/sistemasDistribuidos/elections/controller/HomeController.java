// C:\Users\USUARIO\Documents\SD_Final\DistributedVotingSystem\elections\src\main\java\sistemasDistribuidos\elections\controller\HomeController.java

package sistemasDistribuidos.elections.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("/")
    public String homePage() {
        return "home"; // Esto asume que tienes un archivo HTML llamado "home.html"
    }

    @GetMapping("/newElection")
    public String newElection() {
        return "newElection"; // Puedes crear este HTML para gestionar la creación de elecciones
    }

    @GetMapping("/candidates")
    public String candidates() {
        return "candidates"; // Puedes crear este HTML para gestionar los candidatos
    }

    @GetMapping("/voters")
    public String voters() {
        return "voters"; // Puedes crear este HTML para gestionar los votantes
    }
}
