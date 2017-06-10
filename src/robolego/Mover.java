package robolego;

import lejos.nxt.Motor;

public class Mover {

	public static void MoveBrick(int n){
		if(n == 102) // <--ASCII for F = 102
		{
		Motor.A.forward(); // <-- when pressing F, activate motor A in forward direction
		}
		if(n == 115) // <--ASCII FOR S = 115
		{
		Motor.A.stop(); // <-- when pressing S, activate motor A in backward direction
		}
	}
	

}
