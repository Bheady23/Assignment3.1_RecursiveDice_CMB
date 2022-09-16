import java.util.Random;
/**
 * This class uses a recursive method to simulate rolling a die and trying to land on a 2 showing. 
 * @author Chris Burkhead
 * @version 1.0
 * Assignment 3.1 
 * CS215-ON
 * Fall 2022
 *
 */
	

public class RecDieRoller {
	
	//instance variable 
	protected int count;
	
	/**
	 * Empty argument constructor sets variable count to 1, due to the nature of a recursive method calling itself, I could not instantiate the
	 * variable within the method as it would always reset itself with each method call. Also had to set the count equal to 1 as I had to assume 
	 * that just calling the method meant the die had been rolled once, and to take into account instances when the recursive method was satisfied on
	 * the first roll.      
	 */
	public RecDieRoller() {
		count=1;
	}//end empty argument constructor
	
	/**
	 * Recursive method roll() accepts @param dice. It simulates rolling a 6 sided die. 
	 * It uses Random() to generate a number 1-6 and then checks to see if that number is equal 2 (the equivalent of landing on 2 showing)
	 * If it is a 2 then the method is satisfied and ends, otherwise it recursively calls itself until it does roll a 2. 
	 * The variable count keeps track of how many rolls it takes to land on a 2. It also prints each roll to show what number was rolled. 
	 * @param dice
	 */
	public void roll(int dice) {
		
		int diceRoll = new Random().nextInt(6)  + 1;
		
		System.out.print(diceRoll+", ");
		
		if (diceRoll!=2) {
			count++;
			roll(diceRoll);}
		
	}//end roll

}//end class
