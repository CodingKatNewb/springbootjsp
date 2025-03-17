package com.example.demo;

import java.util.List;

public interface BookService {
    List<Book> getBooks();
    Book addBook(Book book);
}
