package com.abdillah;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abdillah.domain.Author;
import com.abdillah.dto.BookDetailDto;
import com.abdillah.service.BookService;

public class App {
    public static void main(String[] args) {
        // Author author = new Author();

        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("application-context.xml");

        // Author author = (Author) appContext.getBean("author");

        // System.out.println("author name :" + author.getName());
        // System.out.println("author id :" + author.getId());

        BookService bookService = (BookService) appContext.getBean("bookService");
        BookDetailDto bookDetailDto = bookService.findBookDetailById(2L);
        System.out.println("bookDetailDto" + bookDetailDto.toString());

        // Author author = (Author) appContext.getBean("author");
        // System.out.println(author.toString());

    }
}
