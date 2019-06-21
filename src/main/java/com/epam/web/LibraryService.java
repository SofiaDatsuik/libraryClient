package com.epam.web;

import com.epam.web.soap.Book;
import com.epam.web.soap.ServiceException;

import java.util.List;

public interface LibraryService {

    List<Book> getAllBooks() throws ServiceException;

    Book getBook(String title) throws ServiceException;

    boolean deleteBook(String title);

    List<Book> getBooksByAuthor(String authorName) throws ServiceException;

    boolean addBook(Book book) throws ServiceException;
}
