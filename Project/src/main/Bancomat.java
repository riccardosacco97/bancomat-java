package main;

import java.util.Scanner;

public class Bancomat {
    // Variabili per saldo e PIN
    private static double saldo = 1000.00; // Saldo iniziale
    private static final int PIN_CORRETTO = 1234; // PIN predefinito
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Benvenuto e richiesta PIN
        System.out.println("Benvenuto nel Bancomat!");
        System.out.print("Inserisci il tuo PIN: ");
        int pinInserito = scanner.nextInt();

        // Verifica del PIN
        if (pinInserito != PIN_CORRETTO) {
            System.out.println("PIN errato! Accesso negato.");
            return; // Se il PIN è errato, il programma termina
        }

        // Menu principale
        while (true) {
            mostraMenu();
            int scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    visualizzaSaldo();
                    break;
                case 2:
                    prelevaDenaro();
                    break;
                case 3:
                    depositaDenaro();
                    break;
                case 4:
                    System.out.println("Arrivederci!");
                    return; // Esce dal programma
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }
        }
    }

    // Metodo per visualizzare il saldo
    public static void visualizzaSaldo() {
        System.out.println("Il tuo saldo attuale è: €" + saldo);
    }

    // Metodo per prelevare denaro
    public static void prelevaDenaro() {
        System.out.print("Inserisci l'importo da prelevare: €");
        double importo = scanner.nextDouble();

        if (importo > saldo) {
            System.out.println("Saldo insufficiente per questa operazione.");
        } else if (importo <= 0) {
            System.out.println("L'importo deve essere maggiore di zero.");
        } else {
            saldo -= importo;
            System.out.println("Hai prelevato: €" + importo);
            System.out.println("Il tuo saldo attuale è: €" + saldo);
        }
    }

    // Metodo per depositare denaro
    public static void depositaDenaro() {
        System.out.print("Inserisci l'importo da depositare: €");
        double importo = scanner.nextDouble();

        if (importo <= 0) {
            System.out.println("L'importo deve essere maggiore di zero.");
        } else {
            saldo += importo;
            System.out.println("Hai depositato: €" + importo);
            System.out.println("Il tuo saldo attuale è: €" + saldo);
        }
    }

    // Metodo per mostrare il menu
    public static void mostraMenu() {
        System.out.println("\nSeleziona un'operazione:");
        System.out.println("1. Visualizza saldo");
        System.out.println("2. Preleva denaro");
        System.out.println("3. Deposita denaro");
        System.out.println("4. Esci");
        System.out.print("Scegli un'opzione: ");
    }
}





