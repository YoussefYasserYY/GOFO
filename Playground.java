package GOFO;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class is implemented to store playground data
 */
public class Playground {
   Scanner scan = new Scanner(System.in);
   private String PGname;
   private String PGlocation;
   private String Pgsize;
   private int Hourscounter;
   private double cancelperiod;
   private double PGprice;
   private boolean Active;
   ArrayList<String> PGavailbleHours = new ArrayList<String>();
	/**
	* This constructor is to set the playground attributes data
	* @param PGname playground name
	* @param PGlocation playground location
	* @param PGsize Playground size
	* @param PGprice playground price
	* @param PGcancelperiod playground cancel period  
	*/   
   public Playground(String PGname,String PGlocation,String PGsize,double PGprice,double PGcancelperiod) 
    {
	   this.PGname=PGname;
	   this.PGlocation = PGlocation;
	   this.PGprice=PGprice;
	   this.cancelperiod= PGcancelperiod;
	   this.Pgsize= PGsize;
	   this.Active = false;
	   int choice =1;
	   for(int i = 0;choice != 0;i++)
	   {
	      System.out.println("your Playground is available from: ");
          String from =  scan.next(); 
          System.out.println("your Playground is available until: ");
          String until =  scan.next();
          PGavailbleHours.add(i, from + " -> " + until);
          System.out.println("if you want to add another time press 1 if you want to end press 0");
          choice = scan.nextInt();
          Hourscounter=i+1;
	    }
    }
   
   /**
	 * This function returns available playgrounds
	 * @return  PGavailbleHours Playground available hours
	*/
    public ArrayList<String> getPGavailbleHours() {
    	for(int i = 0; Hourscounter > i;i++)
    	{ System.out.println((i+1)+") " + PGavailbleHours.get(i));}
    	return PGavailbleHours;
    }
    /**
 	* This function returns available playgrounds
 	* @return  PGavailbleHours Playground available hours
 	*/
    public String getPGname() {
		return PGname;
	}
    /**
 	* This function checks if a playground is active or not  
 	* @return  Active playground condition
 	*/
	public boolean isActive() {
		return Active;
	}
    /**
 	* This function set the condition of the playground
 	* @param  active Playground condition
 	*/
	public void setActive(boolean active) {
		Active = active;
	}
    /**
 	* This function returns total playground price
 	* @return  PGprice total playground price
 	*/
	public double Totalprice()
    {
    	return PGprice;
    }
    /**
 	* This function returns cancellation period of a booking 
 	* @return  cancelperiod cancellation period of a booking 
 	*/
	public double getCancelperiod() {
		return cancelperiod;
	}
    /**
 	* This function sets cancellation period of a booking 
 	* @param  cancelperiod cancellation period of a booking 
 	*/
	public void setCancelperiod(double cancelperiod) {
		this.cancelperiod = cancelperiod;
	}
    /**
 	* This function returns playground size
 	* @return Pgsize  playground size
 	*/
	public String getPgsize() {
		return Pgsize;
	}
    /**
 	* This function sets playground size
 	* @param  pgsize playground size
 	*/
	public void setPgsize(String pgsize) {
		Pgsize = pgsize;
	}
    /**
 	* This function returns playground location
 	* @return  PGlocation playground location
 	*/
	public String getPGlocation() {
		return PGlocation;
	}
    /**
 	* This function sets playground location
 	* @param pGlocation playground location
 	*/
	public void setPGlocation(String pGlocation) {
		PGlocation = pGlocation;
	}
    /**
 	* This function returns playground hours
 	* @return Hourscounter playground hours
 	*/
	public int getHourscounter() {
		return Hourscounter;
	}
    /**
 	* This function sets playground hours
 	* @param hourscounter playground hours
 	*/
	public void setHourscounter(int hourscounter) {
		Hourscounter = hourscounter;
	}
}

