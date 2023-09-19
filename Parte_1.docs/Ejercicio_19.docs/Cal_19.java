package P19;

public class Operaciones {
    double longitud;
    
    public Operaciones(double longitud) {
        this.longitud = longitud;
    }
    
    public double calcularArea() {
        Pitagoras pitagoras = new Pitagoras(longitud);
        double altura = pitagoras.calcularUltimoLado();
        double area = longitud * altura;
        return area;
    }
    
    public double calcularPerimetro() {
        double perimetro = longitud * 3;
        return perimetro;
    }
}
