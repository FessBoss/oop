package oop.inheritance;

/**
 * Поскольку является наследником, то имеет доступ к родительским публичным методам и полям
 */
public class Cat extends Pet {

    public Cat(String name, Integer age) {
        super(name, age);
    }

    public void mew() {
        System.out.println("mew-mew");
    }
}
