package R7t;

public class ComparacionValores {
    double NumeroA, NumeroB;
    
    public ComparacionValores(double a, double b) {
        this.NumeroA = a;
        this.NumeroB = b;
    }
    
    public String determinarRelacion() {
        if (NumeroA > NumeroB) {
            return "A es mayor que B";
        } else if (NumeroA < NumeroB) {
            return "A es menor que B";
        } else {
            return "A es igual a B";
        }
    }
}
