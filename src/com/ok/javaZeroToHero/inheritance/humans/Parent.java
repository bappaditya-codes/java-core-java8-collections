package com.ok.javaZeroToHero.inheritance.humans;

public class Parent extends GrandParent{
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.setName("Debkumar");
        parent.setAge(55);

        System.out.println(parent.getName());
        System.out.println(parent.getAge());

    }

}
