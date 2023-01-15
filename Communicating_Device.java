package Phone_operation;

public interface Communicating_Device {

    public void switchOn(Boolean power);
    public void dialedNumber(String phoneNumber);
    public void Incomingcall();
    public boolean recievingNumber(String phoneNumber);
    public boolean ringing();
    
}
