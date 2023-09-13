import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Are you ready for a quiz? ");
        Scanner want = new Scanner(System.in);
        String what = want.nextLine();

        if(what.equals("Yes")) {

            int x = 0;

            System.out.println("Okay, here it comes!");

            System.out.println("Q1) What is the capital of Alaska?");
            System.out.println("        " + "1) Melbourne");
            System.out.println("        " + "2) Anchorage");
            System.out.println("        " + "3) Juneau");

            Scanner answer1 = new Scanner(System.in);
            int ans1 = Integer.parseInt(answer1.nextLine());

            if(ans1 == 3) {
                System.out.println("That's right!");
                x++;
            }
            else {
                System.out.println("Sorry, the answer was Juneau");
            }

            System.out.println("Q2) Can you store the value CAT in a variable of type int?");
            System.out.println("        " + "1) Yes");
            System.out.println("        " + "2) No");

            Scanner answer2 = new Scanner(System.in);
            int ans2 = Integer.parseInt(answer2.nextLine());

            if(ans2 == 2) {
                System.out.println("That's right!");
                x++;

            }
            else {
                System.out.println("Sorry, CAT is a string. ints can only store numbers.");
            }

            System.out.println("Q3) What is the result of 9+6/3?");
            System.out.println("        " + "1) 5");
            System.out.println("        " + "2) 11");
            System.out.println("        " + "3) 15/3");

            Scanner answer3 = new Scanner(System.in);
            int ans3 = Integer.parseInt(answer3.nextLine());

            if(ans3 == 2) {
                System.out.println("That's correct!");
                x++;
            }
            else {
                System.out.println("Sorry, 9+6/3 equals 11.");
            }

            System.out.println("Overall, you got " + x + " out of 3 correct.");
            System.out.println("Thanks for playing!");

        }
        else if(what.equals("No")) {
            System.out.println("Okay BYE");
        }


    }
}