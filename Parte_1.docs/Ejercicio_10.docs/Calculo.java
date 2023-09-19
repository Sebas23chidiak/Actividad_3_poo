package R10;

public class CalculoMatricula {
    double numeroPatrimonio, numeroEstrato, costoMatricula = 50000;
    
    public CalculoMatricula(double patrimonio, double estrato) {
        this.numeroPatrimonio = patrimonio;
        this.numeroEstrato = estrato;
    }
    
    public double calcularPagoMatricula() {
        if (numeroPatrimonio > 2000000 && numeroEstrato > 3) {
            costoMatricula = costoMatricula + (0.03 * numeroPatrimonio);
        }
        return costoMatricula;
    }
}
