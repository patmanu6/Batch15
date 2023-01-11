package Class4;

import java.util.Scanner;

public class switchCaseDemo {
    public static void main(String[] args) {

        String name="pizza";

        switch (name){
            case "banna":
                System.out.println("That is a lie");
                break;
            case "apple":
                System.out.println("I dont like it");
                break;
            case "pizza":
                System.out.println("This what I ordered");
            default:
        }
int money=25;
        switch (money){
            case 10:
                System.out.println("yeah");
            case 15:
                System.out.println("No");
            case 22:
                System.out.println("that is not it");
            case 25:
                System.out.println("Yea i gave you " +money);

                Scanner sc=new Scanner(System.in);
                int age=5;
                int age2=8;
                int age3=10;
                String lastName="";
                System.out.println("Please enter your Last name");
                lastName=sc.next();
                System.out.println("Please enter three different ages");
                age=sc.nextInt();
                age2=sc.nextInt();
                age3=sc.nextInt();

                if (age>age2&&age>age3){
                    System.out.println("that age is the eldest");
                }
                   if (age2>age&&age2>age3) {
                       System.out.println("Then age2 is the eldest");
                   }if(age3>age&&age3>age2){
                System.out.println("The age 3 is the eldest");
            }
else {
                System.out.println("none of the above are true");
            }






        }
















    }}