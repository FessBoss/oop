package oop.inheritance;

/**
 * Тут мы объявляем класс родитель, содержащий в себе методы и поля, которые будут во всех классах наследниках.
 */
public class Pet {

    private Integer age;
    private String name;

    //Конструктор - метод, который вызывается при создании объекта
    public Pet(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

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
