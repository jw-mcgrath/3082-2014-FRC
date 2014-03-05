// RobotBuilder Version: 1.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.
package org.usfirst.frc3082.AerialBot.subsystems;
import org.usfirst.frc3082.AerialBot.RobotMap;
import org.usfirst.frc3082.AerialBot.commands.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
/**
 *
 */
public class AirSys extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    Compressor compressor1 = RobotMap.airSysCompressor1;
    DoubleSolenoid launcherSol = RobotMap.airSysLauncherSol;
    DoubleSolenoid intakeSol = RobotMap.airSysIntakeSol;
    public String solenoidState = launcherSol.get().toString();
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new start());
    }
    public void onCompressor(){
    compressor1.start();
    }
    public void offCompressor(){
    compressor1.stop();
    }
    public void safetyCheck(){
        if(compressor1.getPressureSwitchValue()== true && compressor1.enabled()){
            compressor1.stop();
        }
        else if(!compressor1.getPressureSwitchValue()&& !compressor1.enabled()){
            compressor1.start();
        }
    
            
    }
    public void solenoidSwitchLauncher(){
        launcherSol.set(DoubleSolenoid.Value.kForward);
        }
    public void solenoidOutGear(){
        launcherSol.set(DoubleSolenoid.Value.kReverse);
    }
    public void intakeSolUp(){
        intakeSol.set(DoubleSolenoid.Value.kReverse);
    }
    public void intakeSolDown(){
        intakeSol.set(DoubleSolenoid.Value.kForward);
    }
}
