package P23;

public class Ventana extends javax.swing.JFrame {
    public Ventana() {
        initComponents();
        txtResultado.setEditable(false);
    }

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {
        double a = Double.parseDouble(txtA.getText());
        double b = Double.parseDouble(txtB.getText());
        double c = Double.parseDouble(txtC.getText());
        CalculoEcuacion ecuacion = new CalculoEcuacion(a, b, c);
        String resultado = ecuacion.calcularSolucionEcuacion();
        txtResultado.setText(resultado);
    }

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {
        txtA.setText("");
        txtB.setText("");
        txtC.setText("");
        txtResultado.setText("");
    }

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }
}
