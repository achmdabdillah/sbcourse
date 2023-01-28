package com.abdillah.service;

import com.abdillah.dto.BookDetailDto;

public interface BookService {
    public BookDetailDto findBookDetailById(Long bookId);
}
