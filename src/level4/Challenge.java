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
		driveDirect (10,1000);
		sleep(1000);
		
		//isBumpedLeft();
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
	
	if(isBumpedRight() == true && isBumpedLeft() == false){
		System.out.println("I bumped right, but not left. ");
		
	}
		
		
		
	
if(isBumpedLeft() == true && isBumpedRight() == false){
	System.out.println("I bumped left, but not right. ");
	
}
if(isBumpedLeft()== true &&isBumpedRight() == true){
	System.out.println("I bumped right and left.");
	driveDirect(-500,-500);
	sleep(200);
	driveDirect(700,1000);
	sleep(200);
}
if(isBumpedRight()  == false && isBumpedLeft() == false) {
	driveDirect (1000,1000);
	

	}
}
}
