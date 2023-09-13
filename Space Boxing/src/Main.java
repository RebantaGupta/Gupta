import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Please enter your current earth weight: ");
        Scanner pound = new Scanner(System.in);
        int weight = Integer.parseInt(pound.nextLine());

        System.out.println("I have information for the following planets: ");
        System.out.println("   " + "1. Venus   2. Mars    3. Jupiter");
        System.out.println("   " + "4. Saturn  5. Uranus  6. Neptune");

        System.out.println("Which planet are you visiting? ");
        Scanner planet = new Scanner(System.in);
        int num = Integer.parseInt(planet.nextLine());

        if(num == 1) {
            System.out.println("Your weight would be " + (weight * 0.78) + " pounds on that planet.");
        }
        else if(num == 2) {
            System.out.println("Your weight would be " + (weight * 0.39) + " pounds on that planet.");
        }
        else if(num == 3) {
            System.out.println("Your weight would be " + (weight * 2.65) + " pounds on that planet.");
        }
        else if(num == 4) {
            System.out.println("Your weight would be " + (weight * 1.17) + " pounds on that planet.");
        }
        else if(num == 5) {
            System.out.println("Your weight would be " + (weight * 1.05) + " pounds on that planet.");
        }
        else if(num == 6) {
            System.out.println("Your weight would be " + (weight * 1.23) + " pounds on that planet.");
        }
        else {
            System.out.println("Error, please enter a number between 1 and 6.");
        }

    }
}