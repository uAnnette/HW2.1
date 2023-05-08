package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UserNotFoundException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите логин");
        String login = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();

        getUserByLoginAndPassword(login, password);

        validateUser(getUserByLoginAndPassword(login, password));

        System.out.println(getUserByLoginAndPassword(login, password));
    }

    public static User[] getUsers() {
        User user1 = new User("jhon", "jhon@gmail.com", "pass", 24);
        User user2 = new User("elle", "elle@gmail.com", "passw", 15);
        User user3 = new User("annie", "annie@gmail.com", "paswor", 19);
        User user4 = new User("petya", "petya@gmail.com", "pss", 13);
        return new User[]{user1, user2, user3, user4};
    }

    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers();
        for (User user : users) {
            if (login.equals(user.getLogin()) && password.equals(user.getPassword())) {
                return user;
            }
        }
        throw new UserNotFoundException("Пользователь не найден");
    }

    public static String validateUser(User user) {
        if (user.getAge() < 18) {
            return "Возраст меньше 18-ти лет";
        } else {
            return "Доступ предоставлен";
        }
    }
}