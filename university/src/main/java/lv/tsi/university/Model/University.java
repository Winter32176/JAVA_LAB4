package lv.tsi.university.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "University")
public class University {

    @JsonProperty
    @Id
    Long id;

    @JsonProperty
    String name;

    @JsonProperty
    String address;


    public University() {
    }

    public University(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
}
