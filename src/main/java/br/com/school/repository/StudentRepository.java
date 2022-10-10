package br.com.school.repository;

import br.com.school.hexagono.domain.Student;

public interface StudentRepository {

    void delete(Student student);
    Student findById(Long id);
}
