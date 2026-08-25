package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import dev.nextftc.extensions.fateweaver.FateComponent;
import dev.nextftc.ftc.NextFTCOpMode;

public abstract class BaseOpMode extends NextFTCOpMode {
    {
        addComponents(
                getLogger()
        );
    }
    public BaseOpMode(){
        super();
    }
    public FateComponent getLogger(){
        return FateComponent.INSTANCE;
    }
}
