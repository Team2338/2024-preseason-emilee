package team.gif.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.RobotMap;


public class DriveTrain extends SubsystemBase {
    public final WPI_TalonSRX leftCIM;
    public final WPI_TalonSRX rightCIM;

    private DifferentialDrive drive;
    public DriveTrain() {
        leftCIM = new WPI_TalonSRX(RobotMap.LEFT_CIM_ID);
        rightCIM = new WPI_TalonSRX(RobotMap.RIGHT_CIM_ID);

        leftCIM.configFactoryDefault();
        rightCIM.configFactoryDefault();

        leftCIM.setNeutralMode(NeutralMode.Brake);
        rightCIM.setNeutralMode(NeutralMode.Brake);

        drive = new DifferentialDrive(leftCIM, rightCIM);
    }

    public void driveArcade(double speed, double rotation){
        drive.arcadeDrive(speed,rotation);
    }
    public void driveTank(double leftspeed, double rightspeed){
        drive.tankDrive(leftspeed, rightspeed);}



}


