package com.example.springdatajparelationships.repository;

import com.example.springdatajparelationships.modal.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepo extends JpaRepository<Author, Long> {
}
