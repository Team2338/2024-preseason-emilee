package team.gif.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import team.gif.robot.Constants;
import team.gif.robot.Robot;

public class CollectorPivotHold extends Command {

    public CollectorPivotHold() {
        super();
        //addRequirements(Robot.climber); // uncomment
        addRequirements(Robot.collectorPivot);
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {}

    // Called every time the scheduler runs (~20ms) while the command is scheduled
    @Override
    public void execute() {
        if (Robot.collectorPivot.getPosition() >= -300){
            Robot.collectorPivot.moveMotor(Constants.PIVOT_COLLECTOR_UP_HOLD_PERC);
        }
        if (Robot.collectorPivot.getPosition() <= -800){
            Robot.collectorPivot.moveMotor(Constants.PIVOT_COLLECTOR_DOWN_HOLD_PERC);
        }
    }

    // Return true when the command should end, false if it should continue. Runs every ~20ms.
    @Override
    public boolean isFinished() {
        return false;
    }

    // Called when the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {}
}
