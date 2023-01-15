package Phone_operation;

public class Phone implements Communicating_Device {

    public String RecieverNumber;
    public String SenderNumber;
    public boolean power;
    public boolean ringing;

    public Phone(String RecieverNumber, String SenderNumber, Boolean power){
        this.RecieverNumber = RecieverNumber;
        this.SenderNumber = SenderNumber;
        this.power = power;
    }


    @Override
    public void switchOn(Boolean power) {
       if(!this.power){
            System.out.println("The Number You Have Dialed Is Not Reachable");
        }
    }

    @Override
    public void dialedNumber(String phoneNumber) {
        System.out.println("Dial Number " + phoneNumber);
        
    }

    @Override
    public void Incomingcall() {
        if(ringing && this.power){
            System.out.println("Answering the incoming call");
            ringing = false; 
        }else{
            System.out.println("Phone is not Ringing");
        }
        
    }

    @Override
    public boolean recievingNumber(String phoneNumber) {
       if(this.RecieverNumber.equals(phoneNumber)){
            ringing = true;
            System.out.println(this.SenderNumber + " is calling you plz answer the call");
       }else{
        ringing = false;
       }
       return ringing;
    }

    @Override
    public boolean ringing() {
        return ringing;
    }

}
