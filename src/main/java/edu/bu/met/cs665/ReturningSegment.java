package edu.bu.met.cs665;

public class ReturningSegment implements CustomerSegmentInterface{

    @Override
    public String getEmailTemplate() {
        return "Hello <customerName>, Thanks for being a important Returning Segment Customer.";
    }

    @Override
    public String getConsumerSegmentType() {
        return "Returning";
    }
}
