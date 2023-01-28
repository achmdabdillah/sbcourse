package com.abdillah.repository;

import com.abdillah.domain.Book;

public interface BookRepository {
    public Book findBookById(Long id);

}
