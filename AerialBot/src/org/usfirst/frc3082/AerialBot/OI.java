// RobotBuilder Version: 1.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.
package org.usfirst.frc3082.AerialBot;
import org.usfirst.frc3082.AerialBot.commands.IntakeStop;
import org.usfirst.frc3082.AerialBot.commands.intakeSolenoidDown;
import org.usfirst.frc3082.AerialBot.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton fire;
    public JoystickButton solIn;
    public Joystick joystick1;
    public JoystickButton intakeUp;
    public JoystickButton intakeDown;
    public Joystick joystick2;
    public JoystickButton afterFire;
    public JoystickButton solOut;
    public JoystickButton intakeSolDown;
    public JoystickButton intakeSolUp;
    public JoystickButton intakeStop;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        joystick2 = new Joystick(2);
        
        intakeDown = new JoystickButton(joystick2, 4);
        intakeDown.whenPressed(new IntakeFor());
        intakeUp = new JoystickButton(joystick2, 3);
        intakeUp.whenPressed(new IntakeBack());
        intakeSolDown= new JoystickButton(joystick2,5);
        intakeSolDown.whenPressed(new intakeSolenoidDown());
        intakeSolUp = new JoystickButton(joystick2,6);
        intakeSolUp.whenPressed(new intakeSolenoidUp());
        intakeStop= new JoystickButton(joystick2, 1);
        intakeStop.whenPressed(new IntakeStop());
        
        joystick1 = new Joystick(1);
        
        solIn = new JoystickButton(joystick1, 3);
        solIn.whenPressed(new LauncherSolSwitch());
        fire = new JoystickButton(joystick1, 1);
        fire.whenPressed(new LauncherCom());
        afterFire = new JoystickButton(joystick1,2);
        afterFire.whenPressed(new LauncherBack());
        solOut = new JoystickButton(joystick1,6);
        solOut.whenPressed(new Solout());
        
        
        
	    
        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("Driving", new Driving());
        SmartDashboard.putData("LauncherCom", new LauncherCom());
        SmartDashboard.putData("IntakeFor", new IntakeFor());
        SmartDashboard.putData("IntakeBack", new IntakeBack());
        SmartDashboard.putData("Launcher Sol Switch", new LauncherSolSwitch());
        
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getJoystick1() {
        return joystick1;
    }
    public Joystick getJoystick2() {
        return joystick2;
    }
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}
