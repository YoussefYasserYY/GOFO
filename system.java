package GOFO;

/**
 * This class is implemented to display menus to the user
 */

public class system {
	
	/**
	* This function display menu to the playground owner
	* @param O Owner
	*/
	public void Displaymenu(Owner O)
	{
		System.out.println("1: Add a PlayGround");
		System.out.println("2: Check Money");
		System.out.println("3: Change Playground Info");
		System.out.println("0: Exit");
	}
	/**
	* This function display menu to the player to book
	* @param P  Player
	*/
	public void Displaymenu(Player P)
	{
		System.out.println("1: Available Playgrounds");
		System.out.println("2: Book Playground");
		System.out.println("3: Check Money");
		System.out.println("4: Create Team");
		System.out.println("5: Join Team");
		System.out.println("0: Exit");
	}
	/**
	* This function display playground price
	* @param PG Playground
	* @param Counter I
	* @return total amount to pay
	*/
	public double Price(Playground PG,int Counter)
	{
		return (PG.Totalprice()*Counter);
	}
	/**
	* This function activates playground  
	* @param PG playground
	*/
	public void checkPGinfo(Playground PG)
	{
		Admin A1  = new Admin();
		A1.ActivatePG(PG);
	}
	/**
	* This function update playground bookings
	* @param PG playground
	* @param Index I
	*/
	public void updateBookings(Playground PG, int Index)
	{
		PG.getPGavailbleHours().remove(Index);
	}
	/**
	* This function displays playgrounds
	*/
	public void DisplayPlaygrounds()
	{
		System.out.println("Active Playgrounds:");
		for(int i = 0; i < Owner.playgroundscount; i++)
		{
			if(Owner.PGlist.get(i).isActive()==true) 
			{
		       System.out.println((i+1)+") " + Owner.PGlist.get(i).getPGname() + " at " + Owner.PGlist.get(i).getPGlocation());
			}
		}
		System.out.println("inActive Playgrounds : ");
		for(int i = 0; i < Owner.playgroundscount; i++)
		{
			if(Owner.PGlist.get(i).isActive()==false) 
			{
		       System.out.println((i+1)+") " + Owner.PGlist.get(i).getPGname() + " at " + Owner.PGlist.get(i).getPGlocation());
			}
		}
		
	}

}
