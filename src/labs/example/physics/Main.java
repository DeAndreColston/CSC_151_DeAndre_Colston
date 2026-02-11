/*
@author: DeAndre Colston
@date: 2/11/2026
@purpose: Week 5 Main Physics class
 */
package labs.example.physics;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        Physics physics = new Physics();

        double distance = physics.getDistance(3, 4);
        double velocity = physics.getVelocity(6, 7);
        double momentum = physics.getMomentum(1, 2);
        double force = physics.getForce(5, 6);
        double work = physics.getWork(7, 8);
        double KineticEnergy = physics.getKineticEnergy(10, 11);
        double PotentialEnergy = physics.getPotentialEnergy(12, 13, 14);
    }
}
