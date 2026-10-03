import java.util.Scanner;
class Ejercicio6{
    public static void main(String[] argos){
        int score;

        System.out.print("Introduce the note: ");

        Scanner inputValue;
        inputValue = new Scanner(System.in);
        score = inputValue.nextInt();

        if (score <= 3){
            System.out.println("Muy Deficiente");
        } else if (score <= 5){
            System.out.println("Insuficiente");
        } else if (score <= 6) {
            System.out.println("Suficiente");
        } else if (score <= 7){
            System.out.println("Bien");
        } else if (score <= 9){
            System.out.println("Notable");
        } else if (score <= 10){
            System.out.println("Sobresaliente");
        } else {
            System.out.println("out the limint");
        }

    }
}