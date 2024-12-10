package com.example.CashCard;

import com.example.boring_stuff_boy.BoringStuffBoyApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;
//import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = BoringStuffBoyApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureWebTestClient
public class CashCardApplicationTest {

    @Autowired
    private WebTestClient webTestClient;

    @Test
    public void returnCardDataWhenDataIsSaved() {
        webTestClient.get().uri("/cashcards/99").exchange()
                .expectStatus()
                .isOk()
                .expectBody(String.class);
    }
}
