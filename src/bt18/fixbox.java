/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt18;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class fixbox {

    Scanner sc = new Scanner(System.in);

    public String inputName() {
        while (true) {
            String name = sc.nextLine();
            try {
                if (name.isEmpty()) {
                    throw new Exception("Không khoảng trống");
                }
                return name;
            } catch (Exception e) {
                System.err.println("Vui lòng nhập lại!!!");
            }
        }
    }
    
    public double inputPrice() {
        double price;
        while (true) {
            price = Double.parseDouble(sc.nextLine());
            try {
                if (!(price > 0 && price <= 100)) {
                    throw new Exception("Nhập giá từ 0 đến 100");
                }
                return price;
            } catch (Exception e) {
                System.err.println("Vui lòng nhập lại!!!!");
            }
        }
    }
    
    public String inputDescription() {
        while (true) {
            String description = sc.nextLine();
            try {
                if (description.isEmpty()) {
                    throw new Exception("Không khoảng trống");
                }
                return description;
            } catch (Exception e) {
                System.err.println("Vui lòng nhập lại!!!");
            }
        }
    }
}
