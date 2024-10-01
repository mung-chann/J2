/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import java.util.Scanner;
import models.Coder;

/**
 *
 * @author minh
 */
public class OOP {
    public static void main(String[] args) {
        Coder coder1 = new Coder();
                        //constructor ko đối đã gen ra trong class Coder
        Coder coder2 = new Coder();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap ten: ");
        String name = sc.next();
        coder1.setName(name); //truyền biến name vào trong coder1
        
        System.out.println("Moi nhap tuoi: ");
        int age = sc.nextInt();
        coder1.setAge(age);
        
        //xly dk age
        
        while (coder1.getAge() == 0){
            age = sc.nextInt();
            coder1.setAge(age);
        }
        
        System.out.println("Moi nhap SDT: ");
        String phone = sc.next();
        coder1.setPhone(phone);
        
        System.out.println("Moi chon 1 trong cac ngon ngu lap trinh sau: ");
        System.out.println("1. Java");
        System.out.println("2. C");
        System.out.println("3. C#");
        System.out.println("4. Python");
        System.out.println("Lua chon cua ban la: ");
        
        int option = sc.nextInt();
        while (option < 1 || option >4){
                System.out.println("Chi duoc chon tu 1 -> 4. Moi chon lai:");
                option = sc.nextInt();
                }
        switch(option)
        {
            case 1: 
               coder1.setProgramming_Language("Java"); 
            case 2:
                coder1.setProgramming_Language("C");
            case 3:
                coder1.setProgramming_Language("C#");
            case 4: 
                coder1.setProgramming_Language("Python");      
        }
        
        System.out.println("Ngon ngu lap trinh: "+coder1.getProgramming_Language());
        
        //dữ liệu vừa nhập đã được lưu nên giờ có thế dùng get để gọi dlieu ra
        System.out.println("\nName: " + coder1.getName() + 
                            "\nAge: " + coder1.getAge() + 
                            "\nPhone: " + coder1.getPhone()+
                            "\nProgramming language: " + coder1.getProgramming_Language());
        //các dữ liệu này chỉ đc lưu tạm thời, sau khi thoát ctrinh thì sẽ mất
    }
}
