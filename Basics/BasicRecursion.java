package Basics;

import java.util.Scanner;

public class BasicRecursion {
    public static void main(String[] args) {
        System.out.println("Basic Recursions");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Numbers from 1 to " + n + ": ");
        print(n);
        System.out.println("Print name for " + n + ": ");
        printName(1,n);
        System.out.println("Numbers from "+n+" to 1" + ": ");
        printNto1(1, n);
        System.out.println("Numbers from 1 to " + n + ": ");
        print1ToN(n, n);
        System.out.println("Using Parameterized way Print -> Sum of 1 to " + n + ": ");
        SumPara(n, 0);
        System.out.println("Using Functional way Print -> Sum of 1 to " + n + ": ");
        System.out.println(SumFun(n));
        System.out.println("Factorial of "+factorial(n));
        sc.close();
    }
    static int cnt = 1;
    static void print(int n){
        if(cnt == n+1){
        return;
        }
        System.out.println(cnt);
        cnt++;
        print(n);
    }
    static void printName(int i,int n){
        if(i>n){
        return;
        }
        System.out.println("Sudharsan");
        printName(i+1,n);
    }
    //backtracking
    static void print1ToN(int i,int n){
        if(i < 1){
        return;
        }
        print1ToN(i-1,n);
        System.out.println(i);
    }
    static void printNto1(int i,int n){
        if(i > n){
        return;
        }
        printNto1(i+1,n);
        System.out.println(i);
    }
    static void SumPara(int i,int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        SumPara(i-1,sum+i);
    }
    static int SumFun(int n){
        if(n == 0){
            return 0;
        }
        return n+SumFun(n-1);
    }
    static int factorial(int n){
         if(n == 0){
            return 1;
        }
        return n*factorial(n-1);
    }
    
}
