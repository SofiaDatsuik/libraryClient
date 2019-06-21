package com.epam.web;

import com.epam.utils.parser.PropertyParser;
import com.epam.web.rest.LibraryServiceRestClient;
import com.epam.web.soap.LibraryServiceImplService;
import org.apache.log4j.Logger;

public class ConnectionFactory {

    private static Logger LOG = Logger.getLogger(ConnectionFactory.class);
    private static PropertyParser property = new PropertyParser();

    public static LibraryService getLibraryService(String service) {
        LOG.info("getLibraryService method");

        LibraryService library;
        if (service.equals(property.getProperty("REST"))) {
            LOG.info("Rest Library Service Client");
            library = new LibraryServiceRestClient();
        } else if (service.equals(property.getProperty("SOAP"))) {
            LOG.info("Soap Library Service Client");
            library = new LibraryServiceImplService().getLibraryServiceImplPort();
        } else {
            LOG.info("Enter correct service");
            throw new RuntimeException();
        }
        return library;
    }
}
