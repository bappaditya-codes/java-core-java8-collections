package com.ok.javaZeroToHero.inheritance.humans;

public class Child extends Parent {
    public static void main(String[] args) {
        Child child = new Child();
        child.setName("Bappaditya");
        child.setAge(33);
        System.out.println(child.getName());
        System.out.println(child.getAge());
    }
}
