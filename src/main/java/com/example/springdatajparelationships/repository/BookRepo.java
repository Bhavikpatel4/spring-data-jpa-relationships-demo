package com.example.springdatajparelationships.repository;

import com.example.springdatajparelationships.modal.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book,Long> {
}
