package robolego;

import java.io.DataInputStream;
import java.io.IOException;

import lejos.nxt.Button;
import lejos.nxt.ButtonListener;
import lejos.nxt.LCD;
import lejos.nxt.comm.Bluetooth;
import lejos.nxt.comm.NXTConnection;

import lejos.nxt.Motor; // <--import motors lib

public class Main {

	public static void main(String[] args) {
		
	}
	
	public void moveForward(){
		Motor.A.forward();	
	}

}
