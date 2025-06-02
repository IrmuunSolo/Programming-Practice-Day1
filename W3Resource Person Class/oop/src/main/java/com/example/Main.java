package com.example;

// run command: java -cp target/oop-1.0-SNAPSHOT.jar com.example.Main

public class Main {
    
    public static void main(String[] args) {
        Person person1 = new Person("Bold", 19, "bold-@gmail.com");
        Person person2 = new Person("Jargal", 21, "jargal2@gmail.com");

        System.out.println(person1.greet());
        System.out.println(person2.greet());

        System.out.println("\n" + person1.getName() + "-iin nasiig, " + person2.getName() + "-iin ner, email-iig oorchloy \n");

        person1.setAge(45);

        person2.setName("Huslen");
        person2.setemail("huslee123@gmail.com");

        System.out.println(person1.greet());
        System.out.println(person2.greet());
    }
}
