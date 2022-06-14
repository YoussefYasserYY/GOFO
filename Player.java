package GOFO;
import java.util.Scanner;


/**
 * This class is implemented to book playground for player
 */


public class Player extends user {
	system S1 = new system();
	private int NUMofbookings = 0;
	private double Price = 0;
	
	/**
	* This function display available playgrounds 
	*/
	public void AvailablePlaygrounds()
	{
		S1.DisplayPlaygrounds();
	}
	
	/**
	* This function displays money
	* @return money 
	*/
	 public double CheckMoney()
	 {
		 return GetMoney().GetMoney();
	 }
	/**
	* This function checks money amount
	* @param M Money 
	*/	 
	 public void PayAmount(double M)
	 {
		 if(GetMoney().subtractMoney(M)==true)
		 {
			 System.out.println("Transaction completed successfully");
		 }
		 else
		 {
			 System.out.println("insufficient money in your eWallet");
		 }

	 }
	 
	/**
	* This function display options for the player to complete the playground booking 
	*/
	 public void BookPlayground()
	 {
		 while (true)
		 {
		 for(int i = 0; i < Owner.playgroundscount; i++)
			{
				if(Owner.PGlist.get(i).isActive()==true) 
				{
			       System.out.println((i+1)+") " + Owner.PGlist.get(i).getPGname() + " at " + Owner.PGlist.get(i).getPGlocation());
				}
			}
		   System.out.println("Choose the number corresponding to the Playground you would like to book");
		   int choice1 = scan.nextInt();
		   System.out.println("Choose the time you would like to book");
		   Owner.PGlist.get(choice1-1).getPGavailbleHours();
		   int choice2 = scan.nextInt();
		   S1.updateBookings(Owner.PGlist.get(choice1-1), choice2 - 1);
		   Owner.PGlist.get(choice1-1).setHourscounter(Owner.PGlist.get(choice1-1).getHourscounter()-1);
		   NUMofbookings++;
		   System.out.println("Playground Booked successfully");
		   System.out.println("1: Another Booking ");
		   System.out.println("0: Exit");
		   int choice = scan.nextInt();
		   if(choice == 1 && Owner.PGlist.get(choice1-1).PGavailbleHours.isEmpty()==true)
		   {
			   choice = 0;
			   System.out.println("Playground is fully Reserved");
		   }
		   if (choice == 0)
		   {
			   setPrice(S1.Price(Owner.PGlist.get(choice1-1), NUMofbookings));
			   System.out.println("Total Price Is "+ S1.Price(Owner.PGlist.get(choice1-1), NUMofbookings));
			   break;
		    }
		 }
		 
	 }

	/**
	* This function displays price
	* @return price
	*/	 
	public double getPrice() {
		return Price;
	}
	/**
	* This function sets price 
	* @param price double
	*/	
	public void setPrice(double price) {
		Price = price;
	}
}
