package com.abdillah.catalog.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class BookDetailDto implements Serializable {

    private static final long serialVersionUID = -3358288267L;

    private Long bookId;
    private String authorName;
    private String bookTitle;
    private String bookDescription;
}
