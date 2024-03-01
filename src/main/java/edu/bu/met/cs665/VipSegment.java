package edu.bu.met.cs665;

public class VipSegment implements CustomerSegmentInterface{
    @Override
    public String getEmailTemplate() {
        return "Hello <customerName>, Thanks for being a important VIP Segment Customer.";
    }

    @Override
    public String getConsumerSegmentType() {
        return "VIP";
    }
}
