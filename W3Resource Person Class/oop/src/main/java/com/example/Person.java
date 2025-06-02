package com.example;

// Person класс нь name, age хувьсагчтай, greet функцтэй.

public class Person {
    private String name;
    private int age;
    private String email;  // Шинэ attribute

    public Person(String name, int age, String email){
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@")) {  // "@" байхыг шалгах
            this.email = email;
        } else {
            throw new IllegalArgumentException("Email ni '@' temdgiig aguulah yostoi.");
        }
    }

    public String greet(){
        return "Hi, Minii neriig " + getName() + " gedeg. Bi " + getAge() + " nastai. email: " + getEmail();
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
