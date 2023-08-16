package com.example.booksite._4_dto;

import java.time.LocalDate;

import com.example.booksite._5_entity.Book;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.NonNull;

@Getter
@Setter
@ToString
public class BookDTO {

    @NonNull
    Integer id;

    @NonNull
    String title;

    @NonNull
    Integer price;

    @NonNull
    LocalDate issuing;

    String image;

    private BookDTO fromBook(Book book) {

        this.id = book.getId();
        this.title = book.getTitle();
        this.price = book.getPrice();
        this.issuing = book.getIssuing();
        this.image = book.getImage();

        return this;
    }

    public static BookDTO createBookDTO(Book book) {

        BookDTO bookDTO = new BookDTO();
        bookDTO.fromBook(book);

        return bookDTO;
    }
}
