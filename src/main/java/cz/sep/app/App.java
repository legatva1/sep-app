package cz.sep.app;

/**
 * Hello world!
 *
 */
public class App 
{


    public int plus(int a, int b) {
        return a+b;
    }

    public int minus(int a, int b) {
        return a-b;
    }

    public int multiply(int a, int b) {
        return a*b;
    }

    public void nullInt() {
        Integer i=null;

        if (i != null) {
            System.out.println(i);
        }

        i.intValue();

    }




    public static void main(String[] args) {



    }
}
