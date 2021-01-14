package polo.polo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PoloApplication {

    public static void main(String[] args) {
        SpringApplication.run(PoloApplication.class, args);
    }

}
