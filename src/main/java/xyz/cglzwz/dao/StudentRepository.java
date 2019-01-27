package xyz.cglzwz.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import xyz.cglzwz.domain.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, String> { }
