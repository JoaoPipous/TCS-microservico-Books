package com.TCS.microservico_Books.repositories;

import com.TCS.microservico_Books.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Book, Long> {


}
