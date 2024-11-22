package team.gif.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import team.gif.robot.Constants;

public class AutosGroups extends SequentialCommandGroup {
    public AutosGroups () {
        addCommands(
                new AutoDriveForward(Constants.Auto_Time)
        );
    }
}
