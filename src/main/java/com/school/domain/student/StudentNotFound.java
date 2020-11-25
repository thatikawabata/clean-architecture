package com.school.domain.student;

import com.school.domain.student.CPF;

public class StudentNotFound extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public StudentNotFound(CPF cpf) {
        super("Aluno nao encontrado com CPF: " + cpf.getNumber());
    }
}
