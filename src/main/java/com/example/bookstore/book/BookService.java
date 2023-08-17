package com.example.bookstore.book;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BookService {
    private BookRepository bookRepository;

    public Book createBook(BookCreateDTO bookCreateDTO) {
        Book book = Book.builder()
                    .title(bookCreateDTO.getTitle())
                    .content(bookCreateDTO.getContent())
                    .price(bookCreateDTO.getPrice())
                    .url(bookCreateDTO.getUrl())
                    .publishedDate(bookCreateDTO.getPublishedDate())
                    .build();
        bookRepository.save(book);
        return book;
    }

    public List<Book> readBooks() {
        List<Book> books = bookRepository.findAll();
        return books;
    }

    public Book readBook(int id) {
        Book book = bookRepository.findById(id).get();
        return book;
    }

    public boolean deleteBook(int id) {
        try {
            bookRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
