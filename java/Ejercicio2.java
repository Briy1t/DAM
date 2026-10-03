import java.util.Scanner;
class Ejercicio2 {
    public static void main(String[] argos){
        int num1, num2;

        System.out.print("Introduce the first number: ");

        Scanner inputValue;
        inputValue = new Scanner(System.in);
        num1 = inputValue.nextInt();

        System.out.print("Introduce the second number");
        num2 = inputValue.nextInt();

        if (num1 >num2){
            System.out.println(" ");
            System.out.println(num2);
            System.out.println(num1);
        } else if (num1 <num2){
            System.out.println(" ");
            System.out.println(num1);
            System.out.println(num2);
        }else {
            System.out.println("The numbers ares similar");
        }
    }
}