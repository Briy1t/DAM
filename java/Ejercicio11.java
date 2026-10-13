import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        char[][] tablet = new char[8][8];
        boolean gameOver = false;
        boolean debug = false;
        int shipsRemaining = 10;

        System.out.println("---- Battleship Game ----");

        for (int f=0; f<8; f++){
            for (int c=0; c<8; c++){
                tablet[f][c] = '|';
            }
            
        }

        addShips(tablet);

        while (!gameOver) {
            printMatrx(tablet, debug);

            int row = getRow(inputValue);
            int col = getCol(inputValue);

            if (row < 0 || row >= 8 || col < 0 || col >= 8) {
                System.out.println("¡Coordenadas fuera de rango! Inténtalo de nuevo.");
                continue;
            }

            if (tablet[row][col] == 'x') {
                            System.out.println("¡Tocado! Has dado a un barco.");
                            tablet[row][col] = 'H'; 
                            shipsRemaining--;
                            if (shipsRemaining == 0) {
                                printMatrx(tablet, true);
                                System.out.println("¡Felicidades! Has hundido todos los barcos. ¡Has ganado!");
                                gameOver = true;
                            }
                        } else if (tablet[row][col] == '|') {
                            System.out.println("¡Agua! Has fallado.");
                            tablet[row][col] = 'O'; 
                        } else {
                            System.out.println("Ya habías disparado en esta posición. Prueba otra.");
                        }
                    }
                    inputValue.close();
                }

                static void addShips(char[][] table) {
                    int numShips = 0;
                    while (numShips < 10) {
                        int row = (int) (Math.random() * table.length);
                        int col = (int) (Math.random() * table[0].length);
                        if (table[row][col] != 'x') {
                            table[row][col] = 'x';
                            numShips++;
                        }
                    }
                }

                static void printMatrx(char[][] tabla, boolean debug )  {
                    System.out.print("  ");
                    for (int i = 1; i <= 8; i++) {
                        System.out.print(i + " ");
                    }
                    System.out.println();

                    for (int row = 0; row < tabla.length; row++) {
                        System.out.print((char) (65 + row) + " ");
                        for (int col = 0; col < tabla[0].length; col++) {
                            char current = tabla[row][col];
                            if (!debug && current == 'x') {
                                System.out.print("| ");
                            } else {
                                System.out.print(current + " ");
                            }
                        }
                        System.out.println();
                    }
                }

                static int getRow(Scanner input) {
                    System.out.println("Introduce una letra para la fila (A-H): ");
                    char letter = Character.toUpperCase(input.next().charAt(0));
                    int row = letter - 65; 
                    return row;
                }

                static int getCol(Scanner input) {
                    System.out.println("Introduce un número para la columna (1-8): ");
                    int col = input.nextInt() - 1; 
                    return col;
    }
}
