/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 03/01/2024
 * File Name: TestCases.java
 * Description: TestCases class contains JUnit test cases for testing the functionality of the Customer class and its associated segments.
 */
package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCases {

    public TestCases() {
    }
    /**
     * Test case to check the behavior of BusinessSegment.
     */
    @Test
    public void testBusinessSegment() {

        Customer customerOne = new Customer("John", new BussinessSegment());
        assertEquals("Hello John, Thanks for being a important Business Segment Customer.", customerOne.getEmailTemplate());

    }
    /**
     * Test case to check the behavior of segment swapping.
     */
    @Test
    public void testSegmentSwap() {
        Customer customerOne = new Customer("John", new BussinessSegment());
        assertEquals("Hello John, Thanks for being a important Business Segment Customer.", customerOne.getEmailTemplate());
        customerOne.swapEmailTemplate(new VipSegment());
        assertEquals("Hello John, Thanks for being a important VIP Segment Customer.", customerOne.getEmailTemplate());

    }
    /**
     * Test case to check the behavior of updating customer names.
     */
    @Test
    public void testCustomerName(){
        Customer customerOne = new Customer("John", new BussinessSegment());
        assertEquals("Hello John, Thanks for being a important Business Segment Customer.", customerOne.getEmailTemplate());
        customerOne.setCustomerName("Max");
        assertEquals("Hello Max, Thanks for being a important Business Segment Customer.", customerOne.getEmailTemplate());
        customerOne.swapEmailTemplate(new FrequentSegment());
        assertEquals("Hello Max, Thanks for being a important Frequent Segment Customer.", customerOne.getEmailTemplate());

    }
}
