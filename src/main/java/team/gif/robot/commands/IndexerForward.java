package team.gif.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import team.gif.robot.Constants;
import team.gif.robot.Robot;

public class IndexerForward extends Command {

    public IndexerForward() {
        super();
        //addRequirements(Robot.climber); // uncomment
        addRequirements(Robot.indexerCIM);
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {}

    // Called every time the scheduler runs (~20ms) while the command is scheduled
    @Override
    public void execute() {
        Robot.indexerCIM.indexercontrol(-Constants.INDEXER_CIM_FORWARD_PERCENT_POWER);
    }

    // Return true when the command should end, false if it should continue. Runs every ~20ms.
    @Override
    public boolean isFinished() {
        return false;
    }

    // Called when the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        Robot.indexerCIM.indexercontrol(0);
    }
}
