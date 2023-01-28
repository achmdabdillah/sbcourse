package com.abdillah.service.impl;

import com.abdillah.domain.Author;
import com.abdillah.domain.Book;
import com.abdillah.dto.BookDetailDto;
import com.abdillah.repository.BookRepository;
import com.abdillah.service.BookService;

public class BookServiceImpl implements BookService {
    private Book book;

    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // public BookServiceImpl() {
    // Author author = new Author();
    // book = new Book(author);
    // }

    @Override
    public BookDetailDto findBookDetailById(Long bookId) {
        Book book = bookRepository.findBookById(bookId);
        BookDetailDto dto = new BookDetailDto();
        dto.setBookId(book.getId());
        dto.setAuthorName(book.getAuthor().getName());
        dto.setBookTitle(book.getTitle());
        dto.setBookDescription(book.getDescription());

        return dto;
    }

    // public BookRepository getBookRepository() {
    // return this.bookRepository;
    // }

    // public void setBookRepository(BookRepository bookRepository) {
    // this.bookRepository = bookRepository;
    // }

}
