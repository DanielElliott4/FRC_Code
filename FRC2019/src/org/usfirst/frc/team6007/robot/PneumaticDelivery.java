/******Edited on 21/01/2019, by Daniel Elliott******/
/****************************************************
*This controls the pneumatic delivery, i dont know 
*what it does, im just a slave
****************************************************/

package org.usfirst.frc.team6007.robot;

//i couldnt fint the library because im a chungus
import edu.wpi.first.wpilibj.Timer;

public class PneumaticDelivery extends Subsystem{
  //i dont know if anything extra goes here
  
  public PneumaticDelivery(){
	//does that thing and get the ports from robotMAP
    Solenoid leftPneumatic = new Solenoid(LEFT_SOLENOID_ID);
    Solenoid middlePneumatic = new Solenoid(MIDDLE_SOLENOID_ID);
    Solenoid rightPneumatic = new Solenoid(RIGHT_SOLENOID_ID);
    
  }

	public void pushOut(){//just pushes it out
		leftPneumatic(true);
		middlePneumatic(true);
		rightPneumatic(true);   
	} 

	public void pullIn(){// just pulls it in
		leftPneumatic(false);
		middlePneumatic(false);
		rightPneumatic(false);
	}

	public void pushAndPull(double delay){//pushes it out and pulls it in 
		leftPneumatic(true);			  //after a chosen amount of time
		middlePneumatic(true);
		rightPneumatic(true); 
		Timer.delay(delay);
		leftPneumatic(false);
		middlePneumatic(false);
		rightPneumatic(false);		
	}


}
