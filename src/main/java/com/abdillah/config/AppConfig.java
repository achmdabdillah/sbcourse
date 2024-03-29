package com.abdillah.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.abdillah.domain.Author;
import com.abdillah.domain.Book;
import com.abdillah.repository.BookRepository;
import com.abdillah.repository.impl.BookRepositoryImpl;
import com.abdillah.service.BookService;
import com.abdillah.service.impl.BookServiceImpl;

@Configuration
public class AppConfig {

    @Bean
    public Author author() {
        return new Author(1L, -16401L, "Pramoedya Ananta Toer");
    }

    @Bean
    public Book book1() {
        Book book1 = new Book();
        book1.setId(1L);
        book1.setTitle("Bumi Manusia");
        book1.setDescription("Bumi Manusia adalah karya pramoedya");
        book1.setAuthor(author());

        return book1;
    }

    @Bean
    public Book book2() {
        Book book2 = new Book();
        book2.setId(2L);
        book2.setTitle("Arok Dedes");
        book2.setDescription("Arok Dedes adalah karya pramoedya");
        book2.setAuthor(author());

        return book2;
    }

    @Bean
    public BookRepository bookRepository(Book book1, Book book2) {
        Map<Long, Book> bookMap = new HashMap<Long, Book>();
        bookMap.put(1L, book1);
        bookMap.put(2L, book2);

        BookRepositoryImpl bookRepository = new BookRepositoryImpl();

        bookRepository.setBookMap(bookMap);

        return bookRepository;
    }

    @Bean
    public BookService bookService(BookRepository bookRepository) {
        return new BookServiceImpl(bookRepository);
    }
}
