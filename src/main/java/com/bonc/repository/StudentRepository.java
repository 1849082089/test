package com.bonc.repository;

import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bonc.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {
}
