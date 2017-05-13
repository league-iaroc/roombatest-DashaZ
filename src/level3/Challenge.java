package level3;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level3.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	public void initialize() {
		driveDirect(1000, 1000);	// go straight	
		sleep(1100);			// for 1.1 seconds
		turnLeft(2700);		// turn left for 2.7 seconds
		driveDirect(1000, 1000);		// go straight		
		sleep(1100); // for 1 second
		turnRight(2700); // turn right for 2.7 seconds
		driveDirect(1000, 1000);				// go straight 
		sleep(1000);		// for 1 second
		turnLeft(2700);		// turn left for 2.7 seconds
		driveDirect(1000, 1000);			// go straight	
		sleep(900); // for .9 seconds
		turnRight(2700); // turn right for 2.7 seconds
		driveDirect(1000, 1000);				// go straight
		sleep(1100); // for 1.1 second
       
       
	}

//Use methods isBumpedRight() and isBumpedLeft() in loop() method, to detect contact with walls. Left, Left, Right, Straight



private void turnLeft(int duration ) {
	driveDirect(10, 100);		
	sleep(duration);
}

private void turnRight(int duration) {
driveDirect(100,10);
sleep(duration);
}
public void loop() {
	if(isBumpedRight() == true){
		driveDirect(10, 100);	
		sleep(3000);
		driveDirect(500,500);
	}
	if(isBumpedLeft() == true){
		driveDirect(100, 10);	
		sleep(3000);
		driveDirect(500,500);
	}
}
}
