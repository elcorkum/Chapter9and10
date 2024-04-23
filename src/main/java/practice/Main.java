package practice;

public class Main {
    public static void main(String[] args) {
        double num = Math.random();
        //Math.random() returns a double by default
        //when used on a different number type we have to cast the variable to a double
        int num2 = (int)(Math.random() * 5);
        System.out.println(num2);

        int x = Math.abs(-5);

        //Math.abs()
        //returns absolute value of the argument
        //given -20 it returns 20
        //this method is overloaded and works with all the other number types
        System.out.println(x);
        float f = Math.abs(-20.98f);
        System.out.println(f);


        //Math.round(0 returns an int when given a float arg
        //Returns a Long when given a double arg
        int a = Math.round(-2.87f);
        long b = Math.round(25.89);
        System.out.println(a);
        System.out.println(b);

        Integer m = 50;
        int n;

        n = m;
        System.out.println(n);
        System.out.println(m);
    }


}
