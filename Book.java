/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;
public class Book {
     String title, author;
    double price;
    int year;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tieu de: "); title = sc.nextLine();
        System.out.print("Tac gia: "); author = sc.nextLine();
        System.out.print("Gia: "); price = sc.nextDouble();
        System.out.print("Nam: "); year = sc.nextInt();
    }

    void display() {
        System.out.println("Title: " + title + " – Author: " + author + " – price: " + price + " – Year: " + year);
    }

    boolean isExpensive() { return price > 200000; }
    boolean isOldBook() { return year < 2015; }
}
    

