package org.example;

public class Main {
    public static void main(String[] args) {
System.out.println("Hello, танкист!");
        Tester tester1 = new Tester();
        Tester tester2 = new Tester("Джонни", "Этилов");
        Tester tester3 = new Tester("Сан(Saint)", "Пиццев", 40, "Let me eat this pizza", 100);

        tester1.displayInfo();
        tester2.displayInfo("Тестировщик");
        System.out.println(tester3.displayInfo(true));

        Tester.greet();
    }
}
