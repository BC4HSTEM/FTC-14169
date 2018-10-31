public class HelloWorld{

    public static int getEncoderClicks (double distance) {

     int encoderClicks = 2440;
     double wheelDiam = 10.0;
     double wheelCircum = Math.PI * wheelDiam;
     double clicksPerCm = encoderClicks / wheelCircum;
     int outputClicks = (int)Math.floor(clicksPerCm * distance);

     return outputClicks;

    }

    public void driveStraight(double distance){
        leftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        leftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        rightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        leftMotor.setTargetPosition(getEncoderClicks(10.2));
        leftMotor.setPower(.75);
        rightMotor.setTargetPosition(getEncoderClicks(10.2));
        rightMotor.setPower(.75);

        telemetry.AddData(...);

    }

    public void driveReverse(double distance){
        leftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        leftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        rightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        leftMotor.setTargetPosition(getEncoderClicks(10.2));
        leftMotor.setPower(.75);
        rightMotor.setTargetPosition(getEncoderClicks(10.2));
        rightMotor.setPower(.75);

        telemetry.AddData(...);

    }

    public void turnLeft(double degrees){
        leftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        leftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        rightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        //Use degrees to evaluate how much power and what direction to give your
        //your motor. You will need extra code for this, and some math. Convert 
        //this to encoder clicks
        leftMotor.setTargetPosition(getEncoderClicks(10.2));
        leftMotor.setPower(0);
        rightMotor.setTargetPosition(getEncoderClicks(10.2));
        rightMotor.setPower(.75);

        telemetry.AddData(...);

    }

     public static void main(String []args){
        // Instantiate your class
         HelloWorld hello;
         hello = new HelloWorld();
         //Drice straight 10.2cm from the starting position
         hello.driveStraight(10.2);
         //Make a 48 degree turn to the Left
         hello.turnLeft(48.0)
         //Drive straight another 5.5cm.
         hello.driveStraight(5.5);
         //Back up 3.3cm.
         hello.driveReverse(3.3);
     }
}