    import java.util.*;

public class ATM{
	float balance;
	int PIN = 1234;
	
	public void checkpin() {
		System.out.println("Enter pin: ");
		Scanner sc = new Scanner(System.in);
		int enteredpin = sc.nextInt();
		if(enteredpin==PIN) {
			menu();
		}
		else {
			System.out.println("Invalid pin: ");
            checkpin();
		}
        sc.close();
	}



public void menu() {
	System.out.println("\nEnter your choice: ");
	System.out.println("1.Check balance");
	System.out.println("2.Withdraw");
	System.out.println("3.Deposit");
	System.out.println("4.Exit\n");
	
	Scanner sc = new Scanner(System.in);
	int opt = sc.nextInt();
	
	if(opt==1) {
		checkBalance();
	}
	else if(opt==2) {
		Withdraw();
	}
	else if(opt==3) {
		Deposit();
	}
	else if(opt==4) {
		return;
	}
	else {
		System.out.println("Enter a valid choice");
	}
    sc.close();
}

public void checkBalance() {
	System.out.println("Balance " +balance);
	menu();
}

public void Withdraw() {
	System.out.println("Enter amount");
	Scanner sc = new Scanner(System.in);
	float amount = sc.nextFloat();
	
	if(amount>balance) {
		System.out.println("Insufficient balance");
	}
	else {
		balance = balance - amount;
		System.out.println("Money withdrawl successfully");
	}
	menu();
    sc.close();
}

public void Deposit() {
	System.out.println("Enter the amount");
	Scanner sc = new Scanner(System.in);
	float amount = sc.nextFloat();
	balance = balance + amount;
	System.out.println("Money deposited successfully");
	menu();
    sc.close();
}

}

class ATM_Machine {

	public static void main(String[] args) {
		ATM atm = new ATM();
		atm.checkpin();
	}
}