package com.company;
import java.util.*;
public class Task001 {
    public static void func1() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter min:");
        System.out.println(in.nextInt() * 60 + " Sec");
    }
    public static void func2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 ochkovii:");
        int n = in.nextInt();
        System.out.println("Enter 3 ochkovii:");
        int m = in.nextInt();
        System.out.println(n * 2 + m * 3 + " Ochkov vsego");
    }
    public static void func3() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter kol-vo pobed:");
        int pob = in.nextInt();
        System.out.println("Enter kol-vo nichih:");
        int nich = in.nextInt();
        System.out.println("Enter kol-vo porajenii (ne ponyatno zachem):");
        int por = in.nextInt();
        System.out.println(pob * 3 + nich + por * 0 + " Footballnih ochkov vsego");
    }
    public static void func4() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        if (in.nextInt() % 5 == 0) System.out.println(true); else System.out.println(false);
    }
    public static void func5() {
        Scanner in = new Scanner(System.in);
        System.out.println("True or false?");
        boolean a = in.nextBoolean();
        System.out.println("True or false?");
        boolean b = in.nextBoolean();
        System.out.println("And together its: " + (a && b));
    }
    public static void func6() {
        Scanner in = new Scanner(System.in);
        System.out.println("Dlina potom shirina:");
        int dlin = in.nextInt();
        int shir = in.nextInt();
        System.out.println("Kol-vo zapasa kraski v kvadr metrah:");
        int n = in.nextInt();
        System.out.println((n / (dlin * shir)) + " Sten pokrasheno");
    }
    public static int squaed(int a) { // вместо b подствил a
        return a*a;
    }
    public static void func8() {
        Scanner in = new Scanner(System.in);
        System.out.println("Prob:");
        float prob = in.nextFloat();
        System.out.println("Prize:");
        float prize = in.nextFloat();
        System.out.println("Pay:");
        float pay = in.nextFloat();
        System.out.println(prob * prize > pay ? true : false);
    }
    public static void func9() {
        Scanner in = new Scanner(System.in);
        System.out.println("FPS:");
        int fps = in.nextInt();
        System.out.println("Min:");
        int min = in.nextInt();
        System.out.println("Frames: " + fps * min * 60);
    }
    public static void func10() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        double n = in.nextDouble();
        System.out.println("Enter the number:");
        int m = in.nextInt();
        System.out.println("Ostatok: " + (int)((n / m - (int)(n / m)) * m) );
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of func (1-10): "); // выбор нужной функции чтобы не запускать сразу все
        int i = in.nextInt();
        if (i == 1) func1();
        if (i == 2) func2();
        if (i == 3) func3();
        if (i == 4) func4();
        if (i == 5) func5();
        if (i == 6) func6();
        if (i == 7) System.out.println(squaed(in.nextInt()));
        if (i == 8) func8();
        if (i == 9) func9();
        if (i == 10) func10();
    }
}
