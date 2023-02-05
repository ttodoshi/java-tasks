package recursion;

public class Lesson3Task0 {
    public static void main(String[] args) {
        int[] arr = createBigArray();
        long startTime = System.currentTimeMillis();
        System.out.println(binarySearch(arr, 7573846) + " за " + (System.currentTimeMillis() - startTime));
        startTime = System.currentTimeMillis();
        System.out.println(bruteForceSearch(arr, 100000000) + " за " + (System.currentTimeMillis() - startTime));
    }
    public static int[] createBigArray(){
        int [] array = new int[100000001];
        for (int i = 0; i < 100000001; i++){
            array[i] = i;
        }
        return array;
    }
    public static int bruteForceSearch(int[] array, int value){
        for (int i = 0; i < array.length; i++){
            if (array[i] == value){
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int[] array, int value){
        int first = 0;
        int last = array.length - 1;
        while (first <= last){
            int mid = (first+last) / 2;
            int guess = array[mid];
            if (guess == value){
                return mid;
            } else if (guess > value) {
                last = mid - 1;
            }
            else {
                first = mid + 1;
            }
        }
        return -1;
    }
}
