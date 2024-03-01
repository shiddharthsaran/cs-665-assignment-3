package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Write some Unit tests for your program like the examples below.
 */

public class TestCases {

    public TestCases() {
    }

    @Test
    public void testBusinessSegment() {

        Customer customerOne = new Customer("John", new BussinessSegment());
        assertEquals("Hello John, Thanks for being a important Business Segment Customer.", customerOne.getEmailTemplate());

    }

    @Test
    public void testSegmentSwap() {
        Customer customerOne = new Customer("John", new BussinessSegment());
        assertEquals("Hello John, Thanks for being a important Business Segment Customer.", customerOne.getEmailTemplate());
        customerOne.swapEmailTemplate(new VipSegment());
        assertEquals("Hello John, Thanks for being a important VIP Segment Customer.", customerOne.getEmailTemplate());

    }

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
