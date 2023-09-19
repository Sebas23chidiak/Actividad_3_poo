package R7t;

public class Ventana extends javax.swing.JFrame {
    public Ventana() {
        initComponents();
        txtResultado.setEditable(false);
    }

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {
        double NumeroA, NumeroB;
        NumeroA = Double.parseDouble(txtNumeroA.getText());
        NumeroB = Double.parseDouble(txtNumeroB.getText());
        ComparacionValores comparacion = new ComparacionValores(NumeroA, NumeroB);
        String resultado = comparacion.determinarRelacion();
        txtResultado.setText(resultado);
    }

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {
        txtNumeroA.setText("");
        txtNumeroB.setText("");
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
