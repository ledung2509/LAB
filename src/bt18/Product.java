/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt18;

/**
 *
 * @author ADMIN
 */
public class Product {

    String name;
    String description;
    double price;
    int[] rate;

    void viewInfo() {
        System.out.println("Tên:" + name);
        System.out.println("Mô tả:" + description);
        System.out.println("Giá:" + price);
    }

}
