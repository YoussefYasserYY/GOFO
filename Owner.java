package GOFO;
import java.util.Scanner;
import java.util.ArrayList;


/**
 * This class is implemented to set playground  info
 */


public class Owner extends user{ 
	static ArrayList<Playground> PGlist = new ArrayList<Playground>();
	static int playgroundscount = 0;

	
    /**
	 * This function adds playground to the system 
	 */
	public void AddPlayground()
	{
		System.out.println("Enter PlayGround Name");
		String name = scan.next();
		System.out.println("Enter PlayGround location");
		String Location = scan.next();
		System.out.println("Enter PlayGround Size");
		String Size = scan.next();
		System.out.println("Enter PlayGround price per Reservation");
		double price = scan.nextDouble();
		System.out.println("Enter PlayGround Cancellation Period");
		double Cancel = scan.nextDouble();
		Playground P1 = new Playground(name,Location,Size,price,Cancel);
		PGlist.add(playgroundscount, P1);
		playgroundscount ++;
	}
    /**
	 * This function display money 
	 * @return money
	 */
	 public double CheckMoney()
	 {
		 return GetMoney().GetMoney();
	 }

}
