package com.example.demo;

import org.springframework.stereotype.Service;
import java.util.Collection;
import java.util.ArrayList;

@Service
public class BookServiceImpl implements BookService {
    private final Collection<Book> books = new ArrayList<>();

    @Override
    public Collection<Book> getBooks() {
        return books;
    }

    @Override
    public Book addBook(Book book) {
        books.add(book);
        return book;
    }
}
