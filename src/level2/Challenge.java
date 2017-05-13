package level2;

import level1.Sonar;
import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level2.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
		Sonar sonar = new Sonar(roomba);
	}

	public void initialize() {
		driveDirect(1000, 1000);	// go straight	
		sleep(1700);			// for 1.7 seconds
		turnLeft(3400);		// turn left for 3.4 seconds
		driveDirect(1000, 1000);		// go straight		
		sleep(2500); // for 2.5 seconds
		turnRight(3500); // turn right for 3.5 seconds
		driveDirect(1000, 1000);	// go straight			
		sleep(1000);		// for 1 second
		
       
       
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
