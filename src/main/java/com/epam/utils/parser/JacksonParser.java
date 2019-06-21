package com.epam.utils.parser;

import com.epam.web.soap.Book;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class JacksonParser {
    private final int CHOOSEN_BOOK = 0 ;

    private ObjectMapper objectMapper;
    private Logger logger = LogManager.getLogger(JacksonParser.class);

    public JacksonParser() {
        this.objectMapper = new ObjectMapper();
    }

    public List<Book> readBooks(File file) {
        Book[] books = new Book[CHOOSEN_BOOK];
        try {
            books = objectMapper.readValue(file, Book[].class);
        } catch (IOException e) {
            logger.error(e.getClass());
            e.printStackTrace();
        }
        return Arrays.asList(books);
    }

    public void writeBooks(List<Book> books, File file) {
        try {
            objectMapper.writeValue(file, books);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
