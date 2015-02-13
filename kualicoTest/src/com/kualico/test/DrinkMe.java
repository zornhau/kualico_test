
package com.kualico.test;
//Author John Bickerstaff

import com.kualico.test.ElevatorController;
import com.kualico.test.Elevator;

/*
 * PLEASE NOTE:
 * I sent Doug Pace a screenshot of my whiteboarding of the assignment ahead of these commits.
 * I hope that the whiteboard will count as part of the design exercise - 
 * I tend to think best like that - pen in hand... 
 */
public class DrinkMe {
	public static void main(String[] args) { 
	      //Create an ElevatorController
	      ElevatorController c = new ElevatorController(); // ONLY ONE TO BE CREATED - later make it a singleton if it matters
	      // Make "n" number of elevators inside the controller.  yes, it could have come in on the args
	      c.createElevators(5L);
	      //start the simulation inside the controller
	      c.run();
	      
	   }
}

/*
 * This class is the main or start point.  I have a thing for Lewis Carrol, thus the "drink me"
 * 
 * This will:
 * a. Create the controller
 * b. Create N number of elevators inside the controller
 * c. possibly control some or all of the looping - we'll see as we go.
 *        Nope - decided to put the loop in the controller...
 */
