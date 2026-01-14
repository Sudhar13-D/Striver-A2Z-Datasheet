package Basics;
import java.util.Scanner;
public class BasicMaths {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(countDigits(n));
    }
    static int countDigits(int n){
        int count =0;
        while(n > 0){
            int digit = n % 10;
            count++;
            n = n/10;
        }
        return count;
    }
}
