package com.example.bookstore.book;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    public Book createBook(BookCreateDTO bookCreateDTO) {
        Book book = bookCreateDTO.toBook();
        bookRepository.save(book);
        return book;
    }

    public List<Book> readBooks() {
        List<Book> books = bookRepository.findAll();
        return books;
    }

    public Book readBook(int id) {
        Book book = bookRepository.findById(id).orElseThrow();
        return book;
    }

    public Book deleteBook(int id) {
        Book book = readBook(id);
        bookRepository.delete(book);
        return book;
    }
}
