package Basics;
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
        p.patten13(n);
        p.patten14(n);
        System.out.println();
        p.patten15(n);
        p.patten16(n);
        p.patten17(n);
        p.patten18(n);
        p.patten19(n);
        p.patten20(n);
        p.patten21(n);
        p.patten22(n);
        
        
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
    public void patten13(int n){
        int k = 1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
            System.out.print(k+" ");
            k++;
            }
            System.out.println();
        }
    }
    public void patten14(int n){
        for(int i = 0;i<n;i++){
            for(char j = 'A';j<='A'+i;j++){
            System.out.print(j);

            }
            System.out.println();
        }
    }
    public void patten15(int n){
        for(int i = 0;i<n;i++){
            for(char j = 'A';j<='A'+(n-i-1);j++){
            System.out.print(j);

            }
            System.out.println();
        }
    }
    public void patten16(int n){
        for(int i = 0;i<n;i++){
            char ch = (char) ('A' + i);
            for(int j = 0;j<=i;j++){
            System.out.print(ch);
            }
            System.out.println();
        }
    }
    public void patten17(int n){
        for(int i =0;i<n;i++){
            for(int j =0;j<n-i-1;j++){
                System.out.print(" ");
            }
            char ch = 'A';
            int stop = (2*i+1)/2;
             for(int j =0;j<2*i+1;j++){
                System.out.print(ch);
                if(j<stop) ch++;
                else ch--;
             }
             for(int j =0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public void patten18(int n){
        for(int i =0;i<n;i++){
            for(char ch = (char)('E'- i);ch<='E';ch++){
                System.out.print(ch);
            }
            System.out.println();

        }
    }
    public void patten19(int n){
        int iniS = 0;
        for(int i =0;i<n;i++){
            for(int j =0;j<n-i;j++){
                System.out.print("*");
            }
            for(int j =0;j<iniS;j++){
                System.out.print(" ");
            }
            for(int j = 0;j<n-i;j++){
                System.out.print("*");
            }   
            System.out.println();
            iniS +=2;
        }
        int iniSp = 2*n -2;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<=i;j++){
                System.out.print("*");
            }
            for(int j = 0;j<iniSp;j++){
                System.out.print(" ");
            }
            for(int j = 0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            iniSp -= 2;
            
        }
    }
    public void patten20(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(i==0||i==n-1||j==0||j==n-1){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    public void patten21(int n){
        int space = 2;
        for(int i = 0;i<=2*n-1;i++){
            
            if(i > n){
            for(int j =0;j<2*n-i;j++){
                System.out.print("*");
            }
            for(int j =0;j<space;j++){
                System.out.print(" ");
            }
            for(int j = 0;j<2*n-i;j++){
                System.out.print("*");
            }
            System.out.println();
            space+=2;
            }
            else{
            for(int j =0;j<i;j++){
                System.out.print("*");
            }
            for(int j =0;j<2*n-(2*i);j++){
                System.out.print(" ");
            }
            for(int j = 0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        }
    }
    public void patten22(int n){
        for(int i =0;i<2*n-1;i++){
            for(int j = 0;j<2*n-1;j++){
            int top =i;
            int left = j;
            int right = (2*n -2) - j;
            int down = (2*n-2) - i;
            int min = Math.min(Math.min(top, down), Math.min(left, right));
            System.out.print(min);
            System.out.print((n - min)+" ");
        }
        System.out.println();
    }
}
}