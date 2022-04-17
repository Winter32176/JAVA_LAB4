package lv.tsi.university.Controller;

import lv.tsi.university.Model.University;
import lv.tsi.university.Service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UniversityController {
   /* private final UniversityRepository universityRepository;

    @Autowired
    public UniversityController(UniversityRepository universityRepository) {
        this.universityRepository = universityRepository;
    }
*/
    private final UniversityService universityService;

    @Autowired
    public UniversityController(UniversityService universityService) {
        this.universityService = universityService;
    }

    @GetMapping("/university")
    public ResponseEntity<Iterable<University>> getUniversities() {
        return universityService.getUniversities();
    }
    /* @GetMapping("/getUniversity/{id})
    public ResponseEntity getUniversityById(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
     }*/
}
