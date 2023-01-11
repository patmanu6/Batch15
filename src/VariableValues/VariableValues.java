package VariableValues;

public class VariableValues {
    public static void main(String[] args) {
        //2. A Java program was created called variableValues.
        // Different types of primitive Data(int,byte, boolean etc.) were stored and updated.
        int num1=25000;
//num1 initial value was 25000, updated value is 0.
        num1=0;
        byte size=21;
        size=1;
//the byte variable(size) value was 21 updated/reassign value is now=1
        short num2=7000;
        num2=2;
        long num3=7000000;

        num3=3;
        double num4=7.15555;
        num4=0.3;

        float num5=2.11f;
        num5=num1+size+num2+num3*0;

        char clean='$';
        boolean crazy=false;
        System.out.println(num1);
        System.out.println(size);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(clean);
        System.out.println(crazy);

    }
}
