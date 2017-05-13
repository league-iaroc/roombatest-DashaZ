package level1;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level1.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}
	/**
	 * Without touching the wall reach the endZone
	 * use sleep an driveDirect 
	 */
	public void initialize() {
		//write code here!
			
			driveDirect(500, 500);		//Go straight
			sleep(2500);			//for 2.5 seconds
			turnLeft(4300);	//Turn left for 4.3 seconds
			driveDirect(500, 500);		//Go straight
			sleep(7500); // for 7.5 seconds
           turnLeft(4300);//Turn left for 4.3 seconds
           driveDirect(500,500); //Go straight
		}

	//Use methods isBumpedRight() and isBumpedLeft() in loop() method, to detect contact with walls.
	
	

	private void turnLeft(int duration ) {
		driveDirect(10, 100);		
		sleep(duration);
	}
	public void loop() {
		if(isBumpedRight() == true){
			driveDirect(10, 100);	
			sleep(3000);
		}
		if(isBumpedLeft() == true){
			driveDirect(100, 10);	
			sleep(3000);
	}
}
}
