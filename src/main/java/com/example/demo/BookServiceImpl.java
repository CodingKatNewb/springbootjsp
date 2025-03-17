package com.example.demo;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;

@Service
public class BookServiceImpl implements BookService {
    private final List<Book> books = new ArrayList<>();

    @Override
    public List<Book> getBooks() {
        return books;
    }

    @Override
    public Book addBook(Book book) {
        books.add(book);
        return book;
    }
}
