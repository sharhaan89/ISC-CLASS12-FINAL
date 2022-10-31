package ComputerProjectClass12_2;

public class Bank {
        
    String  name; 
    long accno;
    double  p;

    Bank(String n, long a, double pp) {

        name = n; 
        accno =a;
        p = pp;
    }

    void display( ) {
        System.out.println("\nName: "+name); 
        System.out.println("Account number: "+accno);
        System.out.println("Principal amount: " +p);
    }
    
    public static void main(String args[]) {
        Account myAcc = new Account("Sharhaan", 242344, 50000);
        myAcc.deposit();
        myAcc.withdraw();
        myAcc.display();
    }
}