package com.example.booksite._3_repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.booksite._5_entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    
}
