package edu.bu.met.cs665;

public class Customer {
    public String customerName;
    public CustomerSegmentInterface customerSegment;

    public Customer(String customerName, CustomerSegmentInterface customerSegment) {
        this.customerName = customerName;
        this.customerSegment = customerSegment;
    }
    public String getEmailTemplate(){
        String baseEmailTemplate = customerSegment.getEmailTemplate();
        baseEmailTemplate = baseEmailTemplate.replace("<customerName>", this.customerName);

        return baseEmailTemplate;
    }

    public void swapEmailTemplate(CustomerSegmentInterface newCustomerSegment){
        this.customerSegment = newCustomerSegment;
    }

    public String getCustomerName(){
        return this.customerName;
    }
    public void setCustomerName(String newCustomerName){
        this.customerName = newCustomerName;
    }
}
