package com.example.booksite._1_controller;

import java.time.LocalDate;
import java.util.*;

import org.springframework.web.bind.annotation.*;

import com.example.booksite._2_service.BookService;
import com.example.booksite._4_dto.BookCreateDTO;
import com.example.booksite._4_dto.BookDTO;
import com.example.booksite._5_entity.Book;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/book")
@AllArgsConstructor
public class BookController {

    private final BookService bookService;

    @CrossOrigin(origins = "http://stg.li521lim.com")
    @PostMapping("/create")
    public Integer bookCreate(@RequestBody BookCreateDTO bookDTO) {
        System.out.println(bookDTO);
        Integer id = bookService.bookCreate(bookDTO);
        return id;
    }
    
    @GetMapping("/list")
    public List<BookDTO> bookList() {
        List<BookDTO> list = bookService.getBookList();
        System.out.println(list);
        return list;
    }

    @GetMapping("/{id}")
    public BookDTO bookDetails(@PathVariable String id) {
        BookDTO book;
        try {
            book = bookService.getBookDetail(Integer.parseInt(id));
        } catch (NoSuchElementException e) {
            book = BookDTO.createBookDTO(Book.builder()
                                            .title("none")
                                            .price(0)
                                            .issuing(LocalDate.now())
                                            .build());
        }
        System.out.println(book);
        return book;
    }
}
