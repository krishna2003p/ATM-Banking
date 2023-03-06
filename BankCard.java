import java.util.Scanner;
public class BankCard {
	static int pin = 2308;
	public BankCard() throws Exception {
			Scanner sc = new Scanner(System.in);
			for(int i=4; i>=0; i--) {
				try {
					System.out.print("Please enter your PIN: ");
					int entered_pin = sc.nextInt();
					System.out.println("***************************************");
					
					if(pin == entered_pin) {
						new ATM();
					}
					else {
						System.out.println("ERROR - Invalid PIN. Try Again. Attempts remaining: "+i);
						System.out.println("***************************************");
					}
				}
				catch(Exception e) {
					System.out.println("ERROR - Please enter sufficient keywords:");
				}
		}
	}
//	public static void main(String[] args) {
//		new BankCard();
//	}
}
