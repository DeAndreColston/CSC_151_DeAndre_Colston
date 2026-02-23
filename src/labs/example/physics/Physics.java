/*
@author: DeAndre Colston
@date: 2/15/2026
@purpose: Week 5 CSC-151-Lab 
*/

package labs.example.physics;
import java.lang.Math;

public class Physics {
    
    final static double GRAVITY = 9.81;

    final static double LIGHT_SPEED_MPS = 186282.0;
    final static double SUN_EARTH_DISTANCE = 92947266.72;

    public static double getDistance(double velocity, double time) {
        double distance = velocity * time;
        return distance;
    }

    public static double getVelocity(double distance, double time) {
        double velocity = distance / time;
        return velocity;
    }
    
    public static double getMomentum(double mass, double velocity) {
        double momentum = mass * velocity;
        return momentum;
    }

    public static double getForce(double mass, double acceleration) {
        double force = mass * acceleration;
        return force;
    }

    public static double getWork(double force, double distance) {
        double work = force * distance;
        return work;
    }

    public static double getKineticEnergy(double mass, double velocity) {
        double kineticEnergy = 0.5 * mass * velocity * velocity;
        return kineticEnergy;
    }

    public static double getPotentialEnergy(double mass, double gravity, double height) {
        double potentialEnergy = mass * gravity * height;
        return potentialEnergy;
    }
    
    public static double getTheta(double xVal, double yVal) {
        double theta = Math.atan2(xVal,yVal) * 180/3.1415;
        return theta;
    }
    //part 2: adding lightspeed conversion from seconds to hours
    public static double getLightSpeedInMPH() {
    return LIGHT_SPEED_MPS * 3600;
    }

    public static double getTimeFromSunToEarthInHours() {
    return (SUN_EARTH_DISTANCE / LIGHT_SPEED_MPS) / 3600;
    }
    //part 2: logging valid and invalid degrees and distances
    public void logInvalidAngleInfo(double angle) {
    System.out.println("logging the angle " + angle + " degrees. This is not a right angle.");
    }

    public void logValidAngleInfo(double angle) {
    System.out.println("logging the angle " + angle + " degrees. This is a valid 3-4-5 triangle.");
    }

    public void logEarthToSunInvalidDistance(double dist) {
    System.out.println("Invalid Distance: " + dist);
    }

    public void logEarthToSunValidDistance(double dist) {
    System.out.println("Valid Distance: " + dist);
    }
}