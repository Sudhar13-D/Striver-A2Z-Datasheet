package Basics;
import java.util.Scanner;
public class BasicMaths {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dup = n;
        System.out.print(countDigits(n));
        System.out.println();
        int revNum = ReverseDigit(n);
        System.out.print(revNum);
        System.out.println();
        if (dup == revNum) {
            System.out.println("True");
        }
        else System.out.print("False");
        System.out.println();
        int AmstrongNo = AmstrongNumber(n);
        if (dup == AmstrongNo) {
            System.out.println("AmstrongNumber");
        }
        else System.out.print("Not an AmstrongNumber");

    }
    static int countDigits(int n){
        int count =0;
        while(n > 0){
            int digit = n % 10;
            count++;  
            n = n/10; //this is the place where main action comes it is division where log comes into play
             // Time complexity = O(log10(n))  --> log10 because n divides by 10 -> if n/5 then log5 
        }
        return count;
    }
    static int ReverseDigit(int n){
        int reversedone = 0;
        while(n > 0){
            int lastDigit = n % 10;
            reversedone = (reversedone * 10) + lastDigit;
            n = n/10;
        }
        return reversedone;
    }
    static int AmstrongNumber(int n){
        int AmstNum = 0;
        while(n > 0){
            int ld = n % 10;
            AmstNum = AmstNum+(ld*ld*ld);
            n = n/10;
        }
        return AmstNum;
    } 
}
