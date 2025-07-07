package com.encapsulation;

import java.util.Scanner;

public class Customer {
    int id, age;
    String name;

    // Default constructor
    public Customer() {
        System.out.println("Default Constructor");
    }

    // Parameterized constructor
    public Customer(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Display details
    public void displayDetails() {
        System.out.println("\nCustomer Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input id:");
        int id = sc.nextInt();

        System.out.println("Input name:");
        String name = sc.next();

        System.out.println("Input age:");
        int age = sc.nextInt();

        Customer obj1 = new Customer(); // prints "Default Constructor"
        Customer obj2 = new Customer(id, name, age); // stores and prints details
        obj2.displayDetails();

        sc.close();
    }
}