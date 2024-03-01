/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 03/01/2024
 * File Name: Main.java
 * Description: Main class demonstrates the usage of Customer and its associated segments by creating instances of different types of customers and printing their email templates.
 */
package edu.bu.met.cs665;

public class Main {
    public static void main(String[] args){
        // Create instances of different customers with their associated segments
        Customer customerOne = new Customer("John", new BussinessSegment());
        Customer customerTwo = new Customer("Max", new ReturningSegment());
        Customer customerThree = new Customer("Peter", new NewSegment());
        Customer customerFour = new Customer("Mrunal", new FrequentSegment());
        Customer customerFive = new Customer("Jil", new VipSegment());
        // Print out the email templates for each customer
        System.out.println(customerOne.getEmailTemplate());
        System.out.println(customerTwo.getEmailTemplate());
        System.out.println(customerThree.getEmailTemplate());
        System.out.println(customerFour.getEmailTemplate());
        System.out.println(customerFive.getEmailTemplate());
    }
}
