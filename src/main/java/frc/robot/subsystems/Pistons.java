// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Pistons extends SubsystemBase {
  
  DoubleSolenoid mRightSolenoid = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 1, 2);
  DoubleSolenoid mLeftSolenoid = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 3,4);

  
  public Pistons() {
    configPnuematics();
  }

  public void configPnuematics() {
    mRightSolenoid.set(Value.kForward);
    mLeftSolenoid.set(Value.kForward);
  } 

  public void toggleSolenoids() {
    mRightSolenoid.toggle();
    mLeftSolenoid.toggle();
  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
