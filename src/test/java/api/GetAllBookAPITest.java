package api;

import com.epam.web.ConnectionFactory;
import com.epam.web.LibraryService;
import com.epam.web.soap.Book;
import com.epam.web.soap.ServiceException;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class GetAllBookAPITest extends FunctionalDataProvider {
    private Logger LOG = Logger.getLogger(GetAllBookAPITest.class);

    @Test(dataProvider = "getData")
    public void getAllBooksTest(LibraryService libraryService) throws ServiceException {
        LOG.info("getAllBooksTest");
        libraryService = ConnectionFactory.getLibraryService("REST");
        List<Book> books = libraryService.getAllBooks();
        Assert.assertNotNull(books);
    }

}
