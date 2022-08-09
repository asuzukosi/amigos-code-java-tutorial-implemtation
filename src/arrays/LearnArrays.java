package arrays;
import java.util.Arrays;

/*
 * Arrays are used to create variables that hold
 * more than one value
 */
public class LearnArrays {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[2] = 3;
        String[] names = {"Khalid", "Mariam", "Maha"};
        
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(names));
        System.out.println(names.length);
        System.out.println(names[2]);
    }
}
