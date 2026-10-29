public class SimpleExceptionDemo {

    public static void safeDivide(int numerator, int denominator) {

        try {

            int answer = numerator / denominator;
            System.out.println(answer);


        } catch (ArithmeticException e) {

            System.out.println("Can not divide by zero");

        } finally {

            System.out.println("Division Complete.");

        }


    }

    public static void main(String[] args) {


        safeDivide(20, 4);
        safeDivide(15, 0);
        safeDivide(-30, 5);




    }






}
