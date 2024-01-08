import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please ENTER the number of disks: ");

        Scanner nod = new Scanner(System.in);
        int numberOfDisks = Integer.parseInt(nod.next());

        solveHanoi(numberOfDisks, 'A', 'C', 'B');
    }

    public static void solveHanoi(int n, char source, char destination, char auxiliary) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        solveHanoi(n - 1, source, auxiliary, destination);

        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        solveHanoi(n - 1, auxiliary, destination, source);
    }
}
