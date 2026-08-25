package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.hardware.gobilda.GoBildaPinpointDriver;
import com.qualcomm.robotcore.hardware.DcMotorImplEx;

import org.firstinspires.ftc.teamcode.Constants;

import dev.nextftc.core.subsystems.Subsystem;
import dev.nextftc.hardware.impl.MotorEx;

public class Drivebase implements Subsystem {

    private MotorEx FR;
    private MotorEx FL;
    private MotorEx BR;
    private MotorEx BL;
    private GoBildaPinpointDriver odo;

    public Drivebase(){
        FR = new MotorEx(Constants.FR);
        FL = new MotorEx(Constants.FL);
        BR = new MotorEx(Constants.BR);
        BL = new MotorEx(Constants.BL);
        

    }





}
