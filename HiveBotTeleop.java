/*
PROGRAMMING TEAM:

Lead - Gus Gopher Lol
Programmer - Anthony Denver RAFFLED

BUILD TEAM:

Builder - Luc Krishna's moo
Builder - Logan Sober
Builder - Nicholas Miller

DESIGN TEAM:

Designer - Elijah Polygon
Assistant Designer - Luc Krishna's

MENTORS:




*/

package org.firstinspires.ftc.teamcode.tele;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DigitalChannel;

import org.firstinspires.ftc.teamcode.supp.HardwareHiveBot;

@TeleOp(name = "Normal Teleop", group = "Pushbot")
//@Disabled
public class HiveBotTeleop extends LinearOpMode {

    /* Declare OpMode members. */
    HardwareHiveBot robot = new HardwareHiveBot();

    @Override
    public void runOpMode() throws InterruptedException {
        DigitalChannel digitalTouch;
        /* Initialize the hardware variables.
         * The init() method of the hardware class does all the work here
         */
        robot.init(hardwareMap);
        telemetry.addData("Boot Seq.", "Init() Succeeded");
        telemetry.addData("Boot Seq.", "Update() Succeeded");
        telemetry.update();
        digitalTouch = hardwareMap.get(DigitalChannel.class, "sensor_digital");

        // set the digital channelƒ to input.
        digitalTouch.setMode(DigitalChannel.Mode.INPUT);
        // Wait for the game to start (driver presses PLAY)
        waitForStart();

        // run until the end of the match (driver presses STOP)
        while (opModeIsActive()) {
            //if (digitalTouch.getState() == true) {

  //              telemetry.addData("Digital Touch", "Is Not Pressed");

                telemetry.addData("gamepad1.left_stick_y", gamepad1.left_stick_y);
                telemetry.addData("gamepad1.right_stick_y", gamepad1.right_stick_y);
                telemetry.update();

                robot.leftMotor.setPower(gamepad1.left_stick_y);
                robot.rightMotor.setPower(gamepad1.right_stick_y);



                if (gamepad2.right_stick > 0) {
                    robot.armMotor1.setPower(-gamepad2.right_stick_y / 1.0);
                } else {
                    robot.armMotor1.setPower(-gamepad2.right_stick_y / 1.0);
                }

                robot.armMotor2.setPower(gamepad2.left_stick_y / 10.0);


                if (gamepad2.dpad_up) {
                    robot.shooterServo.setPosition(
                            robot.shooterServo.getPosition() + 3
                    );
                }

                if (gamepad2.dpad_down) {
                    robot.shooterServo.setPosition(
                            robot.shooterServo.getPosition() - 3
                            telemetry.addData("Motor Power", motorTest.getPower());

                    );
                }
*/


            //}
            //else {
            //    telemetry.addData("Digital Touch", "Is Pressed");
            //    robot.armMotor1.setPower(0.0);
            //    robot.armMotor2.setPower(0.0);
            //    telemetry.update();
            //}

            telemetry.addData("Status", "Right Drive Val: " + robot.rightMotor.getCurrentPosition());
            telemetry.addData("Status", "Left Drive Val: " + robot.leftMotor.getCurrentPosition());
            //telemetry.addData("Status", "Shoot Motor 1 Power: " + robot.shootMotor_1.getPower());
            //telemetry.addData("Status", "Shoot Motor 2 Power: " + robot.shootMotor_2.getPower());
            //telemetry.addData("Status", "Shooter Servo Val: " + robot.shooterServo.getPosition());
            //telemetry.addData("Status", "Shooter Servo Port: " + robot.shooterServo.getPortNumber());
            telemetry.update();

        }
    }
}

