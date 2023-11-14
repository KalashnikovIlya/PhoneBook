package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PhoneBook book = new PhoneBook();

        //загрузка данных
        book.add("Иванов", "+8 800 2000 500");
        book.add("Иванов", "+8 800 200 600");
        book.add("Петров", "+8 800 2000 700");
        book.add("Сидоров","+8 800 2000 800");
        book.add("Сидоров", "+8 800 2000 900");
        book.add("Сидоров", "+8 800 2000 000");

        System.out.println("Получаем список телефонов. Введите ФИО");
        book.get(in.next());



    }
}
