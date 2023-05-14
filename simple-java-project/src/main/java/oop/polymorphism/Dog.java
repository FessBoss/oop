package oop.polymorphism;

/**
 * Поскольку является наследником, то имеет доступ к родительским публичным методам и полям
 */
public class Dog extends Pet {

    public Dog(String name, Integer age) {
        super(name, age);
    }

    @Override //(Это просто Java аннотация, которая несет в себе чисто информативный характер, на выполнение кода она никак не влияет)
    public void action() {
        System.out.println("Gav-gav");
    }
}
