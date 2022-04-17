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

    @JsonProperty
    int yearOfAccreditation;

    public University() {
    }

    public University(Long id, String name, String address, int yearOfAccreditation) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.yearOfAccreditation = yearOfAccreditation;
    }
}
