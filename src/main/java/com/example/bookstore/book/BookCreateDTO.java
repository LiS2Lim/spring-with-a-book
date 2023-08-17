package com.example.bookstore.book;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class BookCreateDTO {
    @NonNull
    private String title;
    private String content;
    private int price;
    private String url;
    private LocalDate publishedDate;
}
