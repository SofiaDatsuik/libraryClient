package com.epam.web.rest;


import com.epam.utils.parser.PropertyParser;
import com.epam.web.LibraryService;
import com.epam.web.soap.Book;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import javax.ws.rs.core.MediaType;
import java.util.List;

public class LibraryServiceRestClient implements LibraryService {

    public Logger LOG = Logger.getLogger(LibraryServiceRestClient.class);
    private static PropertyParser property = new PropertyParser();
    private ObjectMapper mapper = new ObjectMapper();

    private Client client;

    private List<Book> books = null;

    @Override
    public List<Book> getAllBooks() {
        LOG.info("getAllBooks method");
        try {
            client = Client.create();
            WebResource webResource = client
                    .resource(property.getProperty("REST_SERVICE_ADDRESS") + "/books");

            ClientResponse response = webResource.accept(MediaType.APPLICATION_JSON)
                    .get(ClientResponse.class);

            if (response.getStatus() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatus());
            }
            String output = response.getEntity(String.class);
            new TypeReference<List<Book>>() {
            };
            books = mapper.readValue(output, new TypeReference<List<Book>>() {
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        return books;
    }


    @Override
    public Book getBook(String title) {
        LOG.info("getBook method");
        Book book = null;
        try {
            client = Client.create();
            WebResource webResource = client
                    .resource(property.getProperty("REST_SERVICE_ADDRESS") + "/books/" + title.replace(" ", "%20"));
            ClientResponse response = webResource.accept(MediaType.APPLICATION_JSON)
                    .get(ClientResponse.class);
            if (response.getStatus() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatus());
            }
            String output = response.getEntity(String.class);
            book = mapper.readValue(output, new TypeReference<Book>() {
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        return book;
    }

    @Override
    public boolean deleteBook(String title) {
        LOG.info("deleteBook");
        WebResource webResource = client.resource(property.getProperty("REST_SERVICE_ADDRESS") + "/book");
        ClientResponse response = webResource.accept(MediaType.APPLICATION_JSON + ";charset=UTF-8").type(MediaType.APPLICATION_JSON)
                .delete(ClientResponse.class, title);
        if (response.getStatus() != 200) {
            throw new RuntimeException("Failed : HTTP error code : "
                    + response.getStatus());
        }
        return true;
    }

    @Override
    public List<Book> getBooksByAuthor(String authorName) {
        LOG.info("getBooksByAuthor method");
        try {
            client = Client.create();
            WebResource webResource = client
                    .resource(property.getProperty("REST_SERVICE_ADDRESS") + "/book/" + authorName.replace(" ", "%20"));
            ClientResponse response = webResource.accept(MediaType.APPLICATION_JSON_TYPE)
                    .get(ClientResponse.class);
            if (response.getStatus() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatus());
            }
            String output = response.getEntity(String.class);
            books = mapper.readValue(output, new TypeReference<List<Book>>() {
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        return books;
    }

    @Override
    public boolean addBook(Book book) {
        try {
            client = Client.create();
            WebResource webResource = client
                    .resource(property.getProperty("REST_SERVICE_ADDRESS") + "/book/");
            ClientResponse response = webResource.type(MediaType.APPLICATION_JSON)
                    .post(ClientResponse.class, mapper.writeValueAsString(book));
            if (response.getStatus() != 201) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatus());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
}
