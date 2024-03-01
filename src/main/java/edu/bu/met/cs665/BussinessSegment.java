package edu.bu.met.cs665;

public class BussinessSegment implements CustomerSegmentInterface{
    @Override
    public String getEmailTemplate() {
        return "Hello <customerName>, Thanks for being a important Business Segment Customer.";
    }

    @Override
    public String getConsumerSegmentType() {
        return "Business";
    }
}
