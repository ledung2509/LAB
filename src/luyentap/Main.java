/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luyentap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Main extends Student {

    int n;

    static ArrayList<Student> st = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);

    public void inputdata() {
        System.out.print("Enter a numbers:");
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            Student a = new Student();
            System.out.printf("Student %d\n", i + 1);
            System.out.print("Enter name:");
            a.name = sc.nextLine();
            System.out.print("Enter age:");
            a.age = Integer.parseInt(sc.nextLine());
            System.out.print("Enter mark:");
            a.mark = Double.parseDouble(sc.nextLine());
            System.out.print("Enter address:");
            a.address = sc.nextLine();
            st.add(a);
        }

    }

    public void outputdata() {
        System.out.println("List students:");
        for (Student c : st) {
            c.xuat();
            //c.inra();
        }
    }

    public void sapxepdiem() {
        Collections.sort(st, new Comparator<Student>() {
            @Override
            public int compare(Student c1, Student c2) {
                return (int) (c2.getMark() - c1.getMark());
            }
        });
        System.out.println("Sort list students:");
        for (Student c : st) {
            c.xuat();
            //c.inra();
        }
    }

    public void diemlonnhat(){
        System.out.println("Max mark:");
        System.out.println(st.get(st.size()-n));          
    }
    
    public static void main(String[] args) {
        Main m = new Main();
        while (true) {
            System.out.println("1.Input list.");
            System.out.println("2.Output list.");
            System.out.println("3.Sort mark.");
            System.out.println("4.Search max mark.");
            System.out.println("5.Exit.");
            System.out.print("Please enter a number:");
            int tc = Integer.parseInt(sc.nextLine());
            switch (tc) {
                case 1:
                    m.inputdata();
                    break;
                case 2:
                    m.outputdata();
                    break;
                case 3:
                    m.sapxepdiem();
                    break;
                case 4:
                    m.diemlonnhat();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Re-input!!!");
                    break;
            }
        }
    }
}
