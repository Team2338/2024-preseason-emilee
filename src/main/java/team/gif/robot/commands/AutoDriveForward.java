package team.gif.robot.commands;

import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.Command;
import team.gif.robot.Constants;
import team.gif.robot.Robot;
import team.gif.robot.subsystems.DriveTrain;

public class AutoDriveForward extends Command {

    public static int Counter ;



    public AutoDriveForward(double time) {
        super();
        addRequirements(Robot.driveTrain);
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
        System.out.println("auto command init");
        Counter = 0;
    }

    // Called every time the scheduler runs (~20ms) while the command is scheduled
    @Override
    public void execute() {
        System.out.println("driving forward");
        Robot.driveTrain.driveTank(0.5, -0.5);

        Counter++;
    }

    // Return true when the command should end, false if it should continue. Runs every ~20ms.
    @Override
    public boolean isFinished() {
        return Counter > Constants.FINAL_COUNT;
    }

    // Called when the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        System.out.println("autos command done");
        Robot.driveTrain.driveArcade(0,0);
    }
}
