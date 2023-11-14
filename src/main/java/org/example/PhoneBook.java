package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {

    HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void add(String contactName, String phoneNumber) {
        if (!phoneBook.containsKey(contactName)) {
            phoneBook.put(contactName, new ArrayList<String>());
        }
        phoneBook.get(contactName).add(phoneNumber);
    }

    public void get(String contactName) {
        if (!phoneBook.containsKey(contactName)) {
            System.out.println("Контакт отсутствует в книге.");
        } else {
            for (String phoneNumber : phoneBook.get(contactName)) {
               System.out.println(phoneNumber);
            }
        }
    }
}
