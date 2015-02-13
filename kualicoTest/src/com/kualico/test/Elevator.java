/*
* This class represents an elevator
* 
* This will:
* a. have a way of obeying all the rules that elevators must obey - probably a method per...
* b. be able to communicate to the Elevator Controller all that it is doing (doors open, close etc)
*           (will need a reference to the controller.   Pass that in from the main probably)
* c. Know when this particular elevator has passed it's service "date"  i.e. 100 trips
*/



package com.kualico.test;
import com.kualico.test.ElevatorController;

public class Elevator {
	private ElevatorController ev;
	private Long floorsPassed;
	private Boolean inMaintenanceMode;
	private Long numberOfTrips;
	
	/*
	 * This constructor is called by the ElevatorController
	 * Every Elevator gets a reference to a single ElevatorController
	 */
	public Elevator(ElevatorController elevatorController) {
		ev = elevatorController;
	}
	
	/* Need Methods & variables For trips, floors passed, maintenance mode etc...
	 * Requirements: The elevator should keep track of how many trips it has made, and how many floors it
		has passed. The elevator should go into maintenance mode after 100 trips, and stop
		functioning until serviced, therefore not be available for elevator calls.
	 */
	
	/* Need methods for Elevator to call into controller with this information
	 * Each elevator will report as is moves from floor to floor.
	   Each elevator will report when it opens or closes its doors.
	   One possibility is to make the elevator report to the controller that it has hit it's 100 trip limit
	   if so, controller will need to keep another list of some sort of elevators that should NOT be called
	   This may be overkill because each elevator can know and be asked if it's "dead" and the controller can just move on.
	 */
	
	//ev.updateDoorState(Long elevatorNumber, Boolean open) {} and so on here...

}

