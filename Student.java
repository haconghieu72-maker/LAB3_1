/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;
public class Student {
     String id;
    String name;
    double score;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ID: "); id = sc.nextLine();
        System.out.print("Nhap tên: "); name = sc.nextLine();
        System.out.print("Nhap điem: "); score = sc.nextDouble();
    }

    void display() {
        System.out.println("ID: " + id + " - Ten: " + name + " - Điem: " + score);
    }

    boolean isPass() {
        return score >= 5;
    }
    
}
