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
public class BookCreateDTO {

    @NonNull
    String title;

    @NonNull
    Integer price;

    public static Book toBook(BookCreateDTO bookCreateDTO) {
        Book book = Book.builder()
                    .title(bookCreateDTO.getTitle())
                    .price(bookCreateDTO.getPrice())
                    .issuing(LocalDate.now())
                    .build();
        return book;
    }
}
