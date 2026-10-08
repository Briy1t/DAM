import java.util.Scanner;
class Ejercicio7{
    public static void main(String[] argos){
        int hour, minutes, seconds, sum;

        System.out.print("Introduce the hour: ");

        Scanner inputValues = new Scanner(System.in);
        hour = inputValues.nextInt();
        System.out.print("Introduce the minutes: ");
        minutes = inputValues.nextInt();
        System.out.print("Introduce the seconds: ");
        seconds = inputValues.nextInt();

        sum = seconds+1;

        if (sum == 60){ 
            minutes = minutes + 1;
            sum = 0;
        }
        if (minutes == 60){
            hour = hour + 1;
            minutes = 0;
        }

        if (hour >= 24){
            hour = 0;
        }
      
        System.out.println("The time is: " + hour + ":" + minutes + ":" + sum);
    }
}

