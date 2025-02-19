package com.ngvanloi.books.domain;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Book {

  private String isbn;

  private String author;

  private String title;
}