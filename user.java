package GOFO;
import java.util.Scanner;

/**
 * This class is implemented to take the user attributes
 */

public  class user {
	Scanner scan = new Scanner(System.in);
	
	
	private String name,ID,password,Email,phone,location; 
	private eWallet Money = new eWallet() ;
	/**
	* This function is a login to the user  
	*/
	public  void login()
	{
		 System.out.println("Enter your name, ID, password, Email, phone number, your location");
		  name = scan.nextLine();
		  ID = scan.nextLine();
		  password = scan.nextLine();
		  Email = scan.nextLine();
		  phone = scan.nextLine();
		  location = scan.nextLine();
	}
	/**
	* This function is to set user name
	* @param name user Name 
	*/
	public void SetName(String name)
	{
		this.name=name;
	}
	/**
	* This function is to set user ID
	* @param ID user ID
	*/
	public void SetID(String ID)
	{
		this.ID=ID;
	}
	/**
	* This function is to set user password
	* @param password user password 
	*/
	public void Setpassword(String password)
	{
		this.password=password;
	}
	/**
	* This function is to set user Email
	* @param Email user email 
	*/
	public void SetEmail(String Email)
	{
		this.Email=Email;
	}
	/**
	* This function is to set user phone
	* @param phone user phone 
	*/
	public void Setphone(String phone)
	{
		this.phone=phone;
	}
	/**
	*This function is to set user location
	* @param Location user Location 
	*/
	public void SetLoc(String Location)
	{
		this.location=Location;
	}
	/**
	* This function returns user name
	* @return name user name
	*/
	public String GetName()
	{
		return name;
	}
	/**
	* This function returns user ID
	* @return ID user ID 
	*/
	public String GetID()
	{
		return ID;
	}
	/**
	* This function returns user password
	* @return password user password 
	*/
	public String Getpassword()
	{
		return password;
	}
	/**
	* This function returns user Email
	* @return Email user Email 
	*/
	public String GetEmail()
	{
		return Email;
	}
	/**
	* This function returns user phone
	* @return phone user phone 
	*/
	public String GetPhone()
	{
		return phone;
	}
	/**
	* This function returns user location
	* @return location user location 
	*/
	public String GetLoc()
	{
		return location;
	}
	/**
	* This function returns money
	* @return money 
	*/
	public eWallet GetMoney()
	{
		return Money;
	}
}
