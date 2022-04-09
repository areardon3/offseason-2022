// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Drivetrain extends SubsystemBase {
 
  private final WPI_TalonFX mFrontLeft = new WPI_TalonFX(Constants.kFrontLeft);
  private final WPI_TalonFX mFrontRight = new WPI_TalonFX(Constants.kFrontRight);
  private final WPI_TalonFX mBackLeft = new WPI_TalonFX(Constants.kBackLeft);
  private final WPI_TalonFX mBackRight = new WPI_TalonFX(Constants.kBackRight);
  

  public Drivetrain() {}

  public void configureMotors() {
   
    mFrontRight.setInverted(true);
    mBackRight.setInverted(true);

    mBackRight.follow(mFrontRight);
    mBackLeft.follow(mBackLeft);

    mFrontRight.setNeutralMode(NeutralMode.Brake);
    mFrontLeft.setNeutralMode(NeutralMode.Brake);
    mBackRight.setNeutralMode(NeutralMode.Brake);
    mBackLeft.setNeutralMode(NeutralMode.Brake);

    mFrontRight.configFactoryDefault();
    mFrontLeft.configFactoryDefault();
    mBackRight.configFactoryDefault();
    mBackLeft.configFactoryDefault();

  }

  public void stop() {

    mFrontRight.set(0);
    mFrontLeft.set(0);

  }

  public void resetEncoders() {
    
  }
  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
