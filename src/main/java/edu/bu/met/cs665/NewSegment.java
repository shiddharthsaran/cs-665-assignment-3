package edu.bu.met.cs665;

public class NewSegment implements CustomerSegmentInterface{

    @Override
    public String getEmailTemplate() {
        return "Hello <customerName>, Thanks for choosing us and welcome to New Customer Segment.";
    }

    @Override
    public String getConsumerSegmentType() {
        return "New";
    }
}
