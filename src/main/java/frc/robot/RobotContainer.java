// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import java.sql.Driver;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Lift;
import frc.robot.subsystems.Pistons;
import frc.robot.subsystems.Shooter;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  
  private final Drivetrain m_drivetrainSubsystem = new Drivetrain();
  private final Intake m_intakeSubsystem = new Intake();
  private final Lift m_liftSubsystem = new Lift();
  private final Pistons m_pistonSubsystem = new Pistons();
  private final Shooter m_shooterSubsystem = new Shooter();
  

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    configureButtonBindings();
  }


  private void configureButtonBindings() {
    XboxController driver = new XboxController(1);

    new JoystickButton(driver, XboxController.Button.kX.value)
      .whenPressed(new InstantCommand(m_pistonSubsystem::toggleSolenoids)
      .andThen(new InstantCommand(m_intakeSubsystem::run)));
    
    new JoystickButton(driver, XboxController.Button.kY.value)
      .whenPressed(new InstantCommand(m_intakeSubsystem::stop)
      .andThen(new InstantCommand(m_pistonSubsystem::toggleSolenoids)));
      
   
    
      
    
  }

public Command getAutonomousCommand() {
    return null;
}

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
 
}
