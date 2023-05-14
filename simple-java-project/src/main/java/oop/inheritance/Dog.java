package oop.inheritance;

/**
 * Поскольку является наследником, то имеет доступ к родительским публичным методам и полям
 */
public class Dog extends Pet {

    public Dog(String name, Integer age) {
        super(name, age);
    }

    public void bark() {
        System.out.println("Gav-gav");
    }
}
