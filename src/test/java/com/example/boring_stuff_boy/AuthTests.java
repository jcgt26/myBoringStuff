package com.example.boring_stuff_boy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(classes = BoringStuffBoyApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureWebTestClient
public class AuthTests {
    @Autowired
    private WebTestClient webTestClient;

    @Test
    public void tryTestEndpoint() {
        webTestClient.get().uri("/test")
                .exchange()
                .expectStatus()
                .isOk() // for now due to auth process
                .expectBody(String.class);
    }
}
