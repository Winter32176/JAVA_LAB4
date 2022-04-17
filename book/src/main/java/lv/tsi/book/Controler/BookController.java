package lv.tsi.book.Controler;

import lv.tsi.book.Repository.BookRepository;
import lv.tsi.book.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class BookController {
    private final BookRepository bookRepository;

    @Autowired
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/Books")
    public ResponseEntity<Iterable<Book>> findBook() {
        return  ResponseEntity.ok(bookRepository.findAll());
    }

    @GetMapping("/BooksID")
    public ResponseEntity<Optional<Book>> findBookById(@RequestParam(value ="id", defaultValue = "0") Long id) {
        return ResponseEntity.ok(bookRepository.findById(id));
    }


}
