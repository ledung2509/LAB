/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Shop {

    List<Product> ProductList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    void addProduct() {
        Product product = new Product();
        while (true) {
            fixbox d = new fixbox();
            System.out.println("Nhập tên sản phẩm:");
            String a = d.inputName();
            System.out.println("Nhập giá sản phẩm:");
            double c = d.inputPrice();
            System.out.println("Nhập mô tả sản phẩm:");
            String b = d.inputDescription();
            break;
        }
        int num;
        do {
            System.out.println("Nhập đánh giá:");
            num = sc.nextInt();
        } while (num < 0);
        product.rate = new int[num];
        for (int i = 0; i < product.rate.length; i++) {
            do {
                System.out.printf("Rate %d:", i + 1);
                product.rate[i] = sc.nextInt();
            } while (!(1 <= product.rate[i] && product.rate[i] <= 5));
        }
        ProductList.add(product);
    }

    void removeProduct() {
        try {
            if (ProductList.isEmpty()) {
                System.out.println("Không có sản phẩm");
                return;
            }
            sc.nextLine();
        } catch (Exception e) {
            System.err.println("Vui lòng nhập lại!!!");
        }
        System.out.println("Nhập sản phẩm cần xóa:");
        String name = sc.nextLine();

        for(Product product : ProductList){
            if(ProductList.equals(name)){
               ProductList.remove(product);
            }
        }
    }
}
