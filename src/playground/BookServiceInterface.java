package playground;

import com.twu.biblioteca.Book;

import java.util.List;

public interface BookServiceInterface {
    List<String> getAllByName(String name);
    Book getBookById(int id);
}