//Ameer Ahmed

public class HowManyTrue {

    public static int countTrue(boolean[] arr) {

        int counter = 0;
        for (int i = 0; i < arr.length; i++) {

            //checks how many true there are
            if (arr[i] == true) {
                counter++;
            }
            //checks is the array is EMPTY
            if(arr.length == 0) {
                return 0;
            }
        }
        System.out.println("The total number of true values in the array are: " + counter);
        return counter;
    }

        public static void main (String[]args){
            countTrue(new boolean[]{true, false, false, true, false});
            countTrue(new boolean[]{});
            countTrue(new boolean[]{false, false, false, false, false});
            countTrue(new boolean[]{true, true, true, true, true});
        }
    }