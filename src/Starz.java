// Copyright Wintriss Technical Schools 2014
import org.teachingextensions.logo.Tortoise;

/*** Teacher's note ***/
/*
 * Start by reviewing the 3 pieces of a for loop (initialization, condition,
 * increment). Do not give the students the answer to the challenge.
 */

public class Starz {

	public static void main(String[] args) {

		Tortoise tort = new Tortoise();
		// 1. Set the X position of the Tortoise so that it starts on the left. You also need to show the Tortoise to see the result of this line.
		tort.setX(0);
		tort.setSpeed(10);
		tort.show();
		// 2. Make the Tortoise draw a star shape. Hint: 144.

		// 3. Set the size of the star to 30.
		
		/** THE CHALLENGE: **/
		/*
		 * Make the Tortoise draw a line of stars like this:
		 * http://bit.ly/walk-of-fame
		 * 
		 * Hint: The distance between stars is 50.
		 */
		int count = 0;	
		int starter = 0;
		while(count < 14)
		{
		tort.setX(starter);
		for(int i = 0; i < 5; i++)
		{
			tort.move(30);
			tort.turn(144);
		}
		starter = starter + 50;
		count++;
		}
		

	}

}