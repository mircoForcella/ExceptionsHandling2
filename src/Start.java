import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("Write the dividend");
            int dividend = input.nextInt();
            System.out.println("Write the divisor");
            int divisor = input.nextInt();
            try {
                if (divisor == 0) {
                    throw new ArithmeticException("The Divisor can't be 0");
                } else {
                    System.out.println("The result is:  " + dividend / divisor);
                }
            }catch (ArithmeticException e){
                System.out.println("Try Again");
            }
        }
    }
}
