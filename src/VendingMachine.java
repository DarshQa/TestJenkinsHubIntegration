import java.util.Scanner;


public class VendingMachine 
{
	public static void main(String[] args) {
	    int Food = runMenu();
	    int Price = retrievePrice(Food);
	    int change = moneyInserted(Price);
	}
	public static int runMenu(){
	    Scanner keyboard = new Scanner(System.in);
	    int choice = 0 ;
	    System.out.println("\n\nPlease enter your selection:"
	                + "\n1: Snickers \t 125"
	                + "\n2: Reeses Cup \t 130"
	                + "\n3: Doritoes \t 150"
	                + "\n4: Pepsi \t 185"
	                + "\n5: Exit ");
	    choice = keyboard.nextInt();
	    return choice;        
	}

	public static int retrievePrice(int menuChoice){
	    if (menuChoice == 1)
	        return 125;
	    if (menuChoice == 2)
	        return 130;
	    if (menuChoice == 3)
	        return 150;
	    if (menuChoice == 4)
	        return 185;
	    else return 0;
	}

	public static int moneyInserted(int Price){
	    Scanner keyboard = new Scanner(System.in);
	    int money = 0;
	    System.out.println("Your item costs: " + Price + " Please insert the amount:");
	    money = keyboard.nextInt();
	    while (money < Price){
	        System.out.println("Please insert sufficient funds");
	        money = money + keyboard.nextInt();
	    }
//	    return money - Price ;
	    return changeOut(money - Price) ;
	}

	public static int changeOut(int change){
	    int fiveRS = 0;
	    int tenRS = 0;
	    int oneRS = 0;
	    while (change >= 10){
	    	tenRS = tenRS + 1;
	        change = change - 10;
	    }
	    while (change >= 5){
	    	fiveRS = fiveRS + 1;
	        change = change - 5;
	    }
	        while (change < 5 && change>=1){
	        	oneRS = oneRS + 1;
	            change = change - 1;
	        }
	        System.out.println("\nHere's your change:\ntenRS,  fiveRS,  oneRS! " +tenRS +", " +fiveRS +", " +oneRS ); 
	        return change;
	       
	}

}
