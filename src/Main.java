/**
 * Classe de exemplo para o exercicio de casting da DIO java.
 */

public class Main {
    public static void main(String[] args) {

        byte b1;
        short s1 = 100;
        b1 = (byte) s1; //Downcast

        long l1;
        int i1 = 10;
        l1 = i1; //Upcast

        int i2;
        long l2 = 100000000000000L;
        i2 = (int) l2;

        int i3;
        long l3 = 10000L;
        i3 = (int) l3;

        double d1;
        float f1 = 10.5f;
        d1 = f1;

        float f2;
        float f3;
        double d2 = 100000.58d;
        f2 = (float) d2;
        double d3 = 10000.588888888888888888888888888888888888888888888d;
        f3 = (float) d3;

        int i4;
        float f4 = 11.5697f;
        i4 = (int) f4;   //Trucar vai ignorar a parte fracionada

        System.out.println("b1: " + b1);
        System.out.println("l1: " + l1);
        System.out.println("i2: " + i2);
        System.out.println("i3: " + i3);
        System.out.println("d1: " + d1);
        System.out.println("f2: " + f2);
        System.out.println("f3: " + f3);
        System.out.println("i4: " + i4);

        b1 = (byte) d3;

        System.out.println("b1:" + b1);
    }
}
