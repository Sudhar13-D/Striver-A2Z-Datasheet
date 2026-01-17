package Basics;

import java.util.Scanner;

public class BasicRecursion {
    public static void main(String[] args) {
        System.out.println("Basic Recursions");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Numbers from 1 to " + n + ": ");
        print(n);


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
}
