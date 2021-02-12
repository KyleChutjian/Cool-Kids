import java.util.Scanner;

public class Main {
	
	public String snack;

    public static void main(String[] args) {

    	double pretzels=2.00;
    	double granolaBar=3.00;
    	double chips=1.00;
    	double soda=2.00;
    	double total = 0.00;


    	Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to the vending machine! Here is a list of all of the snacks that are available to purchase!");
		System.out.println("Pretzels: $2.00, Granola Bar: $1.00, Chips: $3.00, Soda: $2.00");
    	System.out.println("Which snack would you like to buy?");
		String snack = scanner.nextLine();
		boolean validItem;
		boolean readyToCheckOut = true;
		do {
			do {
				switch (snack.toLowerCase()) {
					case "pretzels":
						System.out.println("That will be $2.00. Will that be all?");
						total += pretzels;
						validItem = true;
						break;
					case "granolabar":
						System.out.println("That will be $1.00. Will that be all?");
						total += granolaBar;
						validItem = true;
						break;
					case "chips":
						System.out.println("That will be $3.00. Will that be all?(Y/N)");
						total += chips;
						validItem = true;
						break;
					case "soda":
						System.out.println("That will be $2.00. Will that be all?(Y/N)");
						total += soda;
						validItem = true;
						break;
					default:
						System.out.println("Sorry, we don't have that. Please try again.");
						validItem = false;
				}
				snack = scanner.nextLine();
			} while (!validItem);
			switch (scanner.nextLine()) {
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
    }
    
    

}
