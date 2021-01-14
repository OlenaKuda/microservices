package polo.polo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("/")
public class PoloEndpoint {

    private final String port;

    public PoloEndpoint(@Value("${server.port}") String port) {
        this.port = port;
    }

    @PostMapping
    String post(@RequestBody String message) {
        String response = Objects.equals("marco", message) ? "polo" : message;
        String from = " from port: " + port;
        return response + from;
    }
}
