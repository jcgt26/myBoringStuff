package com.example.boring_stuff_boy.bored_v1.controllers;

import com.example.boring_stuff_boy.bored_v1.CashCard;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cashcards")
public class CashCardController {

    @GetMapping("/{requestedId}")
    public ResponseEntity<CashCard> getCardById(@PathVariable Long requestedId) {
        if(requestedId.equals(99L)){
            CashCard cashCard = new CashCard(99L, 200.0);
            return ResponseEntity.ok(cashCard);
        }

        return ResponseEntity.notFound().build();
    }
}
