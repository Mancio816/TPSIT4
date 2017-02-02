package finestre01;

import java.util.Scanner;

public class Finestre01 {

    public static void main(String[] args) {
        int i, n, x = 0, y = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Inserire il numero delle finestre");
            n = input.nextInt();
        } while ((n < 0) || (n > 20));
        for (i = 0; i < n; i++) {
            Finestra00 f;
            f = new Finestra00();
            f.setVisible(true);
            x = x + 100;
            y = y + 100;
            f.setLocation(x, y);
            f.Testo.setText("Sono la finestra numero " + (i + 1));
        }
    }
}
