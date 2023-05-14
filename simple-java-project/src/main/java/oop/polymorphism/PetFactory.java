package oop.polymorphism;

/**
 * Класс, который будет создавать животных в зависимости от передаваемых параметров
 */
public class PetFactory {

    public Pet createPet(PetType petType, String name, Integer age) {
        return switch (petType) {
            case CAT -> new Cat(name, age);
            case DOG -> new Dog(name, age);
        };
    }
}
