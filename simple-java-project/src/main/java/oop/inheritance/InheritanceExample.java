package oop.inheritance;

/**
 * Преимущества - сокращение кода и возможность выйти в использование полиморфизма.
 * Недостатки - при наследовании могут наследоваться поля или методы, которые не нужны в классе предке.
 */
public class InheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog("Васька", 5);
        Cat cat = new Cat("Мурка", 10);

        dog.showInfo(); // Нет в классе dog, но есть в родительском классе
        dog.bark();

        System.out.println("=====================================================");

        cat.showInfo(); //Нет в классе cat, но есть в родительском классе
        cat.mew();
    }
}
