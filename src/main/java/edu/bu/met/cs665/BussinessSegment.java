package edu.bu.met.cs665;

public class BussinessSegment implements ConsumerSegmentInterface{
    @Override
    public String emailTemplate() {
        return "BusinessEmail";
    }

    @Override
    public String getConsumerSegmentType() {
        return "Business";
    }
}
