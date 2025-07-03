package com.TCS.microservico_Books.resources;

import com.TCS.microservico_Books.entities.Book;
import com.TCS.microservico_Books.repositories.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class BooksResource {

    private final BooksRepository repository;

    @Autowired
    public BooksResource(BooksRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public ResponseEntity<List<Book>> findAll() {
        List<Book> books = repository.findAll();
        return ResponseEntity.ok(books);
    }

    // Novo endpoint para adicionar livros
    @PostMapping
    public ResponseEntity<Book> create(@RequestBody Book book) {
        Book saved = repository.save(book);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }
}
