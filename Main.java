package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        phonebook.add(1112233, "Иванов");
        phonebook.add(2223344, "Петров");
        phonebook.add(3334455, "Сидоров");
        phonebook.add(7548732, "Бобров");
        phonebook.add(4445566, "Олишкевич");
        phonebook.add(5556677, "Величко");
        phonebook.add(6667788, "Чилик");

        phonebook.get("Бобров");
        phonebook.get("Шишкин");
    }
}
