package com.school.application.registration;

import com.school.domain.student.CPF;
import com.school.domain.student.Email;
import com.school.domain.student.Student;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class StudentDTO {

    private String nameStudent;
    private String cpfStudent;
    private String emailStudent;

    public Student create(){
        return new Student(
                new CPF(cpfStudent), nameStudent, new Email(emailStudent));
    }

}
