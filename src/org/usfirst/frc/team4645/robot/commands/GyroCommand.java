package org.usfirst.frc.team4645.robot.commands;

import org.usfirst.frc.team4645.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class GyroCommand extends Command {

    public GyroCommand() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.gyroscopeSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.gyroscopeSubsystem.resetGyro();
    	Robot.gyroscopeSubsystem.calibrateGyro();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.gyroscopeSubsystem.getGyroAngle();
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
