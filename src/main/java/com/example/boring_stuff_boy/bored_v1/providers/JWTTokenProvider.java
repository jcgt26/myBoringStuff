package com.example.boring_stuff_boy.bored_v1.providers;

import com.sun.security.auth.UserPrincipal;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;


import java.util.Date;

//@Component
public class JWTTokenProvider {

    //@Value("${app.jwtSecret}")
    private String jwtSecret;

    //@Value("${app.jwtExpirationInMS}")
    private long jwtExpirationInMS;
    public String generateToken(Authentication authentication) {
        UserPrincipal userPrincipal = (UserPrincipal) authentication.getPrincipal();
        Date now = new Date();
        Date expirationDate = new Date(now.getTime() + jwtExpirationInMS);
        //TODO: generate token based on user and properties
        return "";
    }

}
