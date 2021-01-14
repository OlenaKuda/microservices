package marco.marco;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("polo")
public interface PoloClient {

    @PostMapping
    String getAnswer(@RequestBody String message);
}
