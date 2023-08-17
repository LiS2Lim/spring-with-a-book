package com.example.bookstore.book;

import java.time.LocalDate;

import lombok.Getter;
import lombok.NonNull;

@Getter
public class BookCreateDTO {
    @NonNull
    private String title;
    private String content;
    private int price;
    private String url;
    private LocalDate publishedDate;

    public Book toBook() {
        Book book = Book.builder()
                        .title(this.title)
                        .content(this.content)
                        .price(this.price)
                        .url(this.url)
                        .publishedDate(this.publishedDate)
                        .build();
        return book;
    }
}
