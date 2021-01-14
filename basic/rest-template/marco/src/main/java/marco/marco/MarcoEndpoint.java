package marco.marco;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/")
public class MarcoEndpoint {

    private final RestTemplate restTemplate;

    public MarcoEndpoint(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/{message}")
    String getMessage(@PathVariable String message) {
        return restTemplate.postForObject("http://polo", message, String.class);
    }
}
