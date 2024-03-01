package edu.bu.met.cs665;

public class Main {
    public static void main(String[] args){
        Customer customerOne = new Customer("John", new BussinessSegment());
        Customer customerTwo = new Customer("Max", new ReturningSegment());
        Customer customerThree = new Customer("Peter", new NewSegment());
        Customer customerFour = new Customer("Mrunal", new FrequentSegment());
        Customer customerFive = new Customer("Jil", new VipSegment());

        System.out.println(customerOne.getEmailTemplate());
        System.out.println(customerTwo.getEmailTemplate());
        System.out.println(customerThree.getEmailTemplate());
        System.out.println(customerFour.getEmailTemplate());
        System.out.println(customerFive.getEmailTemplate());
    }
}
