package com.OOP;

import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        Person person = new Student();
        Person person1 = new Staff();

        System.out.println();
        System.out.println("Student ma'lumotlari : ");
        System.out.println(person.toStringValues());

        System.out.println();
        System.out.println("Staff ma'lumotlari : ");
        System.out.println(person1.toStringValues());
    }
}
