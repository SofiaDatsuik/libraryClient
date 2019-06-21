package api;

import com.epam.web.ConnectionFactory;
import org.testng.annotations.DataProvider;

public class FunctionalDataProvider {


    @DataProvider
    protected Object[] getData() {
        return new Object[]{ConnectionFactory.getLibraryService("REST"),
                            ConnectionFactory.getLibraryService("SOAP")};
    }
}
