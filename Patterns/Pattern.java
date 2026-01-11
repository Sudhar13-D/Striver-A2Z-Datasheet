package Patterns;
class Pattern{
    public static void main(String [] args){
        Pattern p = new Pattern();
        p.patten1();
        p.patten2();
        p.patten3();
        p.patten4();
        p.patten5();
        p.patten6();
        p.patten7();
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
    public void patten7(){
        for(int i =0;i<5;i++){
            for(int j = 0;j<5-i-1;j++){
                System.out.print(" ");// for space
            }
            for(int j = 0;j<2*i+1;j++){
                System.out.print("*");//for star
            }
            for(int j = 0;j<5-i-1;j++){//for space
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}