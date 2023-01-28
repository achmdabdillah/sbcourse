package com.abdillah.dto;

import java.io.Serializable;

public class BookDetailDto implements Serializable {
    private Long bookId;
    private String authorName;
    private String bookTitle;
    private String bookDescription;

    public Long getBookId() {
        return this.bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookDescription() {
        return this.bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    @Override
    public String toString() {
        return "{" +
                " bookId='" + getBookId() + "'" +
                ", authorName='" + getAuthorName() + "'" +
                ", bookTitle='" + getBookTitle() + "'" +
                ", bookDescription='" + getBookDescription() + "'" +
                "}";
    }

}
