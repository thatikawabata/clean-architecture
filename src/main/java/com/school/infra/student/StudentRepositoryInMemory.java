package com.school.infra.student;

import com.school.domain.student.StudentNotFound;
import com.school.domain.student.CPF;
import com.school.domain.student.Student;
import com.school.domain.student.StudentRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryInMemory implements StudentRepository {

    private List<Student> registrations = new ArrayList<>();

    @Override
    public void registration(Student student) {
        this.registrations.add(student);
    }

    @Override
    public Student findByCPF(CPF cpf) {
        return this.registrations.stream()
                .filter(s -> s.getCpf().getNumber().equals(cpf.getNumber()))
                .findFirst()
                .orElseThrow(() -> new StudentNotFound(cpf));
    }

    @Override
    public List<Student> findByAllRegistrationStudents() {
        return this.registrations;
    }
}
