package com.example.booksite._2_service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.booksite._3_repository.BookRepository;
import com.example.booksite._4_dto.BookCreateDTO;
import com.example.booksite._4_dto.BookDTO;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BookService {

    BookRepository bookRepository;
    
    public Integer bookCreate(BookCreateDTO book) {
        Integer id = bookRepository.save(BookCreateDTO.toBook(book)).getId();
        return id;
    }

    public List<BookDTO> getBookList() {
        List<BookDTO> list = bookRepository.findAll().stream()
                                .map(book -> BookDTO.createBookDTO(book))
                                .toList();
        return list;
    }

    public BookDTO getBookDetail(Integer id) {
        return BookDTO.createBookDTO(bookRepository.findById(id).get());
    }
}
