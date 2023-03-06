import java.util.Scanner;
public class ATM extends Customer{
	
	public ATM() throws Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select an option:");
		System.out.println("************************************");
		System.out.println("1) Print your account information");
		System.out.println("2) Withdraw funds");
		System.out.println("3) Deposit funds");
		System.out.println("4) Change PIN");
		System.out.println("5) Exit");
		while(true) {
			System.out.print("Your Selection: ");
			int option = sc.nextInt();
			
			System.out.println("************************************");
			if(option==1) {
				customer_details();
			}
			else if(option==2) {
				widraw();
			}
			else if(option==3) {
				deposite();
			}
			else if(option==4) {
				change_pin();
			}
			else if(option==5) {
				System.out.println("Thank you for banking with Bank of NC have a good day!");
				System.exit(0);
			}
			else {
				System.out.println("ERROR - Invalid entry. Try Again");
			}
		}
	}
//	public static void main(String[] args) {
//		new ATM();
//	}
	
}
