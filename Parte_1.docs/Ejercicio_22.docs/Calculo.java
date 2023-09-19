package P22;

public class CalculoNomina {
    double horasTrabajadas, valorHora, salario;
    String nombre;

    public CalculoNomina(double horas, double valor, String nombre) {
        this.horasTrabajadas = horas;
        this.valorHora = valor;
        this.nombre = nombre;
    }

    public String calcularNomina() {
        String salto = System.getProperty("line.separator");
        salario = horasTrabajadas * valorHora;
        if (salario < 450000) {
            return nombre;
        } else {
            return nombre + salto + String.valueOf(salario);
        }
    }
}
