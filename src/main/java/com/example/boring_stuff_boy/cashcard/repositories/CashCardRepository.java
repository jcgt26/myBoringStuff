package com.example.boring_stuff_boy.cashcard.repositories;

import com.example.boring_stuff_boy.cashcard.CashCard;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

    public interface CashCardRepository extends
        CrudRepository<CashCard, Long>,
        PagingAndSortingRepository<CashCard, Long> {
}
