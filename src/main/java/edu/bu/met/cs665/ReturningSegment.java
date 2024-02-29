package edu.bu.met.cs665;

public class ReturningSegment implements ConsumerSegmentInterface{

    @Override
    public String emailTemplate() {
        return "Returning email";
    }

    @Override
    public String getConsumerSegmentType() {
        return "Returning";
    }
}
