/*
@author: DeAndre Colston
@date: 2/11/2026
@purpose: Week 5 Main Physics class
 */
package labs.example.physics;

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
        System.out.println("Distance: " + distance);
        System.out.println("Velocity: " + velocity);
        System.out.println("Momentum: " + momentum);
        System.out.println("Force: " + force);
        System.out.println("Work: " + work);
        System.out.println("Kinetic Energy: " + KineticEnergy);
        System.out.println("Potential Energy: " + PotentialEnergy);
    }
}
