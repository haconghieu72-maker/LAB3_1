/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;
class Product {
    String id, name;
    double price;
    int quantity;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ID: "); id = sc.nextLine();
        System.out.print("Tên: "); name = sc.nextLine();
        System.out.print("Giá: "); price = sc.nextDouble();
        System.out.print("Số lượng: "); quantity = sc.nextInt();
    }

    double getTotalPrice() { return price * quantity; }

    void discount(double percent) {
        price -= price * (percent / 100);
    }

    void display() {
        System.out.println("id: " + id + " – Name: " + name + " – Price: " + price + " – Quantity: " + quantity);
    }
}