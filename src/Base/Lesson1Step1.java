package Base;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson1Step1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrLength = sc.nextInt();
        double[] array = new double[arrLength];
        for (int i = 0; i < arrLength; i++){
            array[i] = Math.random();
        }
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(double[] arr) {
        int length = arr.length;
        while (length != 0) {
            int maxIndex = 0;
            for (int i = 1; i < length; i++) {
                if (arr[i] < arr[i - 1]) {
                    double temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    maxIndex = i;
                }
            }
            length = maxIndex;
        }
    }
}
