package com.company;

import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    private Map<Integer, String> phonebook;
    private int phoneNumber;
    private String name;

    public Phonebook(){
        phonebook = new HashMap<Integer, String>();
    }

    public void add(int phoneNumber, String name){
        phonebook.put(phoneNumber, name);
    }

    public void get(String name){
        if (phonebook.containsValue(name)){
            for (Map.Entry<Integer, String> temp : phonebook.entrySet()) {
                if (temp.getValue().equals(name)){
                    System.out.println(String.format("%s: %s", temp.getValue(), temp.getKey()));
                }
            }
        }else {
            System.out.println("В справочнике нет такой фамилии.");
        }
    }
}
