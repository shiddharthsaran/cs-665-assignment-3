/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 03/01/2024
 * File Name: ReturningSegment.java
 * Description: ReturningSegment class represents a returning customer segment and implements CustomerSegmentInterface.
 */
package edu.bu.met.cs665;

public class ReturningSegment implements CustomerSegmentInterface{
    /**
     * Get the email template specific to returning segment customers.
     * @return The email template for returning segment customers.
     */
    @Override
    public String getEmailTemplate() {
        return "Hello <customerName>, Thanks for being a important Returning Segment Customer.";
    }
    /**
     * Get the consumer segment type.
     * @return The consumer segment type, which is "Returning" for this class.
     */
    @Override
    public String getConsumerSegmentType() {
        return "Returning";
    }
}
