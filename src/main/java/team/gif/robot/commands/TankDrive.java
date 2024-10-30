package team.gif.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import team.gif.robot.Robot;

public class TankDrive extends Command {

    public TankDrive() {
        super();
        //addRequirements(Robot.climber); // uncomment
        addRequirements(Robot.driveTrain);
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {}

    // Called every time the scheduler runs (~20ms) while the command is scheduled
    @Override
    public void execute() {
        double rightPos = Robot.oi.driver.getRightY();
        double leftPos = Robot.oi.driver.getLeftY();

        Robot.driveTrain.driveTank(leftPos, rightPos);
    }

    // Return true when the command should end, false if it should continue. Runs every ~20ms.
    @Override
    public boolean isFinished() {
        return false;
    }

    // Called when the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        Robot.driveTrain.driveTank(0,0);
    }
}
