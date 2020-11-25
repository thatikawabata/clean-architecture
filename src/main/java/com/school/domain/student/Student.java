package com.school.domain.student;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Student {

    //ENTITY - UNIQUE VALUE(CPF)

    private CPF cpf;
    private String name;
    private Email email;

    private List<Phone> phones = new ArrayList<>();

    private String password;

    public Student(CPF cpf, String name, Email email) {
        this.cpf = cpf;
        this.name = name;
        this.email = email;
    }

    public void addPhone(String ddd, String number){
        this.phones.add(new Phone(ddd, number));
    }

}
