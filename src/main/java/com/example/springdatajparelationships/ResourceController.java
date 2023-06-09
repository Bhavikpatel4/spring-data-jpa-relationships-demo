package com.example.springdatajparelationships;

import com.example.springdatajparelationships.modal.Author;
import com.example.springdatajparelationships.modal.Book;
import com.example.springdatajparelationships.modal.Category;
import com.example.springdatajparelationships.repository.AuthorRepo;
import com.example.springdatajparelationships.repository.BookRepo;
import com.example.springdatajparelationships.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ResourceController {

    @Autowired
    private CategoryRepo categoryRepo;

    @Autowired
    private BookRepo bookRepo;

    @Autowired
    private AuthorRepo authorRepo;

    @GetMapping("/categories")
    public ResponseEntity<List<Category>> getCategories() {
        List<Category> list = (List<Category>) categoryRepo.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getBooks() {
        List<Book> list = (List<Book>) bookRepo.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/books/{bookId}")
    public ResponseEntity<Book> getBook(@PathVariable Long bookId) {
        Book book = bookRepo.getReferenceById(bookId);
        return new ResponseEntity<>(book, HttpStatus.OK);
    }

    @GetMapping("/authors")
    public ResponseEntity<List<Author>> getAuthors() {
        List<Author> list = (List<Author>) authorRepo.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
