package lv.tsi.university.Repository;

import lv.tsi.university.Model.University;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversityRepository extends CrudRepository<University,Long> {
}
