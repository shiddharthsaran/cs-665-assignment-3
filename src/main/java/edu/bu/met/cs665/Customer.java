/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 03/01/2024
 * File Name: Customer.java
 * Description: Customer class represents a customer and their associated segment, providing methods
 * to manage customer data and email templates.
 */
package edu.bu.met.cs665;

public class Customer {
    public String customerName;
    public CustomerSegmentInterface customerSegment;
    /**
     * Constructor for creating a Customer object.
     * @param customerName The name of the customer.
     * @param customerSegment The segment interface associated with the customer.
     */

    public Customer(String customerName, CustomerSegmentInterface customerSegment) {
        this.customerName = customerName;
        this.customerSegment = customerSegment;
    }
    /**
     * Get the email template for the customer using their segment's template.
     * @return The email template with customer-specific details.
     */
    public String getEmailTemplate(){
        return customerSegment.getEmailTemplate(this.customerName);
    }
    /**
     * Change the email template for the customer to that of a new segment.
     * @param newCustomerSegment The new segment interface for the customer.
     */

    public void swapEmailTemplate(CustomerSegmentInterface newCustomerSegment){
        this.customerSegment = newCustomerSegment;
    }
    /**
     * Get the name of the customer.
     * @return The name of the customer.
     */
    public String getCustomerName(){
        return this.customerName;
    }
    /**
     * Set a new name for the customer.
     * @param newCustomerName The new name for the customer.
     */
    public void setCustomerName(String newCustomerName){
        this.customerName = newCustomerName;
    }
}
