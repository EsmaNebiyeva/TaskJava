package examples;

import java.util.List;
import java.util.Map;

public class LibraryCatalog {
    Map<String, Book> catalog;

    public Map<String, Book> getCatalog() {
        return catalog;
    }

    public void setCatalog(Map<String, Book> catalog) {
        this.catalog = catalog;
    }

    public LibraryCatalog(Map<String, Book> catalog) {
        this.catalog = catalog;
    }

    @Override
    public String toString() {
        return "LibraryCatalog{" +
                "catalog=" + catalog +
                '}';
    }

    void addBook(Book book) {

    }

    Book removeBook(String isbn) {
        return catalog.remove(isbn);
    }
    Book getBook(String isbn){
        return catalog.get(isbn);
    }
    List<Book> listBooks() {
        return (List<Book>) catalog.values();
    }
    void checkOutBook(String isbn){

    }
    void checkInBook(String isbn){

    }

}
