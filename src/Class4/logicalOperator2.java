package Class4;

public class logicalOperator2 {
    public static void main(String[] args) {
        System.out.println(true&&true);
        System.out.println(true&&false);
        System.out.println(false&&false);


        /*if the score in all the subjects are greater than 90 print brilliant student
        otherwise print you need to work hard
                */
        double mathScore=92.5;
        double historyScore=91.5;
        double scienceScore=93.5;

        if(mathScore >=92.5 && historyScore>=91.5 && scienceScore>=93.5 ){
            System.out.println("You are a brilliant student");

        }else {
            System.out.println("you need to work harder");

            /*
            Below is to compare if else to run the same code it will look like this.
             */
        }


    if(mathScore<92 || historyScore>=91){
        System.out.println("history score is highest");

    }if(scienceScore<=93){
            System.out.println("The highest number is scienceScore");
        }











    }}
