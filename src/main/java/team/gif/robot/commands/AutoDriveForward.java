package team.gif.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import team.gif.robot.Robot;
import team.gif.robot.subsystems.DriveTrain;

public class AutoDriveForward extends Command {

    private int timer;

    public AutoDriveForward(double encoderSetPoint) {
        super();
        //addRequirements(Robot.climber); // uncomment
        addRequirements(Robot.driveTrain);
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
        timer = 0;

    }

    // Called every time the scheduler runs (~20ms) while the command is scheduled
    @Override
    public void execute() {
        timer++;

        Robot.driveTrain.driveTank(1,1);
    }

    // Return true when the command should end, false if it should continue. Runs every ~20ms.
    @Override
    public boolean isFinished() {

        return timer >= 100;
    }

    // Called when the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {}
}
