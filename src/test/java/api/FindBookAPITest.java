package api;


import com.epam.utils.listener.Listener;
import com.epam.web.ConnectionFactory;
import com.epam.web.LibraryService;
import com.epam.web.soap.Book;
import com.epam.web.soap.ServiceException;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Listener.class)
public class FindBookAPITest extends FunctionalDataProvider {
    public Logger LOG = Logger.getLogger(FindBookAPITest.class);
    String bookTitle = "Reviews";

    @Test(dataProvider = "getData")
    public void searchBookWithWrongTitleRest(LibraryService libraryService) throws ServiceException {
        LOG.info("Search book with uncorrect input data");
        libraryService = ConnectionFactory.getLibraryService("REST");
        LOG.info("Incorrect bookTitle is:" + bookTitle);
        Book book = libraryService.getBook(bookTitle);
        Assert.assertFalse(book.getTitle().contains(bookTitle));
    }

    @Test(dataProvider = "getData")
    public void searchBookWithCorrectTitleSoap(LibraryService libraryService) throws ServiceException {
        LOG.info("Search book with uncorrect input data");
        libraryService = ConnectionFactory.getLibraryService("SOAP");
        LOG.info("Incorrect bookTitle is:" + bookTitle);
        Book book = libraryService.getBook(bookTitle);
        Assert.assertTrue(book.getTitle().contains(bookTitle));
    }

}


