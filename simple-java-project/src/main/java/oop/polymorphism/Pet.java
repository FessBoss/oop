package oop.polymorphism;

public abstract class Pet {

    private Integer age;
    private String name;

    //Конструктор - метод, который вызывается при создании объекта
    public Pet(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    //Абстрактный метод - метод, который будет во всех классах наследниках, но реализация будет определена в наследнике
    public abstract void action();

    public void showInfo() {
        System.out.println("Pet name = " + name + " and age " + age);
    }

    //Геттеры и сеттеры
    //Геттер - получить значение поля, Сеттер - присвоить значение полю
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
