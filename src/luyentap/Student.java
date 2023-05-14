/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luyentap;

/**
 *
 * @author ADMIN
 */
public class Student {
    String name;
    int age;
    double mark;
    String address;

    public Student() {
    }

    public Student(String name, int age, double mark, String address) {
        this.name = name;
        this.age = age;
        this.mark = mark;
        this.address = address;
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
        this.age = age;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return  "Name:"+name + " "+"Age:" + age + " " + "Mark:"+ mark + " "+"Address:" + address ;
    }
    
    public void xuat(){
        Student b = new Student(name, age, mark, address);
        System.out.println(b);
    }
    
    public void inra(){
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Mark:" + mark);
        System.out.println("Address:" + address);
    }
    
}
