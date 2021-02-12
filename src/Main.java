import java.util.Scanner;

public class Main {
	
	public String snack;

    public static void main(String[] args) {

    	double pretzels=2.00;
    	double granolaBar=3.00;
    	double chips=1.00;
    	double soda=2.00;
    	double total = 0.00;
    	int payment = 0;


    	Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to the vending machine! Here is a list of all of the snacks that are available to purchase!");
		String snack = "";
		boolean validItem;
		boolean readyToCheckOut = true;
		boolean paid = false;
		do {
			do {
				System.out.println("Which snack would you like to buy?");
				System.out.println(" - Pretzels ($2)");
				System.out.println(" - Granola Bar ($3)");
				System.out.println(" - Chips ($1)");
				System.out.println(" - Soda ($2)");
				snack = scanner.nextLine();
				switch (snack.toLowerCase()) {
					case "pretzels":
						total += pretzels;
						System.out.println("Pretzels ");
						System.out.println("Your total is " + total + ". Will that be all? (Y/N)");
						validItem = true;
						break;
					case "granola bar":
						total += granolaBar;
						System.out.println("Your total is " + total + ". Will that be all? (Y/N)");
						validItem = true;
						break;
					case "chips":
						total += chips;
						System.out.println("Your total is " + total + ". Will that be all? (Y/N)");
						validItem = true;
						break;
					case "soda":
						total += soda;
						System.out.println("Your total is " + total + ". Will that be all? (Y/N)");
						validItem = true;
						break;
					default:
						System.out.println("Sorry, we don't have that. Please try again.");
						validItem = false;
				}
			} while (!validItem);
			switch (scanner.nextLine().toUpperCase()) {
				case "Y":
					readyToCheckOut = true;
					break;
				case "N":
					readyToCheckOut = false;
					break;
				default:
					System.out.println("Bruh. What was that? Step up your game, casual. Smh my head. Mh.");
			}



		} while (!readyToCheckOut);
		System.out.println("Your total is $" + (int)total + ".");
		while (!paid) {

			System.out.println("Please enter the number of one dollar bills you would like to enter");
			payment += scanner.nextInt();
			scanner.nextLine();
			if (total > payment) {
				System.out.println("The total is $" + (int)total + ", you only put in $" + payment + ".");
				paid=false;
			} else {
				System.out.println("Do you want to confirm this purchase? (Y/N)");
				if (scanner.nextLine().equalsIgnoreCase("Y")) {
					System.out.println("Your change is $" + (int)(payment - total) + ".");
					System.out.println("Enjoy your tasty snacks!");
				} else {
					System.out.println((int)payment + " dollars were refunded, your loss.");
				}
				paid=true;
			}

		}



    }
    
    

}
