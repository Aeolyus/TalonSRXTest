package org.usfirst.frc.team2854.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.hal.CanTalonSRX;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	CanTalonSRX one; 
	CanTalonSRX two;
	CanTalonSRX three;
	CanTalonSRX four;
	
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() { //order of talons where 1 is the one closest to the roborio 
    	one = new CanTalonSRX(0); //3
    	two = new CanTalonSRX(1); //2
    	three = new CanTalonSRX(2); //1
    	four = new CanTalonSRX(3); //4
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        one.Set(1);
        Timer.delay(5);
        two.Set(1);
        Timer.delay(5);
        three.Set(1);
        Timer.delay(5);
        four.Set(1);
        Timer.delay(5);
        one.Set(0);
        Timer.delay(5);
        two.Set(0);
        Timer.delay(5);
        three.Set(0);
        Timer.delay(5);
        four.Set(0);
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
}