package Basics;
import java.util.Scanner;
public class BasicMaths {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        System.out.print("Enter a,b for GCD:");
        int a = sc.nextInt();
        int b = sc.nextInt();
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
            System.out.print("AmstrongNumber");
        }
        else System.out.print("Not an AmstrongNumber");
         System.out.println();
        printAllDivisor(n);
        System.out.println();
        printPrimeNumbers(n);

        printGCD(a,b);
        sc.close();    
    }
    static int countDigits(int n){
        int count =0;
        while(n > 0){
            int digits = n % 10;
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
    static void printAllDivisor(int n){
        for(int i = 1;i <= n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
    static void printPrimeNumbers(int n){
        int count = 0;
        System.out.print("Prime Numbers ");
        for(int i = 1;i*i<n;i++){
            if(n%i == 0){
                count++;
                if((n/i) != i) count++;
            }
    } 
        if(count == 2) System.out.println("True");
        else System.out.println("False");
    }

    static void printGCD(int a,int b){
        while(a > 0 && b > 0){
            if(a > b) a = a % b;
            else b = b % a;
        }
            if(a == 0) System.out.print(b);
            else System.out.print(a);
        
    }
}
