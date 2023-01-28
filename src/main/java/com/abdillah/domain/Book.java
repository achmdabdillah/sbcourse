package com.abdillah.domain;

import java.io.Serializable;

public class Book implements Serializable {

    private Long id;

    private String title;

    private String description;

    private Author author;

    public Book() {
        super();
    }

    public Book(Author author) {
        super();
        this.author = author;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

}
