package base;

public class Lesson1Task2 {
    public static void main(String[] args) {
        int start = 2;
        while (start < 101) {
            boolean isPrime = true;
            for (int i = 2; i < start; i++) {
                if (start % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(start);
            }
            start++;
        }
    }
}
