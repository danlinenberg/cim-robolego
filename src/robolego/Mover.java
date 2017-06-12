package robolego;

import lejos.nxt.Motor;

public class Mover {

	static int TIME = 900;
	public static void MoveBrick(int n){
		
		long millis = System.currentTimeMillis();
		
		switch(n){
		case(102):
			Forward();
			break;
		case(115):
			Backward();
			break;
		}
	}
	
	public static void Forward(){
		long millis = System.currentTimeMillis();
		while(System.currentTimeMillis()<(millis+TIME)){
			Motor.A.forward();
			Motor.B.forward();
		}
		stop();
	}
	
	public static void Backward(){
		long millis = System.currentTimeMillis();
		while(System.currentTimeMillis()<(millis+TIME)){
			Motor.A.backward();
			Motor.B.backward();
		}
		stop();
	}
	
	public static void stop(){
		Motor.A.stop();
		Motor.B.stop();
	}
}