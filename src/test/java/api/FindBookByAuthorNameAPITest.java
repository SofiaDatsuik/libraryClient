package api;

import com.epam.utils.parser.JacksonParser;
import com.epam.utils.parser.PropertyParser;
import com.epam.web.ConnectionFactory;
import com.epam.web.LibraryService;
import com.epam.web.soap.Book;
import com.epam.web.soap.ServiceException;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class FindBookByAuthorNameAPITest extends FunctionalDataProvider {

    public Logger LOG = Logger.getLogger(FindBookAPITest.class);

    private static PropertyParser property = new PropertyParser();
    private static JacksonParser parser = new JacksonParser();


    @Test(dataProvider = "getData")
    public void getFiveAuthorsBooksRest(LibraryService libraryService) throws ServiceException {
        LOG.info("getFiveAuthorsBooks");
        libraryService = ConnectionFactory.getLibraryService("REST");
        List<Book> bookList = null;
        try {
            bookList = libraryService.getBooksByAuthor("");
        } catch (ServiceException e) {
            e.printStackTrace();
        }

//        Assert.assertNotNull(bookList);

        Assert.assertTrue(bookList.size() == 5);
    }
}
