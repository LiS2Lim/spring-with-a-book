package com.example.bookstore.book;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/book")
public class BookController {
    private final BookService bookService;

    @PostMapping("/create")
    public int createBook(@RequestBody BookCreateDTO bookCreateDTO) {
        Book book = bookService.createBook(bookCreateDTO);
        return book.getId();
    }

    @GetMapping("/list")
    public List<Book> readBooks() {
        List<Book> books = bookService.readBooks();
        return books;
    }

    @GetMapping("/{id}")
    public Book readBook(@PathVariable int id) {
        try {
            Book book = bookService.readBook(id);
            return book;
        } catch (NoSuchElementException e) {
            return null;
        }
    }

    @DeleteMapping("/delete")
    public Book deleteBook(@RequestBody Map<String, String> map) {
        try {
            int id = Integer.parseInt(map.get("id"));
            return bookService.deleteBook(id);
        } catch (NoSuchElementException e) {
            return null;
        }
    }
    
}
