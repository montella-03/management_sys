package schoolmanagement.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import schoolmanagement.school.Entity.StaffEntity;

@Repository
public interface StaffRepository extends JpaRepository<StaffEntity,Long> {
}
