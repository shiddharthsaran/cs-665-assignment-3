package edu.bu.met.cs665;

public class Consumer {
    public String customerName;
    public ConsumerSegmentInterface consumerSegment;

    public Consumer(String customerName, ConsumerSegmentInterface consumerSegment) {
        this.customerName = customerName;
        this.consumerSegment = consumerSegment;
    }
    public String getEmailTemplate(){
        return consumerSegment.emailTemplate();
    }

    public void swapEmailTemplate(ConsumerSegmentInterface newConsumerSegment){
        this.consumerSegment = newConsumerSegment;
    }
}
