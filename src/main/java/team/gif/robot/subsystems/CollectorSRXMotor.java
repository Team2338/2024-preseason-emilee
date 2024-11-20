// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package team.gif.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.RobotMap;

public class CollectorSRXMotor extends SubsystemBase {
    /** Creates a new ExampleSubsystem. */
    public TalonSRX winch;
    private static TalonSRX motor;
    TalonSRX talonsrx = new TalonSRX(1);
    public CollectorSRXMotor( ) {
        motor = new TalonSRX(RobotMap.TALON_COLLECTOR_ID);
        motor.configFactoryDefault();
        motor.setNeutralMode(NeutralMode.Brake);

        // configure the device to use a PWM position input
        talonsrx.configSelectedFeedbackSensor(FeedbackDevice.PulseWidthEncodedPosition);

// Zeros the relative sensor position SRX-side.
// note that this is not the same as zeroing the value by pressing the onboard button!
        talonsrx.setSelectedSensorPosition(0);

// Returns relative position. one rotation is 4096 units.
        talonsrx.getSelectedSensorPosition(4096);

// Absolute position can be derived from getPulseWidthRiseToFallUs(), which will range from 0 to 2047 inclusive. This will include Canandmag-local offsets like zeroing with the onboard button.
        talonsrx.getSensorCollection().getPulseWidthRiseToFallUs();

//Rotate 10 rotations, each rotation being 4096 units
        talonsrx.set(ControlMode.Position, 5 * 4096);
    }

    public void moveMotor(double percentOutput) {
        motor.set(TalonSRXControlMode.PercentOutput, percentOutput);

    }
    public void zeroEncoder() {
        winch.setSelectedSensorPosition(0);
    }
}
