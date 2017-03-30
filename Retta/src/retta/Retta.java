package retta;

public class Retta {

    public double a;
    public double b;
    public double c;
    public double x;
    public double y;
    public double ris = 0;

    public Retta(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.x = x;
        this.y = y;
    }

    public String getTipo() {
        if (a == 0) {
            return "Orizzontale";
        } else if (b == 0) {
            return "Verticale";
        } else if ((a != 0) && (b != 0)) {
            return "Obliqua";
        }
        return null;
    }

    public boolean appartiene(double x, double y) {
        this.x = x;
        this.y = y;
        ris = ((a * x) + (b * x) + c);
        if (ris == 0) {
            return true;
        } else {
            return false;
        }
    }

    public String stampa() {
        String r = "";
        if (this.a != 0) {
            r += this.a + "x";
        }
        if (this.b != 0) {
            if (this.b > 0) {
                r += "+";
            }
            r += this.b + "y";
        }
        if (this.c != 0) {
            if (this.c > 0) {
                r += "+";
            }
            r += this.c;
        }
        r += "=0";
        return r;
    }
}
