package Base;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson1Step0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrLength = sc.nextInt();
        double[] array = new double[arrLength];
        for (int i = 0; i < arrLength; i++){
            array[i] = Math.random();
        }
        System.out.println(Arrays.toString(array));
        double min = array[0];
        double max = array[0];
        double sum = 0;
        for (double i: array){
            if (i < min){
                min = i;
            }
            if (i > max){
                max = i;
            }
            sum += i;
        }
        System.out.println("min: " + min);
        System.out.println("max: " + max);
        System.out.println("avg: " + sum/arrLength);
    }
}