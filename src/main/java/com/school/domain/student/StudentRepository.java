package com.school.domain.student;

import java.util.List;

public interface StudentRepository {

    void registration(Student student);
    Student findByCPF(CPF cpf);
    List<Student> findByAllRegistrationStudents();

}
