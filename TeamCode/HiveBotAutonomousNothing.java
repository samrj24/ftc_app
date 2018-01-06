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

Lead - Mike Dennis
Git and Design Mentor - Valid Polygon
The Favorite Child That is very much liked way more than the evile Logan - Griffin Sober
(Programming Mentor - Aaron Elie "The Butt")
Professional Breaker Mentor - Dan Denver
*/
package org.firstinspires.ftc.teamcode.auto;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.supp.HardwareHiveBot;

/**
 * This OpMode uses the common Pushbot hardware class to defined the devices on the robot.
 * All device access is managed through the HardwarePushbot class.
 * The code is structured as a LinearOpMode
 * <p>
 * This particular OpMode executes a POV Game style Teleop for a PushBot
 * It raises and lowers the claw using the Gampad Y and A buttons respectively. * In this mode the left stick moves the robot FWD and back, the Right stick turns left and right.
 * <p>
 * It also opens and closes the claws slowly using the left and right Bumper buttons.
 * <p>
 * Use Android Studios to Copy this Class, and Paste it into your team's code folder with a new name.
 * Remove or comment out the @Disabled line to add this opmode to the Driver Station OpMode list
 * Griffin had nothing to do with this code. if it breaks, it's not his fault
 */

@Autonomous(name = "Nothing Autonomous", group = "Pushbot")
//@Disabled // Remove if you want to disable this for some obscure reason
public class HiveBotAutonomousNothing extends LinearOpMode {

    /* Declare OpMode members. */
    HardwareHiveBot robot = new HardwareHiveBot();

    int tickCount = 0;
    int tickStraight1 = 22;
    int tickTurn = 9;
    int tickStraight2 = 5;

    @Override
    public void runOpMode() throws InterruptedException {
        robot.init(hardwareMap);

        telemetry.addData("Status", "Initialized Nothing Autonomous");
        telemetry.update();

        waitForStart();

        while (opModeIsActive()) {
            tickCount++;
            Thread.sleep(100);

            if (tickCount == tickStraight1) {
                telemetry.addData("Status", "Turning off");
                telemetry.update();
            }


            if (tickCount < tickStraight1) {
                robot.leftMotor.setPower(1.0);
                robot.rightMotor.setPower(1.0);
            } else if (tickCount >= tickStraight1 && tickCount < tickStraight1 + tickTurn) {
                robot.leftMotor.setPower(-0.85);
                robot.rightMotor.setPower(0.75);
            } else if (tickCount >= tickStraight1 + tickTurn && tickCount < tickStraight1 + tickTurn + tickStraight2) {
                robot.leftMotor.setPower(1.0);
                robot.rightMotor.setPower(1.0);
            } else {
                robot.leftMotor.setPower(0.0);
                robot.rightMotor.setPower(0.0);
            }


        }
    }
}