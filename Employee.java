/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;
public class Employee {
     String id, name;
    double salary;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma  NV: "); id = sc.nextLine();
        System.out.print("Nhap ten: "); name = sc.nextLine();
        System.out.print("Nhap luong: "); salary = sc.nextDouble();
    }

    void display() {
        System.out.println("ID: " + id + " – Name: " + name + " – Salary: " + salary);
    }

    double calculateTax() {
        return (salary > 10000000) ? salary * 0.1 : 0;
    }
    
}
