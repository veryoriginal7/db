// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import com.kauailabs.navx.frc.AHRS;

public class ExampleSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  public ExampleSubsystem() {}

private CANSparkMax left1 = new CANSparkMax(1, null);
private CANSparkMax left2 = new CANSparkMax(2, null);
private CANSparkMax left3 = new CANSparkMax(3, null);
private CANSparkMax right1 = new CANSparkMax(1, null);
private CANSparkMax right2 = new CANSparkMax(2, null);
private CANSparkMax right3 = new CANSparkMax(3, null);
private MotorControllerGroup m_LeftGroup= new MotorControllerGroup(left1,left2,left3);
private MotorControllerGroup m_RightGroup= new MotorControllerGroup(right1,right2,right3);
private AHRS zAngle = new AHRS();
m_LeftGroup=m_LeftGroup.setInverted();

  @Override
  public void periodic() {
   zAngle.getAngle();
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
  public void up(){
    m_LeftGroup.set(.8);
    m_RightGroup.set(.8);
      }
  public void down(){
m_LeftGroup.set(-.8);
m_RightGroup.set(-.8);
  }
public void left(){
    m_LeftGroup.set(-.8);
    m_RightGroup.set(.8);
      }
public void right(){
        m_LeftGroup.set(.8);
        m_RightGroup.set(-.8);
          }
          public void stop(){
            m_LeftGroup.stopMotor();
            m_RightGroup.stopMotor();
              }

  }

