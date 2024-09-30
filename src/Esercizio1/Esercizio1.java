package Esercizio1;

import java.util.Random;
import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {

        int[] numbers = new int[5];
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10) + 1; // valori tra 1 e 10
        }

        Scanner scanner = new Scanner(System.in);
        int userInput = -1;


        while (userInput != 0) {
            try {

                System.out.println("Array attuale: ");
                for (int num : numbers) {
                    System.out.print(num + " ");
                }
                System.out.println("Inserisci un numero (0 per uscire): ");
                userInput = scanner.nextInt();

                if (userInput == 0) {
                    System.out.println("Uscita dal programma.");
                    break;
                }

                System.out.println("Inserisci la posizione (tra 0 e 4) dove vuoi inserire il numero: ");
                int index = scanner.nextInt();


                if (index < 0 || index >= numbers.length) {
                    throw new ArrayIndexOutOfBoundsException("Posizione non valida! Deve essere tra 0 e 4.");
                }

                numbers[index] = userInput;

            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Errore: " + ex.getMessage());
            } catch (Exception ex) {
                System.out.println("Errore: " + ex.getMessage());
            }
        }

        scanner.close();
    }
}



