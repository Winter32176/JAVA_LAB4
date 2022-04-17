package lv.tsi.book.Controler;

import lv.tsi.book.Repository.BookRepository;
import lv.tsi.book.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    private final BookRepository bookRepository;

    @Autowired
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

  /*  @GetMapping("/getBook")
    public ResponseEntity<Book> findBook(int id) {
        return ResponseEntity.of(bookRepository.findById(id), HttpStatus.OK);
    }

    @GetMapping("/getBooks")
    public ResponseEntity<List<Books>> findBooks() {
        return new ResponseEntity<List<Books>>(bookRepository.findAll(), HttpStatus.OK);
    }
*/

}
