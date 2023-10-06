package com.example.java_week_4;
import java.util.Random;

public class PasswordRandomizer {
    private final int length;
    private final Random random;

    public PasswordRandomizer(int length) {
        this.length = length;
        this.random = new Random();
    }

    public String createPassword() {
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            char symbol = (char) ('a' + random.nextInt(26)); // Generate a random lowercase letter
            password.append(symbol);
        }

        return password.toString();
    }

    public static void main(String[] args) {
        PasswordRandomizer randomizer = new PasswordRandomizer(13);
        String password1 = randomizer.createPassword();
        String password2 = randomizer.createPassword();
        String password3 = randomizer.createPassword();
        String password4 = randomizer.createPassword();

        System.out.println("Password: " + password1);
        System.out.println("Password: " + password2);
        System.out.println("Password: " + password3);
        System.out.println("Password: " + password4);
    }
}

