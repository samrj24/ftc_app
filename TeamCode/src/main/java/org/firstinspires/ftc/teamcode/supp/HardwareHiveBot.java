/*

Motors:

leftMotor = (self explanitory)
rightMotor = ""
 */


package org.firstinspires.ftc.teamcode.supp;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

/**
 * This is NOT an opmode.
 * <p>
 * This class can be used to define all the specific hardware for a single robot.
 * In this case that robot is a Pushbot.
 * See PushbotTeleopTank_Iterative and others classes starting with "Pushbot" for usage examples.
 * <p>
 * This hardware class assumes the following device names have been configured on the robot:
 * Note:  All names are lower case and some have single spaces between words.
 */
public class HardwareHiveBot {
    /* Public OpMode members. */

    public DcMotor leftMotor = null;
    public DcMotor rightMotor = null;
    public DcMotor armMotor1 = null;
    public DcMotor armMotor2 = null;





    // Drives
    public DcMotor leftMotor = null;
    public DcMotor rightMotor = null;

    //Shooter
    public Servo shooterServo = null;
    public DcMotor shootMotor_1 = null;
    public DcMotor shootMotor_2 = null;
    public Servo gripperServo_1 = null;

    public DcMotor forkliftMotor = null;
    */

    /* local OpMode members. */
    HardwareMap hwMap = null;
    private ElapsedTime period = new ElapsedTime();

    /* Constructor */
    public HardwareHiveBot() {

    }

    /* Initialize standard Hardware interfaces */
    public void init(HardwareMap ahwMap) {
        // Save reference to Hardware map
        hwMap = ahwMap;


        // Define and Initialize Motor
        // Drives
        leftMotor = hwMap.dcMotor.get("left_drive"); //Name
        rightMotor = hwMap.dcMotor.get("right_drive"); //Name
        armMotor1 = hwMap.dcMotor.get("arm_motor_1");//Name
        armMotor2 = hwMap.dcMotor.get("arm_motor_2");// Name

         // Shooter
        shooterServo = hwMap.servo.get("shooter_servo"); //Name
        shootMotor_1 = hwMap.dcMotor.get("shootMotor1"); //Name
        shootMotor_2 = hwMap.dcMotor.get("shootMotor2"); //Name*/
      // forkliftMotor = hwMap.dcMotor.get("forkliftMotor");

        /*
        leftMotor.setDirection(DcMotor.Direction.FORWARD); // Set to REVERSE if using AndyMark motors
        rightMotor.setDirection(DcMotor.Direction.REVERSE);// Set to FORWARD if using AndyMark motors

        // Set all motors to zero power
        leftMotor.setPower(0);
        rightMotor.setPower(0);

        // Set all motors to run without encoders.
        // May want to use RUN_USING_ENCODERS if encoders are installed.
        leftMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        shootMotor_1.setMaxSpeed(4000);
        shootMotor_2.setMaxSpeed(4000);*/
    }

    /***
     * waitForTick implements a periodic delay. However, this acts like a metronome with a regular
     * periodic tick.  This is used to compensate for varying processing times for each cycle.
     * The function looks at the elapsed cycle time, and sleeps for the remaining time interval.
     *
     * @param periodMs Length of wait cycle in mSec.
     * @throws InterruptedException
     */
    public void waitForTick(long periodMs) throws InterruptedException {

        long remaining = periodMs - (long) period.milliseconds();

        // sleep for the remaining portion of the regular cycle period.
        if (remaining > 0)
            Thread.sleep(remaining);

        // Reset the cycle clock for the next pass.
        period.reset();
    }
}

