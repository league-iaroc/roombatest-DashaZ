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
		driveDirect(1000, 1000);		
		sleep(1700);			
		turnLeft(3400);		
		driveDirect(1000, 1000);				
		sleep(2500);
		turnRight(3500);
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
