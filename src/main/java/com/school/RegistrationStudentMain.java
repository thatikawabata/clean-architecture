package com.school;

import com.school.application.registration.RegistrationStudent;
import com.school.application.registration.StudentDTO;
import com.school.domain.student.CPF;
import com.school.domain.student.Email;
import com.school.infra.student.StudentRepositoryInMemory;

public class RegistrationStudentMain {

    public static void main(String[] args) {
         var name = "Fulano da Silva";
         var cpf ="123.456.789-00";
         var email = "fulano@email.com";

        var registrationStudent = new RegistrationStudent(new StudentRepositoryInMemory());
        registrationStudent.execute(new StudentDTO(name, cpf, email));

    }
}
