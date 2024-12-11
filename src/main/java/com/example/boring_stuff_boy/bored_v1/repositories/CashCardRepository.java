package com.example.boring_stuff_boy.bored_v1.repositories;

import com.example.boring_stuff_boy.bored_v1.CashCard;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

    public interface CashCardRepository extends
        CrudRepository<CashCard, Long>,
        PagingAndSortingRepository<CashCard, Long> {
}
