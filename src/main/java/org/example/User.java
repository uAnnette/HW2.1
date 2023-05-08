package org.example;

public class User {

    private String login;
    private String password;
    private String email;
    private int age;

    public User(String login, String email, String password, int age) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return email;
    }
}

