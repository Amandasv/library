package playground;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import static java.util.Arrays.asList;

public class Shelf {

    private final BookServiceInterface bookService;

    public Shelf(BookServiceInterface bookService)  {
        this.bookService = bookService;
    }


    List<String> names = new Stack<>();

    public void showBooks(List<String> names ) {
        bookService.getAllByName("harry potter");
    }
}
