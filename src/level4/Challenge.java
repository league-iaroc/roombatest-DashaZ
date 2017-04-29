package level4;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level4.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}
	/**
	 * complete the MAZE
	 * Hint: use bump sensors
	 */
	
	
	public void initialize() {
		driveDirect(500, 500);		
		sleep(2000);			
		turnLeft(2000);		
		driveDirect(500, 500);				
		sleep(6000);
       turnRight(3000);       
       driveDirect(500,500);
       sleep(3000);
       turnRight(3000);
       driveDirect(500,500);
       sleep(2000);
       turnLeft(3000);
       driveDirect(500,500);
       sleep(2000);
       turnLeft(2000);
       driveDirect(500,500);
       sleep(2000);
       turnRight(2000);
       driveDirect(500,500);
       sleep(3000);
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
