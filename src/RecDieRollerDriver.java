/**
 * This class is the application class for the RecDieRollar class which simulates rolling a die and trying to land on a specific number.
 * It uses a for loop to execute the roll() method a thousands times. It captures how many rolls it took to land on the number 2 showing
 * and stores that into an array. It then uses that array to find the mean of those rolls.    
 * @author Chris Burkhead
 * @version 1.0
 * Assignment 3.1
 * CS215-ON
 * Fall 2022
 *
 */
public class RecDieRollerDriver {
	
	public static void main(String[] args) {
		
		//instance variables, arrays and classes
		int[] rollmean= new int[1001];
		RecDieRoller snakeEyes =new RecDieRoller();
		int sum=0;
	
		/**
		 * This for loop executes the roll() method 1000 times, printing out how many rolls (variable count) it took to land on a 2 showing, 
		 * then storing that number into an array. It then resets count for the roll() method to 1.  
		 */
		for (int i=0;i<=1000;i++) {
		snakeEyes.roll(1);
		System.out.println();
		System.out.println("It took "+snakeEyes.count+", rolls to land on a 2");
		rollmean[i]=snakeEyes.count;
		snakeEyes.count=1;}
		
		//for loop to iterate through the array and add up all the total rolls into variable sum
		for (int e=0;e<1000;e++) {
				sum=sum+rollmean[e];}
		
		//determining the mean by dividing the variable sum by how many times the loop was executed
		int mean=sum/1000;
		
		//printing out results
		System.out.println("After running the program 1000 times The average number of rolls to land on a 2 showing was "+mean);

	
	}//end main

}//end class
