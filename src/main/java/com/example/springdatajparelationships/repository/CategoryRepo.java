package com.example.springdatajparelationships.repository;

import com.example.springdatajparelationships.modal.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category,Long> {
}
