package module6.homeOrk1and3;

import java.util.*;


public final class ArrayUtils {

    public static final void sum(int[]arr) {

        Random randomize = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 8 - randomize.nextInt(10);
            arr[4] = 21;
        }
        System.out.println(Arrays.toString(arr) + "\n");

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("The sum of int is " + sum);
    }

    public static final void min(int[]arr) {

        Random randomize = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 386 - randomize.nextInt(549);
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("\n" + "min int is: " + arr[0] + "\n");
    }

    public static final void max(int[]arr) {

        Random randomize = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 22 - randomize.nextInt(32);
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("\n" + "max int is: " + arr[9] + "\n");
    }

    public static final void maxPositive(int[]arr) {

        Random randomize = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 50 - randomize.nextInt(100);
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("\n" + "maxPositive int is " + arr[9] + "\n");
    }

    public static final void mult(int[] arr) {

        Random randomize = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 6 - randomize.nextInt(5);
        }

        int mult = 1;
        for (int i = 0; i < arr.length; i++) {
            mult *= arr[i];
        }
        System.out.println(mult);
    }

    public static final void modulus(int[]arr){
        int x = arr[0];
        int y = arr[9];
        int sum;

        sum = x%y;
        System.out.println("modulus of first and last elements is " + sum);
    }


    public static final void secondLargest(int[]arr) {

        Random randomize = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = randomize.nextInt(48);
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("\n" + "secondLargest int is: " + arr[8] + "\n");
    }

   public static int[] reverse(int[] array){

       int[]tempArr = new int[array.length];

       for(int i =0; i<array.length;i++){
           tempArr[i] = array[array.length -1 - i];
       }
       return tempArr;
   }


    public static int[] findEvenElements(int[] array){
        int[] fin = new int[0];

        for(int i =0; i<array.length; i++) {
            if(array[i]%2==0){
                int[]tempArr = new int[fin.length +1];
                System.arraycopy(fin,0,tempArr,0,fin.length);
                tempArr[tempArr.length-1] = array[i];
                fin = tempArr;
            }
        }
        return fin;
    }
}
