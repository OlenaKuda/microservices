package polo.polo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("/")
public class PoloEndpoint {

    @PostMapping
    String post(@RequestBody String message) {
        return Objects.equals("marco", message) ? "polo" : "what?";
    }
}
