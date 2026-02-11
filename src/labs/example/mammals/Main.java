package labs.example.mammals;



public class Main {
    public class Mammal {
        String hairColor;
        String eyeColor;
        double bodyTemp;
    
        String weighString;
        String heighString;
        String ageString;
        }
        public void sit() {
            System.out.println("The mammal is sitting.");
           try {
            Thread.sleep(15000);
            } catch (Exception e) {
            System.out.println("The mammal is awake.");
           } 
        }
        public void stand() {
            System.out.println("The mammal is now standing and barking.");
        
        }
        }

