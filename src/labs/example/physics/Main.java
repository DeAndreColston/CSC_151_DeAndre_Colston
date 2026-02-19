/*
@author: DeAndre Colston
@date: 2/16/2026
@purpose: Week 6 Main Physics class
 */

package labs.example.physics;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Physics physics = new Physics();
        
        double angleInDegrees = physics.getTheta(3,4);

        double speedOfLightInMPH = physics.getLightSpeedInMPH();
        double timeToEarth = physics.getTimeFromSunToEarthInHours();
        double distance = physics.getDistance(speedOfLightInMPH, timeToEarth);

        //part 1: week 6 lab invalid 3-4-5 triangle
        if (angleInDegrees > 37 || angleInDegrees < 36.87) {
            physics.logInvalidAngleInfo(angleInDegrees);
            System.out.println("logging the angle xy degrees. This is not a right angle.");
        } 
        else {//valid 3-4-5 triangle
            physics.logValidAngleInfo(angleInDegrees);
            System.out.println("logging the angle xy degrees. This is a valid 3-4-5 triangle.");
        }
        //part 2 week 6 lab calculating distance from sun to earth
        if (distance < 92947266.72) {
            physics.logEarthToSunInvalidDistance(distanceToEarthFromSun);
        } else {
            physics.logEarthToSunValidDistance(distanceToEarthFromSun);
        }

        DecimalFormat decimalFormat = new DecimalFormat("#,###.##");

        double distance = physics.getDistance(10, 2);
        double velocity = physics.getVelocity(6, 7);
        double momentum = physics.getMomentum(1, 2);
        double force = physics.getForce(5, 6);
        double work = physics.getWork(7, 8);
        double kineticEnergy = physics.getKineticEnergy(10, 11);
        double potentialEnergy = physics.getPotentialEnergy(12, 13, 14);
        
        //added variables and printing distance
        System.out.println("Distance: " + distance + "miles");
        System.out.println("Velocity: " + velocity + "mph");
        System.out.println("Momentum: " + momentum + "kg m/s");
        System.out.println("Force: " + force + "kg m/s * s");
        System.out.println("Work: " + work + "Joules");
        System.out.println("Kinetic Energy: " + kineticEnergy + "Joules");
        System.out.println("Potential Energy: " + potentialEnergy + "Joules");
    }
}
