/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 03/01/2024
 * File Name: CustomerSegmentInterface.java
 * Description: CustomerSegmentInterface defines methods to be implemented by customer segment classes.
 */
package edu.bu.met.cs665;

public interface CustomerSegmentInterface {
    /**
     * Get the email template associated with the customer segment.
     * @return The email template specific to the customer segment.
     */
    public String getEmailTemplate();
    /**
     * Get the type of consumer segment.
     * @return The type of consumer segment as a String.
     */
    public String getConsumerSegmentType();
}
