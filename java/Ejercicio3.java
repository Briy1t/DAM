import java.util.Scanner;
class Ejercicio3 {
    public static void main(String[] argos){
        int num1, num2;

        System.out.print("Introduce a first number: ");

        Scanner inputValue;
        inputValue = new Scanner(System.in);
        num1 = inputValue.nextInt();

        System.out.print("Introduce a second number: ");
        num2 = inputValue.nextInt();

        if ( num1 < num2 ) {
            System.out.println("Them major number is: ");
            System.out.println(num2);
        }else if (num1 > num2) {
            System.out.println("The major number is: ");
            System.out.println(num1);
        }else {
            System.out.println("the both numbers have the same value");
        }
    }
}