package org.usfirst.frc.team3158.robot.commands.chassis;

import org.usfirst.frc.team3158.robot.Robot;


import edu.wpi.first.wpilibj.command.Command;


/**
 *
 */
public class DefaultDriveCommand extends Command {

    public DefaultDriveCommand() {

    	requires(Robot.driveTrainSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	Robot.driveTrainSubsystem.driveT();
    	//System.out.println("I'm the default drive command!!!!!!!!!!!!!!!!!!!!!!!!1");
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
