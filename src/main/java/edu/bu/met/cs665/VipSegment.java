/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 03/01/2024
 * File Name: VipSegment.java
 * Description: VipSegment class represents a VIP customer segment and implements CustomerSegmentInterface.
 */
package edu.bu.met.cs665;

public class VipSegment implements CustomerSegmentInterface{
    /**
     * Get the email template specific to VIP segment customers.
     * @param customerName The name of the customer.
     * @return The email template for VIP segment customers.
     */
    @Override
    public String getEmailTemplate(String customerName) {
        return "Hello " + customerName + ", Thanks for being a important VIP Segment Customer.";
    }
    /**
     * Get the consumer segment type.
     * @return The consumer segment type, which is "VIP" for this class.
     */
    @Override
    public String getConsumerSegmentType() {
        return "VIP";
    }
}
