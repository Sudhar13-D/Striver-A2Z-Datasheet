package Patterns;
import java.util.Scanner;
class Pattern{
    public static void main(String [] args){
        Pattern p = new Pattern();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        p.patten1();
        p.patten2();
        p.patten3();
        p.patten4();
        p.patten5();
        p.patten6();
        p.patten7(n);
        System.out.println();
        p.patten8(n);
        System.out.println();
        p.patten9(n);
        p.patten10(n);
        p.patten11(n);
        p.patten12(n);
        sc.close();
    }
    public void patten1(){
        for(int i =0;i<5;i++){
            for(int j = 0;j<5;j++){
                System.out.print("*"+"");
            }
            System.out.println();
        }
    }
    public void patten2(){
        for(int i =0;i<5;i++){
            for(int j = 0;j<=i;j++){
                System.out.print("*"+"");
            }
            System.out.println();
        }
    }
    public void patten3(){
        for(int i =1;i<5;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(j+"");
            }
            System.out.println();
        }
    }
    public void patten4(){
        for(int i =1;i<5;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(i+"");
            }
            System.out.println();
        }
    }
    public void patten5(){
        for(int i =1;i<5;i++){
            for(int j = 5;j>i;j--){
                System.out.print("*"+"");
            }
            System.out.println();
        }
    }
    public void patten6(){
        for(int i =5;i>0;i--){
            for(int j = 1;j<i;j++){
                System.out.print(j+"");
            }
            System.out.println();
        }
    }
    public void patten7(int n){
        for(int i =0;i<n;i++){
            for(int j = 0;j<n-i-1;j++){
                System.out.print(" ");// for space
            }
            for(int j = 0;j<2*i+1;j++){
                System.out.print("*");//for star
            }
            for(int j = 0;j<n-i-1;j++){//for space
                System.out.print(" ");
            }

            System.out.println();
        }
    }
    public void patten8(int n){
        for(int i =0;i<n;i++){
            for(int j = 0;j<i;j++){
                System.out.print(" ");// for space
            }
            for(int j = 0;j<2*n-(2*i + 1);j++){
                System.out.print("*");//for star
            }
            for(int j = 0;j<i;j++){//for space
                System.out.print(" ");
            }

            System.out.println();
        }
    }
    public void patten9(int n){
        patten7(n);
        patten8(n);
    }
    public void patten10(int n){
        for(int i = 0;i<=2*n-1;i++){
            int stars = i;
            if(i>n) stars = 2*n-i;
            for(int j = 0;j<stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void patten11(int n){
        int start = 1;
        for(int i =0;i<n;i++){
            if(i%2 == 0) start = 1;
            else start = 0;
            for(int j = 0;j<=i;j++){
                System.out.print(start);
                start = 1-start;
            }
            System.out.println();
        }
    }
    public void patten12(int n){
        for(int i=1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print(j);
            }
            for(int j = 1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j = i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        } 
    }
        
}