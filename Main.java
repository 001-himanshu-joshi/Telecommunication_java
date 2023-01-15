package Phone_operation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Reciever Number is");
        String RecieverNumber = sc.next();
        sc.nextLine();

        System.out.println("Sender Number is");
        String SenderNumber = sc.next();
        sc.nextLine();

        System.out.println("Reciever Phone is switch on");
        Boolean Recieverpower = sc.nextBoolean();
        
        Phone phone = new Phone(RecieverNumber, SenderNumber, Recieverpower);
            System.out.println("Enter the dialed number");
            String dialnum = sc.next();
            phone.dialedNumber(dialnum); 
            phone.switchOn(Recieverpower);
            if(Recieverpower){
                phone.recievingNumber(dialnum);
                phone.Incomingcall();
            }       
    }
    
}
