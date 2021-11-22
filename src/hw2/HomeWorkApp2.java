package hw2;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println(twoNumberSumm(10, 10));
        System.out.println(twoNumberSumm(11, 11));
        System.out.println(twoNumberSumm(3, 8));
        System.out.println("---------------------");
        positeveNegative(0);
        positeveNegative(1);
        positeveNegative(-2);
        System.out.println("---------------------");
        System.out.println(isPositeve(-7));
        System.out.println(isPositeve(0));
        System.out.println(isPositeve(10));
        System.out.println("---------------------");
        stringNumber("Эта строка напечатается 1 раз", 1);
        stringNumber("Эта строка напечатается 3 раза", 3);
        stringNumber("Эта строка напечатается 5 раз", 5);
        System.out.println("---------------------");
        System.out.println(isLeapYear(0));
        System.out.println(isLeapYear(1996));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(3000));
    }

    public static boolean twoNumberSumm (int a, int b) {
        return a + b > 10 && a + b <= 20;
    }

    public static void positeveNegative (int a) {
        if(a >= 0) System.out.println("Положительное");
        else System.out.println("Отрицательне");
    }

    public static boolean isPositeve (int a) {
        return a >= 0 ? false : true;
    }

    public static void stringNumber (String a, int b) {
        for(int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    public static boolean isLeapYear (int a) {
        if (a % 400 == 0) return true;
        else if (a % 100 == 0) return false;
        else if (a % 4 == 0) return true;
        else return false;
    }
}

