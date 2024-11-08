package team.gif.robot.commands;

import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.Command;
import team.gif.robot.Robot;
import team.gif.robot.subsystems.DriveTrain;

public class AutoDriveForward extends Command {

    double intialTime;
    double Time;


    public AutoDriveForward(double time) {
        super();
        addRequirements(Robot.driveTrain);
        Time = time;
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
        intialTime = Timer.getFPGATimestamp();
    }

    // Called every time the scheduler runs (~20ms) while the command is scheduled
    @Override
    public void execute() {
        Robot.driveTrain.rightCIM.set(ControlMode.PercentOutput, 0.5);
        Robot.driveTrain.leftCIM.set(ControlMode.PercentOutput, 0.5);
    }

    // Return true when the command should end, false if it should continue. Runs every ~20ms.
    @Override
    public boolean isFinished() {
        return (Timer.getFPGATimestamp() > intialTime + Time);
    }

    // Called when the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        Robot.driveTrain.rightCIM.set(ControlMode.PercentOutput, 0.0);
        Robot.driveTrain.leftCIM.set(ControlMode.PercentOutput, 0.0);
    }
}
