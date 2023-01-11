package Class4;

public class logicalOperator3 {
    public static void main(String[] args) {

        /*
        1 2 3 4 5 6 7 8 9 10 15
         */
        System.out.println(!true);
        System.out.println(!false);

        boolean rich=!false;
        System.out.println(!rich);

        int numb=8;

        if (numb>8){
            System.out.println("you are a thief");
        }else {
            System.out.println("am sorry");

        }if(numb==7){
            System.out.println("the you lied");
        }else {
            System.out.println("you are right");

        }if(numb==8){
            System.out.println("you made it");
        }else {
            System.out.println("I dont believe in you");
        }

    }
}
