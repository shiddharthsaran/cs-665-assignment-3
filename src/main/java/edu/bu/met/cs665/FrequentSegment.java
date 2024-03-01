/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 03/01/2024
 * File Name: FrequentSegment.java
 * Description: FrequentSegment class represents a frequent customer segment and implements CustomerSegmentInterface.
 */
package edu.bu.met.cs665;

public class FrequentSegment implements CustomerSegmentInterface{
    /**
     * Get the email template specific to frequent segment customers.
     * @return The email template for frequent segment customers.
     */
    @Override
    public String getEmailTemplate() {
        return "Hello <customerName>, Thanks for being a important Frequent Segment Customer.";
    }
    /**
     * Get the consumer segment type.
     * @return The consumer segment type.
     */
    @Override
    public String getConsumerSegmentType() {
        return "Frequent";
    }
}
