package lv.tsi.university.Service;

import lombok.RequiredArgsConstructor;
import lv.tsi.university.Model.University;
import lv.tsi.university.Repository.UniversityRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UniversityService {
    private final UniversityRepository universityRepository;

    public ResponseEntity<List<University>> getUniversities() {
        return (ResponseEntity<List<University>>) universityRepository.findAll();
    }

}
