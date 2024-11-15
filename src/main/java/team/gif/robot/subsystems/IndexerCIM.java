package team.gif.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.RobotMap;

public class IndexerCIM extends SubsystemBase {
    private final TalonSRX indexmotor;

    public IndexerCIM(){
        indexmotor = new TalonSRX(RobotMap.INDEXER_CIM);
        indexmotor.configFactoryDefault();
        indexmotor.setNeutralMode(NeutralMode.Brake);
    }

    public void indexercontrol(double percentoutput){
        indexmotor.set(TalonSRXControlMode.PercentOutput, percentoutput);
    }
}
