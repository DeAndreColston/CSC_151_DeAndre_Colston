/*
@author: DeAndre Colston
@date: 2/11/2026
@purpose: Week 5 CSC-151-Lab 
*/

package labs.example.physics;
import java.lang.Math;

public class Physics {
    
    final static double GRAVITY = 9.81;

    public double getDistance(double v, double t) {
        double x = v * t;
        return x;
    }

    public static double getVelocity(double x, double t) {
        double v = x/t;
        return v;
    }
    
    public static double getMomentum(double m, double v) {
        double p = m * v;
        return p;
    }

    public static double getForce(double m, double a) {
        double f = m * a;
        return f;
    }

    public static double getWork(double f, double d) {
        double w = f * d;
        return w;
    }

    public static double getKineticEnergy(double m, double v) {
        double ke = 0.5 * m * v* v;
        return ke;
    }

    public static double getPotentialEnergy(double m, double g, double h) {
        double pe = m * g * h;
        return pe;
    }
}