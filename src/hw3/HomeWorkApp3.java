package hw3;

import java.util.Arrays;

public class HomeWorkApp3 {
    public static void main(String[] args) {
        // Задание 1
        int[] a = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(a));
        for(int i = 0; i < a.length; i++) {
            if(a[i] == 1) a[i] = 0;
            else a[i] = 1;
        }
        System.out.println(Arrays.toString(a));
        System.out.println("-----------------Задание 2-------------------");
        // Задание 2
        int[] b = new int[100];
        for(int i = 0; i < b.length; i++) {
            b[i] = i+1;
        }
        System.out.println(Arrays.toString(b));
        System.out.println("-----------------Задание 3-------------------");
        // Задание 3
        int[] c = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i < c.length; i++) {
            if(c[i] < 6) c[i] *= 2;
        }
        System.out.println(Arrays.toString(c));
        System.out.println("-----------------Задание 4-------------------");
        // Задание 4
        int[][] d = new int[9][9];
        for(int i = 0; i < d.length; i++) {
            d[i][i] = d[i][d.length-1-i] = 1;
        }
        for(int[] ints : d) {
            System.out.println(Arrays.toString(ints));
        }

        System.out.println("----------------Задание 5--------------------");
        // Задание 5
        System.out.println(Arrays.toString(returnArray(10,3)));
        System.out.println("-----------------Задание 6-------------------");
        // Задание 6
        int[] newArray = {4, 7, 33, 98, 23, 1, 0, 39, 95};
        Arrays.sort(newArray);
        int min = newArray[0];
        int max = newArray[newArray.length-1];
        System.out.println(Arrays.toString(newArray) + "\n" + "Min = " + min + "\n" + "Max = " + max);
        System.out.println("----------------Задание 7--------------------");


    }

    public static int[] returnArray(int len, int initialValue) {
        int[] e = new int[len];
        for(int i = 0; i < e.length; i++) {
            e[i] = initialValue;
        }
        return e;
    }

    public static boolean checkBalance(int[] array) {
        System.out.println();
        int leftSum = 0;
        int rightSum = sum(array, 0, array.length);

        if(rightSum % 2 !=0) {
            return false;
        }

        for (int i = 0; i < array.length; i++) {
            leftSum +=array[i];
            rightSum -= array[i];

            if(leftSum == rightSum) {
                return true;
            }
        }
        return false;
    }

    private static int sum(int[] array, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += array[i];
        }
        return sum;
    }
}
