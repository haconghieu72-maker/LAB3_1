/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;
public class Circle {
    double radius;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kính: "); radius = sc.nextDouble();
    }

    double getArea() { return Math.PI * radius * radius; }
    double getPerimeter() { return 2 * Math.PI * radius; }

    boolean isBigCircle() {
        return getArea() > 100;
    }
    
}
