package com.OOP;

public class Staff extends Person{
    private String school = "10-Maktab";
    private double pay = 50000;

    public Staff() {
    }

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toStringValues(){
        Person person = new Person();
        String resultPerson = person.toStringValues();
        String resultStaff = "\nSchool : " + school + "\nPay : " + pay;
        return resultPerson + resultStaff;
    }
}
