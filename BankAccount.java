/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;


public class BankAccount {
      String accountNumber, ownerName;
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("So du khong du!");
        }
    }

    double checkBalance() { return balance; }

    void display() {
        System.out.println("STK: " + accountNumber + " – Chu tai khoan: " + ownerName + " – So du: " + balance);
    }
    
}
