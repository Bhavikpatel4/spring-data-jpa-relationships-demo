package com.example.springdatajparelationships.repository;

import com.example.springdatajparelationships.modal.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhotoRepo extends JpaRepository<Photo, Long> {
}
