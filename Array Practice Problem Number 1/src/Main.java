public class Main {
    public static void main(String[] args) {
        int random = 0;
        int[] array = new int[20];
        int count = 0;

        for(int i = 0; i < array.length; i++) {
            random = (int)(Math.random() * 6) + 1;
            array[i] = random;
            System.out.println(array[i]);

            if(random == 1) {
                count++;
            }
        }
        System.out.println("Number of times 1 was generated: " + count);
    }
}