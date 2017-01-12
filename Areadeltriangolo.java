/*
 Autore: Riccardo Mancini
 Classe: 4INB
 Data: 02/01/2017
 Testo: Assegnati due valori per base e altezza calcolare l'area del trinagolo
 */
package areadeltriangolo;

import java.util.Scanner;

public class Areadeltriangolo {

    public static void main(String[] args) {
        int base, altezza, lato1, lato2, perimetro;         //dichiarazione delle variabili per il calcolo e variabile contenente il perimetro
        float area;                                         //dichiarazione della variabile finale contenente il risultato del calcolo

        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Inserire la base: ");       //input base
            base = input.nextInt();
            System.out.println("Inserire l'altezza: ");     //input altezza
            altezza = input.nextInt();
            System.out.println("Inserire il secondo lato: ");//input secondo lato
            lato1 = input.nextInt();
            System.out.println("Inserire il terzo lato: ");//input terzo lato
            lato2 = input.nextInt();
            if ((base <= 0) || (altezza <= 0) || (lato1 <= 0) || (lato2 <= 0) || (base > lato1 + lato2) || (lato1 > base + lato2)
                    || (lato2 > base + lato1)) {
                System.out.println("\nI DATI INSERITI NON SONO VALIDI, PREGO REINSERIRLI\n");
            }
        } while ((base <= 0) || (altezza <= 0) || (lato1 <= 0) || (lato2 <= 0) || (base > lato1 + lato2) || (lato1 > base + lato2)
                || (lato2 > base + lato1));                   //controllo dell'input
        area = (base * altezza) / 2;                          //calcolo dell'area
        perimetro = base + lato1 + lato2;                     //calcolo del perimetro
        System.out.print("L'area del triangolo vale: ");      //output del valore ottenuto
        System.out.println(area);
        System.out.print("Il perimetro del triangolo vale: ");//output del valore ottenuto
        System.out.println(perimetro);
    }
}
