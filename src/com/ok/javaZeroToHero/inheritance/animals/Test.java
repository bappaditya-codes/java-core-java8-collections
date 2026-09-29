package com.ok.javaZeroToHero.inheritance.animals;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Rockey");
        dog.setAge(4);

        System.out.println(dog.getName());
        System.out.println(dog.getAge());

        dog.eat();
        dog.sayHello();

    }
}