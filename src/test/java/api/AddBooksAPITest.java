package api;

import com.epam.web.ConnectionFactory;
import com.epam.web.LibraryService;
import com.epam.web.soap.Book;
import com.epam.web.soap.ServiceException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddBooksAPITest extends FunctionalDataProvider {


    @Test(dataProvider = "getData")
    public void addBookAPITest(LibraryService libraryService) throws ServiceException {
        libraryService = ConnectionFactory.getLibraryService("REST");


    }

    @Test(dataProvider = "getData")
    public void deleteBookTestService(LibraryService libraryService) throws ServiceException {
        libraryService = ConnectionFactory.getLibraryService("SOAP");
        libraryService.deleteBook("jfdj");

    }
}
