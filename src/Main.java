import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100) + 100;
        }
        return arr;
    }
    public static void task1() {
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i]++;
            }
        }
        System.out.println(Arrays.toString(arr));
        int[] arr1 = new int[5];
        arr1[0] = arr[2];
        arr1[1] = arr[3];
        arr1[2] = arr[4];
        arr1[3] = arr[5];
        arr1[4] = arr[6];
        System.out.println(Arrays.toString(arr1));
    }
}