// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Intake extends SubsystemBase {
  
  private final WPI_TalonSRX mMotor = new WPI_TalonSRX(Constants.kIntake);
  
  public Intake() {}

  public void run() {
    mMotor.set(Constants.kIntakeSpeed);
  }

  @Override 
  public void periodic() {
   
  }
}
