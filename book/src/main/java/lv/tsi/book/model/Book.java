package lv.tsi.book.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {

    @JsonProperty
    @Id
    Long id;

    @JsonProperty
    String author;

    @JsonProperty
    String name;

    @JsonProperty
    int copies;

}
