// CSC_151_DeAndre_Colston 
// Building my first Mammal Class

package labs.example.mammals;

public class Mammal {
    String hairColor = "Black";
    String eyeColor = "Blue";
    double bodyTemp = 98;

    public Mammal (String hair, String eye, double temp) {
    this.hairColor = hair;
    this.eyeColor = eye;
    this.bodyTemp = temp;
    }

public void getMammalDetails() {
    System.out.println("Mammal Hair Color:" + hairColor);
    System.out.println("Mammal Eye Color:" + eyeColor);
    System.out.println("Mammal Body Temp:" + bodyTemp);
}
public void run() {
    System.out.println("The mammal is running.");
}
public void eat() {
    System.out.println("The mammal is eating.");
}
public void sleep() {
    System.out.println("The mammal is sleeping.");
}
public void scratch() {
    System.out.println("The mammal is scratching.");
}
public void play() {
    System.out.println("The mammal is playing.");
}
public void protect() {
    System.out.println("The mammal is protecting.");
}
public void noise() {
    System.out.println("The mammal is making noise.");
}
public void dig() {
    System.out.println("The mammal is digging.");
}
public void smile() {
    System.out.println("The mammal is smiling.");
}
public void sit() {
    System.out.println("The mammal is sitting.");
   try {
    Thread.sleep(15000);
    } catch (Exception e) {
    System.out.println("The mammal is awake.");
   } 
   stand();
}
public void stand() {
    System.out.println("The mammal is now standing and barking.");
}
public int walk() {
    int south = 3;
    int east = 4;
    
    double distance = Math.sqrt(Math.pow(south, 2) + Math.pow(east, 2));
    double thetaRadians = Math.atan2(east, south);
    double thetaDegrees = Math.toDegrees(thetaRadians);    
    
    System.out.println("Angle at longest leg: " + thetaDegrees);
    return (int)distance;
}
}