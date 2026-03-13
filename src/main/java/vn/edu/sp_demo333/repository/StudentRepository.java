package vn.edu.sp_demo333.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.sp_demo333.entity.Students;

public interface StudentRepository extends JpaRepository<Students, Long> {

}
