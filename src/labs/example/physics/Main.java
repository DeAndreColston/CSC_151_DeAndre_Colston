package labs.example.physics;

public class Main {
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
}
}