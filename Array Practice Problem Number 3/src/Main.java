public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        int random = 0;

        for(int i = 0; i < array.length; i++) {
            random =(int)(Math.random() * 100) + 1;
            array[i] = random;
        }
        System.out.println("Array[5]: " + array[5]);
        System.out.println("Array[3]: " + array[3]);

        int swap = array[3];

        array[3] = array[5];
        array[5] = swap;
        System.out.println("Swapped Array[5]: " + array[5]);
        System.out.println("Swapped Array[3]: " + array[3]);
    }
}