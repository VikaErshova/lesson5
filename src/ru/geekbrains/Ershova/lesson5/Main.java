package ru.geekbrains.Ershova.lesson5;
// 1.	Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//2.	Конструктор класса должен заполнять эти поля при создании объекта.
//3.	Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
//4.	Создать массив из 5 сотрудников.
// Пример:
// Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
// persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
// потом для каждой ячейки массива задаем объект
// persArray[1] = new Person(...);
// ...
// persArray[4] = new Person(...);
// 5.	С помощью цикла вывести информацию только о сотрудниках старше 40 лет.


public class Main {

    public static Person[] persArray;

    public static void main(String[] args) {

	Person[] persArr = new Person[5];
	persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
	persArray[1] = new Person("Ivanov Ivan1", "Engineer1", "ivivan1@mailbox.com", "892312311", 70000, 40);
	persArray[2] = new Person("Ivanov Ivan2", "Engineer2", "ivivan2@mailbox.com", "892312313", 75000, 50);
	persArray[3] = new Person("Ivanov Ivan3", "Engineer3", "ivivan3@mailbox.com", "892312314", 80000, 60);
	persArray[4] = new Person("Ivanov Ivan4", "Engineer4", "ivivan4@mailbox.com", "892312315", 100000, 25);

	for(Person item : persArr){
	    if(item.GetAge() > 40) item.Print();
    }

    }
}
