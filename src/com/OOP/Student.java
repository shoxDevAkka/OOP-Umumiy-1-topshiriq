package com.OOP;

public class Student extends Person{
    private String program = "Bakalavr";
    private int year = 1997;
    private double fee = 50000;

    public Student() {
    }

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toStringValues() {
        Person person = new Person();
        String resultPerson = person.toStringValues();
        String resultStudent = "\nProgram : " + program + "\nYear : " + year + "\nFee : " + fee;
        return resultPerson + resultStudent;
    }
}
