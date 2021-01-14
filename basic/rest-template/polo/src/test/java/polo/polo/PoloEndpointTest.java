package polo.polo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
class PoloEndpointTest {

    @Autowired
    TestRestTemplate testRestTemplate;

    String url = "/";

    @ParameterizedTest
    @CsvSource({
            "test, what?",
            "marco, polo"
    })
    void post(String input, String expected) {
        String result = testRestTemplate.postForObject(url, input, String.class);
        assertThat(expected).isEqualTo(result);
    }
}
