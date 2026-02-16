/*
@author: DeAndre Colston
@date: 2/15/2026
@purpose: Week 5 CSC-151-Lab 
*/

package labs.example.physics;
import java.lang.Math;

public class Physics {
    
    final static double GRAVITY = 9.81;

    public static double getDistance(int velocity, int time) {
        double distance = velocity * time;
        return distance;
    }

    public static double getVelocity(int x, int t) {
        double velocity = x/t;
        return velocity;
    }
    
    public static double getMomentum(int mass, int velocity) {
        double momentum = mass * velocity;
        return momentum;
    }

    public static double getForce(int mass, int acceleration) {
        double force = mass * acceleration;
        return force;
    }

    public static double getWork(int force, int distance) {
        double work = force * distance;
        return work;
    }

    public static double getKineticEnergy(int mass, int velocity) {
        double KineticEnergy = 0.5 * mass * velocity * velocity;
        return KineticEnergy;
    }

    public static double getPotentialEnergy(int m, int g, int h) {
        double PotentialEnergy = m * g * h;
        return PotentialEnergy;
    }
    
    public static double getTheta(int xVal, int yVal) {
        double theta = Math.atan2(xVal,yVal) * 180/3.1415;
        return theta;
    }
}