package robolego;

import lejos.nxt.Motor;
import lejos.nxt.NXTRegulatedMotor;

public class Mover {

//	static int TIME = 900;
	static NXTRegulatedMotor MotorL = Motor.A;
	static NXTRegulatedMotor MotorR = Motor.C;
	

	public static void MoveBrick(int n){
		
//		long millis = System.currentTimeMillis();
		
		MotorR.setAcceleration(1000);
		MotorR.setSpeed(200);
		MotorL.setAcceleration(1000);
		MotorL.setSpeed(200);
		
		switch(n){
		case(102):
			Forward();
			break;
		case(98):
			Backward();
			break;
		case(114):
			Left();
			break;
		case(108):
			Right();
			break;
		case(115):
			stop();
			break;
		}

	}
	
	public static void Forward(){
//		long millis = System.currentTimeMillis();
//		while(System.currentTimeMillis()<(millis+TIME)){
//			Motor.A.forward();
//			Motor.B.forward();
//		}
//		stop();
		MotorL.forward();
		MotorR.forward();
	}
	
	public static void Backward(){
		MotorL.backward();
		MotorR.backward();
	}
	public static void Right(){
		MotorL.forward();
		MotorR.backward();
	}
	
	public static void Left(){
		MotorL.backward();
		MotorR.forward();
	}
	
	public static void stop(){
	
		MotorR.stop(true);
		MotorL.stop(true);
	}
}