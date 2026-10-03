import java.util.Scanner;
class Ejercio1 {
    public static void main(String[] args) {
        int num;

        System.out.print("Introduce a number: ");

        Scanner inputValue;
        inputValue = new Scanner(System.in);
        num = inputValue.nextInt();

        if (num >= 0){
            System.out.println("The number is positive:");
        } else {
            System.out.println("The number is negative");
        }
    }

}