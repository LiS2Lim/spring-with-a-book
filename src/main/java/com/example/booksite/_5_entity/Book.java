package com.example.booksite._5_entity;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(length = 200, nullable = false)
    String title;

    @Column(nullable = false)
    Integer price;

    @Column(nullable = false)
    LocalDate issuing;

    @Column(columnDefinition = "TEXT")
    String image;
}
