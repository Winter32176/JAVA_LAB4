package lv.tsi.university.Service;

import lv.tsi.university.Model.University;
import lv.tsi.university.Repository.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
//@RequiredArgsConstructor
public class UniversityService {
    private final UniversityRepository universityRepository;

    @Autowired
    public UniversityService(UniversityRepository universityRepository) {
        this.universityRepository = universityRepository;
    }

    //    public ResponseEntity<List<University>> getUniversities() {
//        return (ResponseEntity<List<University>>) universityRepository.findAll();
//    }
    public ResponseEntity<Iterable<University>> getUniversities() {
        return ResponseEntity.ok(universityRepository.findAll());
    }
}
