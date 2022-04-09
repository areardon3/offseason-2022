package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Lift extends SubsystemBase {
  
  private final WPI_TalonSRX mLeft = new WPI_TalonSRX(Constants.kLeftLift); 
  private final WPI_TalonSRX mRight = new WPI_TalonSRX(Constants.kRightLift);

  public Lift() {}

  public void configMotors() {
    mLeft.configFactoryDefault();
    mRight.configFactoryDefault();

    mLeft.setNeutralMode(NeutralMode.Brake);
    mRight.setNeutralMode(NeutralMode.Brake);
  }

  public void runLift() {
    mLeft.set(Constants.kLiftSpeed);
    mRight.set(Constants.kLiftSpeed);
  }

  public void set(double percent) {
    mLeft.set(percent);
    mRight.set(percent);
  }

  public void stop() {
    mLeft.set(0);
    mRight.set(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
