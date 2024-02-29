package edu.bu.met.cs665;

public class Main {
    public static void main(String[] args){
        Consumer john = new Consumer("John", new BussinessSegment());
        System.out.println(john.getEmailTemplate());
        john.swapEmailTemplate(new ReturningSegment());
        System.out.println(john.getEmailTemplate());
    }
}
