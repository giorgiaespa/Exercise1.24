import java.util.Arrays;

public class Exercise24 {
    public static void main(String args[]) {
       fill(10);
    };
    public static void fill(int arrayLength){
        int sum = 0;
        int [] numbers = new int [arrayLength];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
            sum += numbers[i];
            System.out.print(numbers[i] + " ");
        }
        System.out.print("\nSum = " + sum);
    }

};
