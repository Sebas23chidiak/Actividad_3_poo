package P19;

public class Ventana extends javax.swing.JFrame {
    public Ventana() {
        initComponents();
        txtArea.setEditable(false);
        txtPerimetro.setEditable(false);
    }

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {
        double longitud;
        longitud = Double.parseDouble(txtLongitud.getText());
        Operaciones operacion = new Operaciones(longitud);
        double area = operacion.calcularArea();
        double perimetro = operacion.calcularPerimetro();
        txtArea.setText(String.valueOf(area));
        txtPerimetro.setText(String.valueOf(perimetro));
    }

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {
        txtLongitud.setText("");
        txtArea.setText("");
        txtPerimetro.setText("");
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
