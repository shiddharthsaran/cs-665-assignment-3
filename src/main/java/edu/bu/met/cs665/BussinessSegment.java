/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 03/01/2024
 * File Name: BusinessSegment.java
 * Description: BusinessSegment class represents a business customer segment and implements CustomerSegmentInterface.
 */
package edu.bu.met.cs665;

public class BussinessSegment implements CustomerSegmentInterface{
    /**
     * Get the email template specific to business segment customers.
     * @param customerName The name of the customer.
     * @return The email template for business segment customers.
     */
    @Override
    public String getEmailTemplate(String customerName) {
        return "Hello " + customerName + ", Thanks for being a important Business Segment Customer.";
    }
    /**
     * Get the consumer segment type.
     * @return The consumer segment type.
     */

    @Override
    public String getConsumerSegmentType() {
        return "Business";
    }
}
