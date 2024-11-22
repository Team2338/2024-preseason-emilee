// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package team.gif.robot;

import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import edu.wpi.first.math.trajectory.TrapezoidProfile;
import edu.wpi.first.math.util.Units;

import java.util.Timer;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final double Auto_Time = 5;
    public static final double COLLECTOR_INTAKE_PERCENT_POWER = .2;
    public static final double COLLECTOR_REVERSE_PERCENT_POWER = .2;
    public static final double INDEXER_CIM_FORWARD_PERCENT_POWER = .2;
    public static final double INDEXER_CIM_BACKWARD_PERCENT_POWER = .2;
    public static final double PIVOT_COLLECTOR_DOWN_PERC = 0.2;
    public static final double PIVOT_COLLECTOR_UP_PERC = 0.6;
    public static final double PIVOT_COLLECTOR_UP_HOLD = 0.3;
    public static final double PIVOT_COLLECTOR_DOWN_HOLD = 0.5;


}
