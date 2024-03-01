/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 03/01/2024
 * File Name: NewSegment.java
 * Description: NewSegment class represents a new customer segment and implements CustomerSegmentInterface.
 */
package edu.bu.met.cs665;

public class NewSegment implements CustomerSegmentInterface{
    /**
     * Get the email template specific to new segment customers.
     * @param customerName The name of the customer.
     * @return The email template for new segment customers.
     */
    @Override
    public String getEmailTemplate(String customerName) {
        return "Hello " + customerName + ", Thanks for choosing us and welcome to New Customer Segment.";
    }
    /**
     * Get the consumer segment type.
     * @return The consumer segment type, which is "New" for this class.
     */
    @Override
    public String getConsumerSegmentType() {
        return "New";
    }
}
