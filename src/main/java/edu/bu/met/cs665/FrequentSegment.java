package edu.bu.met.cs665;

public class FrequentSegment implements CustomerSegmentInterface{
    @Override
    public String getEmailTemplate() {
        return "Hello <customerName>, Thanks for being a important Frequent Segment Customer.";
    }

    @Override
    public String getConsumerSegmentType() {
        return "Frequent";
    }
}
