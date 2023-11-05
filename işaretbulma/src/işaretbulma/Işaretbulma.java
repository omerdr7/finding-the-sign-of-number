package işaretbulma;

import java.util.Scanner;

public class Işaretbulma {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("give the number which you want to learn sign");
        int a = input.nextInt();
        System.out.println(signum(a));
        
    }

    public static int signum(int a) {
        if (a<0) {
            System.out.println("it is a negative number="+a);
        }else if(a>0){
            System.out.println("it is a positive number="+"+"+a);
        }else{
            System.out.println("it is zero");
        }
        return a;
    }
}
