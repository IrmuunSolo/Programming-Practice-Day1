package com.example;

// Person класс нь name, age хувьсагчтай, greet функцтэй.

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String greet(){
        return "Hi, Minii neriig " + getName() + " gedeg. Bi " + getAge() + " nastai.";
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
}
