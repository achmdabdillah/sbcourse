package com.abdillah;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.abdillah.domain.Author;
import com.abdillah.domain.Book;
import com.abdillah.dto.BookDetailDto;
import com.abdillah.service.BookService;

public class App {
    public static void main(String[] args) {
        // ApplicationContext appCtx = new
        // ClassPathXmlApplicationContext("application-context.xml");
        ApplicationContext appCtx = new FileSystemXmlApplicationContext(
                "C:/Users/achmd/OneDrive/Desktop/course/spring/sbcourse/src/main/resources/application-context.xml");

        BookService bs = (BookService) appCtx.getBean("bookService");

        BookDetailDto dto = bs.findBookDetailById(1L);

        System.out.println("Book detail = " + dto);
    }
}
