package GOFO;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int choice = 1;
		int choice2 = 1;
		Owner O1 = new Owner();
		system S1 = new system();
		Player P1 = new Player();
		while (choice2 != 0)
		{
		System.out.println("Choose 1 to login as an Owner \nChoose 2 to login as a Player \nChoose 0 to exit ");
		choice2 = scan.nextInt();
		if(choice2 == 1)
		{
		  O1.login();
		  while (choice!=0)
	      {
			S1.Displaymenu(O1);
			choice = scan.nextInt();
			if(choice == 1)
			{
				  O1.AddPlayground();
				  S1.checkPGinfo(Owner.PGlist.get(Owner.playgroundscount-1));
			}
			else if(choice ==2)
			{
				System.out.println(O1.CheckMoney());
			}
			else if(choice == 3)
			{
				
			}
			else if(choice == 0)
			{
				break;
			}
		  }
		}
		if(choice2 == 2)
		{
			P1.login();
			while (true)
			{
			S1.Displaymenu(P1);
			choice = scan.nextInt();

			if(choice == 1)
			{
				P1.AvailablePlaygrounds();
			}
			else if(choice==2)
			{
				P1.BookPlayground();
			}
			else if(choice==3)
			{
				System.out.println(P1.CheckMoney());
			}
			else if (choice == 0)
			{
				break;
			}
			else
			{
				System.out.println("This choice is not from the requirements");
			}
			}
		}
		if (choice2==0)
		{
			break;
		}
	}
	}
}
