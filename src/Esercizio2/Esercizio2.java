package Esercizio2;

import java.util.Scanner;

public class Esercizio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Inserisci i chilometri percorsi: ");
            double kmPercorsi = scanner.nextDouble();


            System.out.println("Inserisci i litri di carburante consumati: ");
            double litriConsumati = scanner.nextDouble();


            if (litriConsumati == 0) {
                throw new ArithmeticException("Non puoi avere 0 litri consumati.");
            }


            double kmPerLitro = kmPercorsi / litriConsumati;
            System.out.println("Hai percorso " + kmPerLitro + " km per litro.");

        } catch (ArithmeticException ex) {
            System.out.println("Errore: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Errore: " + ex.getMessage());
        } finally {
            scanner.close();
        }
    }
}
