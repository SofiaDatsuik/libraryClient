
package com.epam.web.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.epam.web.soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetBooksByAuthor_QNAME = new QName("http://soap.web.epam.com/", "getBooksByAuthor");
    private final static QName _GetBooksByAuthorResponse_QNAME = new QName("http://soap.web.epam.com/", "getBooksByAuthorResponse");
    private final static QName _GetAllBooksResponse_QNAME = new QName("http://soap.web.epam.com/", "getAllBooksResponse");
    private final static QName _AddBook_QNAME = new QName("http://soap.web.epam.com/", "addBook");
    private final static QName _LibraryFault_QNAME = new QName("http://soap.web.epam.com/", "LibraryFault");
    private final static QName _AddBookResponse_QNAME = new QName("http://soap.web.epam.com/", "addBookResponse");
    private final static QName _DeleteBook_QNAME = new QName("http://soap.web.epam.com/", "deleteBook");
    private final static QName _GetAllBooks_QNAME = new QName("http://soap.web.epam.com/", "getAllBooks");
    private final static QName _GetBookResponse_QNAME = new QName("http://soap.web.epam.com/", "getBookResponse");
    private final static QName _GetBook_QNAME = new QName("http://soap.web.epam.com/", "getBook");
    private final static QName _DeleteBookResponse_QNAME = new QName("http://soap.web.epam.com/", "deleteBookResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.epam.web.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteBook }
     * 
     */
    public DeleteBook createDeleteBook() {
        return new DeleteBook();
    }

    /**
     * Create an instance of {@link GetAllBooks }
     * 
     */
    public GetAllBooks createGetAllBooks() {
        return new GetAllBooks();
    }

    /**
     * Create an instance of {@link GetBookResponse }
     * 
     */
    public GetBookResponse createGetBookResponse() {
        return new GetBookResponse();
    }

    /**
     * Create an instance of {@link GetBook }
     * 
     */
    public GetBook createGetBook() {
        return new GetBook();
    }

    /**
     * Create an instance of {@link DeleteBookResponse }
     * 
     */
    public DeleteBookResponse createDeleteBookResponse() {
        return new DeleteBookResponse();
    }

    /**
     * Create an instance of {@link AddBookResponse }
     * 
     */
    public AddBookResponse createAddBookResponse() {
        return new AddBookResponse();
    }

    /**
     * Create an instance of {@link GetAllBooksResponse }
     * 
     */
    public GetAllBooksResponse createGetAllBooksResponse() {
        return new GetAllBooksResponse();
    }

    /**
     * Create an instance of {@link AddBook }
     * 
     */
    public AddBook createAddBook() {
        return new AddBook();
    }

    /**
     * Create an instance of {@link LibraryFault }
     * 
     */
    public LibraryFault createLibraryFault() {
        return new LibraryFault();
    }

    /**
     * Create an instance of {@link GetBooksByAuthor }
     * 
     */
    public GetBooksByAuthor createGetBooksByAuthor() {
        return new GetBooksByAuthor();
    }

    /**
     * Create an instance of {@link GetBooksByAuthorResponse }
     * 
     */
    public GetBooksByAuthorResponse createGetBooksByAuthorResponse() {
        return new GetBooksByAuthorResponse();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBooksByAuthor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.web.epam.com/", name = "getBooksByAuthor")
    public JAXBElement<GetBooksByAuthor> createGetBooksByAuthor(GetBooksByAuthor value) {
        return new JAXBElement<GetBooksByAuthor>(_GetBooksByAuthor_QNAME, GetBooksByAuthor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBooksByAuthorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.web.epam.com/", name = "getBooksByAuthorResponse")
    public JAXBElement<GetBooksByAuthorResponse> createGetBooksByAuthorResponse(GetBooksByAuthorResponse value) {
        return new JAXBElement<GetBooksByAuthorResponse>(_GetBooksByAuthorResponse_QNAME, GetBooksByAuthorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBooksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.web.epam.com/", name = "getAllBooksResponse")
    public JAXBElement<GetAllBooksResponse> createGetAllBooksResponse(GetAllBooksResponse value) {
        return new JAXBElement<GetAllBooksResponse>(_GetAllBooksResponse_QNAME, GetAllBooksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.web.epam.com/", name = "addBook")
    public JAXBElement<AddBook> createAddBook(AddBook value) {
        return new JAXBElement<AddBook>(_AddBook_QNAME, AddBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LibraryFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.web.epam.com/", name = "LibraryFault")
    public JAXBElement<LibraryFault> createLibraryFault(LibraryFault value) {
        return new JAXBElement<LibraryFault>(_LibraryFault_QNAME, LibraryFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.web.epam.com/", name = "addBookResponse")
    public JAXBElement<AddBookResponse> createAddBookResponse(AddBookResponse value) {
        return new JAXBElement<AddBookResponse>(_AddBookResponse_QNAME, AddBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.web.epam.com/", name = "deleteBook")
    public JAXBElement<DeleteBook> createDeleteBook(DeleteBook value) {
        return new JAXBElement<DeleteBook>(_DeleteBook_QNAME, DeleteBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.web.epam.com/", name = "getAllBooks")
    public JAXBElement<GetAllBooks> createGetAllBooks(GetAllBooks value) {
        return new JAXBElement<GetAllBooks>(_GetAllBooks_QNAME, GetAllBooks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.web.epam.com/", name = "getBookResponse")
    public JAXBElement<GetBookResponse> createGetBookResponse(GetBookResponse value) {
        return new JAXBElement<GetBookResponse>(_GetBookResponse_QNAME, GetBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.web.epam.com/", name = "getBook")
    public JAXBElement<GetBook> createGetBook(GetBook value) {
        return new JAXBElement<GetBook>(_GetBook_QNAME, GetBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.web.epam.com/", name = "deleteBookResponse")
    public JAXBElement<DeleteBookResponse> createDeleteBookResponse(DeleteBookResponse value) {
        return new JAXBElement<DeleteBookResponse>(_DeleteBookResponse_QNAME, DeleteBookResponse.class, null, value);
    }

}
