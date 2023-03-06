import java.util.Scanner;
public class Customer {
	
	static int check_account = 23858859;
	static int saving_account = 883752734;
	static String customer_first_name = "Arpit Kumar";
	static String customer_last_name = "Chuhan";
	static String address = "Rambagh Agra";
	static long number = 9012501782l;
	static String email = "arpit@gmail.com";
	static double avail_check = 5000;
	static double avail_saving = 7000;
	
	public void customer_details() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("CUSTOMER FIRST NAME: "+customer_first_name);
			System.out.println("CUSTOMER LAST NAME: "+customer_last_name);
			System.out.println("CHECKING ACCOUNT NUMBER: "+check_account+"    AVAILABLE BALANCE $"+avail_check);
			System.out.println("SAVING ACCOUNT NUMBER: "+saving_account+"    AVAILABLE BALANCE $"+avail_saving);
			System.out.println("MOBILE NUMBER: "+number);
			System.out.println("EMAIL: "+email);
			System.out.println("ADDRESS: "+address);
			System.out.println("**************************************************");
			System.out.println("Would you like to do anything else?");
			System.out.println("1) Yes");
			System.out.println("2) No");
			System.out.print("Your selection: ");
			int choice = sc.nextInt();
			
			if(choice==1) {
				new ATM();
			}
			else if(choice==2) {
				while(true) {
					break;
				}
			}
		}
		catch(Exception e) {
			System.out.println("ERROR - Please enter sufficient keywords:");
		}
	}
	
	public void widraw() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("WITHDRAW FROM WHICH ACCOUNT?");
			System.out.println("****************************************");
			System.out.println("1) Chequing "+check_account+"  AVAILABLE BALANCE $"+avail_check);
			System.out.println("2) Savings: "+saving_account+"    AVAILABLE BALANCE $"+avail_saving);
			while(true) {
				System.out.print("Your selection: ");
				int selection = sc.nextInt();
				System.out.println("****************************************");
				if(selection==1) {
					while(true) {
						System.out.print("Enter withdrawal amount $");
						double amount = sc.nextInt();
						if(amount<=avail_check) {
							avail_check = avail_check-amount;
							System.out.println("SUCCESS - "+amount+" has been withdrawn from chequing.");
							System.out.println("NEW BALANCE $"+avail_check);
							System.out.println("****************************************");
							System.out.println("Would you like to withdrawal again?");
							System.out.println("1) Yes");
							System.out.println("2) No");
							System.out.print("Your selection: ");
							int choice = sc.nextInt();
							
							if(choice==1) {
								continue;
							}
							else if(choice==2) {
								new ATM();
							}
						}
						else {
							System.out.println("ERROR - Insufficient bank balance:");
						}
					}
				}
				else if(selection==2) {
					while(true) {
						System.out.print("Enter withdrawal amount $");
						double amount = sc.nextInt();
						if(amount<=avail_saving) {
							avail_saving = avail_saving-amount;
							System.out.println("SUCCESS - "+amount+" has been withdrawn from savings.");
							System.out.println("NEW BALANCE $"+avail_saving);
							System.out.println("****************************************");
							System.out.println("Would you like to withdrawal again?");
							System.out.println("1) Yes");
							System.out.println("2) No");
							System.out.print("Your selection: ");
							int choice = sc.nextInt();
							
							if(choice==1) {
								continue;
							}
							else if(choice==2) {
								new ATM();
							}
						}
						else {
							System.out.println("ERROR - Insufficient bank balance:");
						}
					}
				}
				else {
					System.out.println("ERROR - Invalid entry. Try Again");
				}
			}
		}
		catch(Exception e) {
			System.out.println("ERROR - Please enter sufficient keywords:");
		}
	}
	
	public void deposite() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("DEPOSITE INTO WHICH ACCOUNT?");
			System.out.println("****************************************");
			System.out.println("1) Chequing "+check_account+"  AVAILABLE BALANCE $"+avail_check);
			System.out.println("2) Savings: "+saving_account+"    AVAILABLE BALANCE $"+avail_saving);
			while(true) {
				System.out.print("Your selection: ");
				int selection = sc.nextInt();
				System.out.println("****************************************");
				if(selection==1) {
				while(true) {
					System.out.print("Enter deposite amount $");
					double amount = sc.nextInt();
					if(amount<=10000) {
						avail_check = avail_check+amount;
						System.out.println("SUCCESS - "+amount+" has been deposite in chequing.");
						System.out.println("NEW BALANCE $"+avail_check);
						System.out.println("****************************************");
						System.out.println("Would you like to do anything else?");
						System.out.println("1) Yes");
						System.out.println("2) No");
						
						System.out.print("Your selection: ");
						int choice = sc.nextInt();
						if(choice==1) {
							continue;
						}
						else if(choice==2) {
							new ATM();
						}
					}
					else {
						System.out.println("ERROR - Maximum 10000 depositable:");
					}
				}
				}
				else if(selection==2) {
					while(true) {
						System.out.print("Enter deposite amount $");
						double amount = sc.nextInt();
						if(amount<=10000) {
							avail_saving = avail_saving+amount;
							System.out.println("SUCCESS - "+amount+" has been deposited in savings.");
							System.out.println("NEW BALANCE $"+avail_saving);
							System.out.println("****************************************");
							System.out.println("Would you like to deposite amount again");
							System.out.println("1) Yes");
							System.out.println("2) No");
							System.out.print("Your selection: ");
							int choice = sc.nextInt();
							
							if(choice==1) {
								continue;
							}
							else if(choice==2) {
								new ATM();
							}
						}
						else {
							System.out.println("ERROR - Maximum 10000 depositable:");
						}
					}
				}
				else {
					System.out.println("ERROR - Invalid entry. Try Again");
				}
			}
		}
		catch(Exception e) {
			System.out.println("Please enter sufficient keywords:");
		}
	}
	
	public void change_pin() {
		try {
			Scanner sc = new Scanner(System.in);
			while(true) {
				System.out.print("Please enter current PIN: ");
				int current_pin = sc.nextInt();
				if(current_pin==BankCard.pin) {
					while(true) {
						System.out.print("Please enter new PIN: ");
						int new_pin = sc.nextInt();
						System.out.print("\nConfirm PIN: ");
						int con_pin = sc.nextInt();
						if(new_pin==con_pin) {
							BankCard.pin = new_pin;
							System.out.println("Your PIN has Successfully changed:");
							System.out.println("**********************************************");
							new ATM();
						}	
						else {
							System.out.println("PIN did not match");
						}
					}
				}
				else {
					System.out.println("Your current PIN did not match");
				}
			}
		}
		catch(Exception e) {
			System.out.println("Please enter sufficient keywords:");
		}
		
	}

}
