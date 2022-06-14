package GOFO;
import java.util.Scanner;

/**
 * This class is implemented to control playgrounds by Admins 
 */

public class Admin {
	/**
	 * This function activates the playground
	 * @param PG playground
	 */
	public void ActivatePG(Playground PG)
	{
		PG.setActive(true);
	}
	/**
	 * This function approves the playground
	 * @param PG playground
	 */
	public void ApprovePG(Playground PG)
	{
		PG.setActive(true);
	}
	/**
	 * This function suspends the playground
	 * @param PG playground
	 */
	public void SuspendPG(Playground PG)
	{
		PG.setActive(false);
	}
	/**
	 * This function denies the playground
	 * @param PG playground
	 */
	public void DenyPG(Playground PG)
	{
		PG.setActive(false);
	}
}
