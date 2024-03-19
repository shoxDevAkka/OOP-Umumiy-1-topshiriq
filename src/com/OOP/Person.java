package com.OOP;

public class Person implements BaseDisplay{

    private String name = "Micheal Jordan";
    private String address = "USA, Chicago";

    public Person() {
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toStringValues() {
        String result = "Name : " + name + "\nAddress : " + address;
        return result;
    }
}
