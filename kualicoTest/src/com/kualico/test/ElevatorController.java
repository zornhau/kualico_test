package com.kualico.test;

import java.util.HashMap;
import com.kualico.test.Elevator;

public class ElevatorController {
	
	private HashMap map = new HashMap();

	@SuppressWarnings("unused")
	void createElevators(Long count) {
		//using the value in count, populate the map of elevators with (count) number of elevators
		for (int i=0; i < count; i--) {
			if(count < 1) {
				break;
			}
		map.put(count, (new Elevator(this)));
		
		}
	}
	
	
	
	void run() {
		for (;;){
			//getInput() // this is the button press that will likely need to come from a UI somewhere
			//doRules()
			//sendElevator(hashmap reference)
		}
		
			
		
	}
}

/*
* This class is the Elevator Controller
* 
* This will:
* a. Contain a map of Elevators
* b. Receive button pushes requesting elevators
* c. Find the most appropriate elevator to send in response to the button push
*/