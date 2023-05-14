package oop.polymorphism;

/**
 * Полиморфизм - механизм языка, который позволяет на основе одной какой-то модели создавать множество других взаимозаменяемых
 * Взаимозаменяемые могут быть как и классы (наследование), методы (переопределение), поведение (интерфейсы)

 * Преимущества - возможность создавать гибкие, легко масштабируемые системы
 */
public class PolymorphismExample {

    public static void main(String[] args) {
        PetFactory petFactory = new PetFactory();

        Pet pet1 = petFactory.createPet(PetType.CAT, "Васька", 10);
        pet1.action();

        Pet pet2 = petFactory.createPet(PetType.DOG, "Шарик", 5);
        pet2.action();
    }
}
