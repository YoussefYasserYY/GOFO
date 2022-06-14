package GOFO;

/**
 * This class is implemented to provide payment method
 */
public class eWallet {
        private double money = 0;
         /**
    	 * This function prints money amount
    	 * @return money 
    	 */
        public double GetMoney()
        {
        	return money;
        }
    	/**
    	 * This function sets money amount 
    	 * @param M Money
    	 */
        public void SetMoney(double M)
        {
        	money = M;
        }
    	/**
    	 * This function adds money to wallet
    	 * @param M Money
    	 */
        public void AddMoney(double M)
        {
        	money = money+ M;
        }
        
    	/**
    	 * This function subtracts money from wallet
    	 * @param M money
    	 * @return boolean
    	 */
        public boolean subtractMoney(double M)
        {
        	if (money < M)
        	{
        		return false;
        	}
        	
        	money = money -  M;
        	return true;
        }
        }       
