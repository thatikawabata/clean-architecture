package com.school.domain.student;

public interface PasswordEncrypt {

    String encrypt(String password);
    boolean validatePassword(String passwordEncrypt, String password);

}
