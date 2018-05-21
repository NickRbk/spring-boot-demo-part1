package cursor.rybak.bootlesson.controller;

import cursor.rybak.bootlesson.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {

    @GetMapping("/")
    public List<Book> getBooks() {
        return Arrays.asList(
                new Book(1, "Harry Potter", "Fiction")
        );
    }
}
