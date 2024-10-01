/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author minh
 */
public class Person {
    //access modifiers
    private String name;
    private int age;
    private String phone;
    
    //list ra các constructors automatically

    public Person() {
    }

    public Person(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <18) 
            System.out.println("Phai nhap tren 18 tuoi ");
        else
            this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString(String name, int age, String phone){
        return ("Ten nguoi: "+ name + 
                "\nTuoi: "+ age + 
                "\nSDT: " + phone);
    }
    
}
