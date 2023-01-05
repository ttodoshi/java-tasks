package Base;

import java.util.Arrays;

public class Lesson1Step3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, -4, 8, 9, 6, 7, 7, 5, 4, 3, -1, -7};
        System.out.println(Arrays.toString(deleteValue(array, 3)));
    }
    public static int[] deleteValue(int[] arr, int value){
        int counter = 1;
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            if (arr[i] == value) {
                int temp = arr[arr.length - counter];
                arr[arr.length - counter] = arr[i];
                arr[i] = temp;
                counter++;
                length--;
            }
        }
        return Arrays.copyOfRange(arr, 0, length);
    }
}
