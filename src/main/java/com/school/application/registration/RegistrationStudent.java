package com.school.application.registration;

import com.school.domain.student.StudentRepository;

public class RegistrationStudent {

    private StudentRepository repository;

    public RegistrationStudent(StudentRepository repository) {
        this.repository = repository;
    }

    //DESIGN PATTERN - COMMAND
    public void execute(StudentDTO studentDTO){
        var newStudent = studentDTO.create();
        repository.registration(newStudent);
    }

}
