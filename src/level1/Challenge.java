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
			sleep(2000);			//for 2s
			//turnLeft(4000);	//Turn left for 4 seconds
			driveDirect(500, 500);		//Go straight
			sleep(7000);
           turnLeft(3000);//Turn left for 3 seconds
           driveDirect(500,500);//Go straight
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
