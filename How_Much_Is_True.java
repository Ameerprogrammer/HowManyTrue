import java.util.Arrays;
import java.util.Objects;

public class HowMuchIsTrue {

    public static int countTrue(boolean[] arr) {
        if(arr.length  == 0) {
            return 0;
        }

        int counter = 0;
        for(int i = 0; i < arr.length; i++) {
            if(Objects.equals(arr[i], true)) {
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        boolean[] boolArray = {true, false, true, true, true};
        System.out.println("Boolean array is: " + Arrays.toString(boolArray));
        int trueCount = countTrue(boolArray);
        System.out.println("Number of true values: " + trueCount);

        boolean[] boolArray2 = {};
        int trueCount2 = countTrue(boolArray2);
        System.out.println("Boolean array is: " + Arrays.toString(boolArray2));
        System.out.println("Number of true values: " + trueCount2);

        boolean[] boolArray3 = {false, false, false, false, false};
        int trueCount3 = countTrue(boolArray3);
        System.out.println("Boolean array is: " + Arrays.toString(boolArray3));
        System.out.println("Number of true values: " + trueCount3);

    }
}