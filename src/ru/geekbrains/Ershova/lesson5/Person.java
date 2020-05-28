package ru.geekbrains.Ershova.lesson5;

public class Person {
    public String FIO;
    public String position;
    public String email;
    public String tel;
    public int salary;
    public int age;

    Person(String FIO, String position, String email, String tel, int salary, int age){
        this.FIO = FIO;
        this.position = position;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }

    int GetAge(){
        return age;
    }
    void Print(){
        System.out.println(FIO + " " + position + " " + email + " " + tel + " " + salary +" " + age);
    }

}