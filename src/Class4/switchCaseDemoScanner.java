package Class4;

import java.util.Scanner;

public class switchCaseDemoScanner {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your gender");

    char gend=sc.next().charAt(0);

    if(gend=='f'){
        System.out.println("She is all set");

    }else {
        System.out.println("she is a male");
    }


    }

}
