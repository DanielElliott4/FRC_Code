/***********************************************************
* 
* 
************************************************************/

package frc.robot;


public class CargoDelivery{
  
//	private static RobotIO ballLifterPotentiometer;
  	private static RobotIO robotIO;

	public CargoDelivery(){
  		robotIO = new RobotIO();
    	}
	
	public void cargoIntake(){
		while(robotIO.cargoSwitchIntake()){
		
		}
	}
	
  	public void cargoLoad(){
		//while(robotIO.ballPotentiometer.get >= ?value? && robotIO.ballPotentiometer.get <= ?value?){
		//}
	}
	

	public void cargoToHome(){
		while(robotIO.cargoSwitchAtHome()){
			
		}
	}
  }
