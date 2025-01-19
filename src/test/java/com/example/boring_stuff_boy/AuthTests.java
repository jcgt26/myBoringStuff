package com.example.boring_stuff_boy;

import com.example.boring_stuff_boy.bored_v1.entities.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.web.client.RestTemplate;


@SpringBootTest(classes = BoringStuffBoyApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class AuthTests {

    @Autowired
    private TestRestTemplate restTemplate;

    @LocalServerPort
    private int port;

    private String baseUrl;

    @BeforeEach
    public void setUp(){
        this.baseUrl = "http://localhost:" + port + "/";
    }

    @Test
    @DirtiesContext
    public void testUserCreation() {
        User user = new User();
        user.setUsername("username");
        user.setName("name");
        user.setPassword("password");
        user.setEmail("email@email.com");
        user.setRole("ROLE_USER");


        ResponseEntity<User> response = restTemplate.postForEntity(
                this.url("/api/v1/auth/register"),
                user,
                User.class);
        Assertions.assertNotNull(response.getBody());
        Assertions.assertNotNull(response.getBody().getId());
        Assertions.assertEquals(HttpStatus.OK, response.getStatusCode());
        Assertions.assertEquals("username", response.getBody().getUsername());
    }
    @Test
    public void testUserCreationFailsWhenMissingArgument() {

    }


    private String url(String uri){
        assert uri != null && !uri.isEmpty();
        return baseUrl + uri;
    }
}
