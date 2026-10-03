import java.util.Scanner;
class Ejercicio4 {
    public static void main(String[] argos){
        int num1, num2, num3;

        System.out.print("Introduce a first number: ");

        Scanner inputValue;
        inputValue = new Scanner(System.in);
        num1 = inputValue.nextInt();

        System.out.print("Introduce a second number: ");
        num2 = inputValue.nextInt();

        System.out.print("Introduce a second number: ");
        num3 = inputValue.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            if (num2 >= num3) {
                System.out.println(num1 + ", " + num2 + ", " + num3);
            } else {
                System.out.println(num1 + ", " + num3 + ", " + num2);
            }
        } else if (num2 >= num1 && num2 >= num3) {
            if (num1 >= num3) {
                System.out.println(num2 + ", " + num1 + ", " + num3);
            } else {
                System.out.println(num2 + ", " + num3 + ", " + num1);
            }
        } else {
            if (num1 >= num2) {
                System.out.println(num3 + ", " + num1 + ", " + num2);
            } else {
                System.out.println(num3 + ", " + num2 + ", " + num1);
            }
        }

        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers have the same value");
        }

        inputValue.close();
    }
}