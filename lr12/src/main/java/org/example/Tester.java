package org.example;
public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    public Tester() {
        this("Фиг знает", "Хз", 0, "Начинающий", 0.0);
    }

    public Tester(String name, String surname) {
        this(name, surname, 0, "Начинающий", 0.0);
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println(name + " " + surname + ", Опыт: " + experienceInYears + " лет, Уровень английского: " + englishLevel + ", Зарплата:" + salary+" рублёу");
    }

    public void displayInfo(String prefix) {
        System.out.println(prefix + ": " + name + " " + surname + " (" + experienceInYears + " лет опыта)");
    }

    public String displayInfo(boolean detailed) {
        return detailed
                ? name + " " + surname + ", Опыт: " + experienceInYears + " лет, Уровень английского: " + englishLevel + ", Зарплата:" + salary+" рублёу"
                : name + " " + surname;
    }

    public static void greet() {
        System.out.println("Привет от команды тестировщиков 'Леста игры'!");
    }

}