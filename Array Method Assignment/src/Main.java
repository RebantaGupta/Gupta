public class Main {
    public static int[] array(int[] array) {
        int[] arr = new int[array.length - 1];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = array[i];
            System.out.println(arr[i]);
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array = new int[10];

        for(int i = 0; i < array.length; i++) {
            array[i] = i * 2;
        }
        array(array);


    }
}