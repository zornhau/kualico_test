/*
* This class is the Elevator Controller
* 
* This will:
* a. Contain a map of Elevators
* b. Receive button pushes requesting elevators
* c. Find the most appropriate elevator to send in response to the button push
*/

package com.kualico.test;

import java.util.HashMap;
import com.kualico.test.Elevator;

public class ElevatorController {
	
	private HashMap elevatorMap = new HashMap();
	
	// consider a HashMap for each possible elevator state
	// key = elevator number, value = state (door opened)
	// key = elevator number, value = state (door closed) -- could be a boolean from the line above - true if open, false if closed
	// key = elevator number, value = state (moving)
	// key = elevator number, value = state (stopped)
	/// and so on....
	// This is interesting from the perspective that the controller can now ask specific questions
	//about specific states and get the answer quickly.  This is probably useful for splitting out
	// into services or whatever in a much more complex example...
	private HashMap doorOpenCLosedMap = new HashMap();
	private HashMap floorIAmOnMap = new HashMap(); // obviously, if I'm on a floor, I'd darn well better not be moving!
	private HashMap movingStoppedMap = new HashMap(); //can probably use Booleans and be true for one and false for the other

	@SuppressWarnings("unused")
	void createElevators(Long count) {
		//using the value in count, populate the map of elevators with (count) number of elevators
		for (int i=0; i < count; i--) {
			if(count < 1) {
				break;
			}
			elevatorMap.put(count, (new Elevator(this)));
		
		}
	}
	
	
	
	void run() {
		for (;;){
			//getInput() // this is the button press that will likely need to come from a UI somewhere
			//doRules()
			//sendElevator(hashmap reference)
		}		
	}
	
	void updateDoorState(Long elevatorNumber, Boolean doorState) {
		doorOpenCLosedMap.put(elevatorNumber, doorState);
		
		//Alternatively, have a separate method for each state.
		//probably faster and more efficient and more easily split later on...
		//Yes - door #2 - have a method for each state that only updates one HashMap
		//updateDoorState(Long elevatorNumber, Boolean open) {}
	}
	
	void updateFloorState(Long elevatorNumber, Boolean floorState) {
		
	}//... and so on...
	
	void push(Long floor) {
		//isAnyElevatorThere
		//IsAnyElevatorCloseAndStopped
		//IsAnyElevatorMovingTheRightWay
	}
}

