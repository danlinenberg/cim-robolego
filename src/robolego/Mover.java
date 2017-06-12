package robolego;

import lejos.nxt.Motor;

public class Mover {

	static int TIME = 900;
	public static void MoveBrick(int n){
		
		long millis = System.currentTimeMillis();
		
		while(System.currentTimeMillis()<(millis+TIME)){
			if(n == 102) // <--ASCII for F = 102
			{	
				Motor.A.forward();
				Motor.B.forward();
			}
			if(n == 115) // <--ASCII FOR S = 115
			{
			Motor.A.stop();
			}		
		}
		Motor.A.stop();
		Motor.B.stop();
	
	}
}