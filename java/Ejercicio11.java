import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        char [][] tablet = new char[8][8];
        char [][] view= new char[8][8];

        int shots =0;
        int sunkShips = 0;
        int total =0;
        int cor1,cor2;

        System.out.println("Game");

        for (int f=0; f<8; f++){
            for (int c=0; c<8; c++){
                tablet[f][c] = '|';
                System.out.print(view[f][c] + " | ");
            }
            System.out.println();
        }

        tablet[0][3] = 'X';
        tablet[0][7] = 'X';
        tablet[1][6] = 'X';
        tablet[2][5] = 'X';
        tablet[3][4] = 'X';
        tablet[4][7] = 'X';
        tablet[5][3] = 'X';
        tablet[5][5] = 'X';
        tablet[6][4] = 'X';
        tablet[7][2] = 'X';

        System.out.println("Introduce the first coordinate: ");

        Scanner inputValue;
        inputValue=new Scanner(System.in);
        cor1=inputValue.nextInt();

        System.out.println("Introduce the second coordinate: ");
        cor2= inputValue.nextInt();

    }
}
