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
		driveDirect(1000, 1000);		
		sleep(1000);			
		turnLeft(2500);		
		driveDirect(1000, 1000);				
		sleep(1000);
		turnRight(2500);
		driveDirect(1000, 1000);				
		sleep(1000);		
		turnLeft(2500);		
		driveDirect(1000, 1000);				
		sleep(1000);
		turnRight(1500);
		driveDirect(1000, 1000);				
		sleep(1000);
       
       
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
