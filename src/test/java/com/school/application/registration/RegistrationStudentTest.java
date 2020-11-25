package com.school.application.registration;

import com.school.domain.student.CPF;
import com.school.domain.student.StudentRepository;
import com.school.infra.student.StudentRepositoryInMemory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RegistrationStudentTest {

    @Test
    void savedStudent() {

        var respository = new StudentRepositoryInMemory();
        var useCase = new RegistrationStudent(respository);

        var student = new StudentDTO("Fulano", "123.456.789-00", "fulano@email.com");
        useCase.execute(student);

        var studentFind = respository.findByCPF(new CPF("123.456.789-00"));

        assertEquals("Fulano", studentFind.getName());
        assertEquals("123.456.789-00", studentFind.getCpf().getNumber());
        assertEquals("fulano@email.com", studentFind.getEmail().getEmail());

    }



}
