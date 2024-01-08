public class solveHanoi {
    public static void solveHanoi(int n, char source, char destination, char auxiliary) {
        if (n == 1) {
            // Move the top disk from source to destination
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        // Move n-1 disks from source to auxiliary peg using destination as auxiliary
        solveHanoi(n - 1, source, auxiliary, destination);

        // Move the nth disk from source to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        // Move the n-1 disks from auxiliary to destination peg using source as auxiliary
        solveHanoi(n - 1, auxiliary, destination, source);
    }
}
