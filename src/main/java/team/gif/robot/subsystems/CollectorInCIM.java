package team.gif.robot.subsystems.drivers;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.RobotMap;

public class CollectorInCIM extends SubsystemBase {

    private final TalonSRX motor;

    public CollectorInCIM(){
        motor = new TalonSRX(RobotMap.COLLECTOR_CIM_IN);
        motor.configFactoryDefault();
        motor.setNeutralMode(NeutralMode.Brake);
    }

    public void collectorIntake(double percentoutput){
        motor.set(TalonSRXControlMode.PercentOutput, percentoutput);
    }
}
