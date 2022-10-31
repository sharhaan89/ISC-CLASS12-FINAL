package ComputerProjectClass12_2;

import java.util.Scanner;

public class Account extends Bank { 
    
    static Scanner sc = new Scanner(System.in);
    double amt;
	
    Account(String n, long a, double pp)
    {
        super(n,a,pp); //calling the super class i.e. bank class 
        amt = 0.0; //initial bank balance set to zero
    }

    void deposit()
    {
        System.out.print("\n Enter amount to deposit: ");
        amt = sc.nextDouble(); 
        p = p + amt; //update the principal amount
    }

    void withdraw() {
        System.out.print("\n Enter amount to withdraw: ");
        amt = sc.nextDouble();
        if(amt > p)
            System.out.println("INSUFFICIENT BALANCE");
        else { 
            p = p - amt; //deduct the amount withdrawn
            if(p < 500)
                p = p - (500 - p)/10; //extra compensation for p less than 500
        }
    }
	
    @Override
    void display() {
        super.display();
    }
}
/*
OUTPUT

Enter amount to deposit: 25000

Enter amount to withdraw: 5000

Name: Sharhaan
Account number: 242344
Principal amount: 70000.0

ALGORITHM
1. Start
2. Create a Bank class with data members name, acc no, principal amount.
3. Create a Account class which extends (inherits) the bank class.
4. Create deposit() and withdraw() functions to handle the amount.
5. Create a display() function to display the details of the account.

VARIABLE DESCRIPTION TABLE
+---------------+--------+--------------------------------------+
| Variable Name | Type   | Function                             |
+---------------+--------+--------------------------------------+
| name          | String | Store the name of user               |
+---------------+--------+--------------------------------------+
| accno         | long   | Store the acc. number of user        |
+---------------+--------+--------------------------------------+
| p             | double | Store the principal amt of user      |
+---------------+--------+--------------------------------------+
| amt           | double | Store the amount to deposit/withdraw |
+---------------+--------+--------------------------------------+
*/
