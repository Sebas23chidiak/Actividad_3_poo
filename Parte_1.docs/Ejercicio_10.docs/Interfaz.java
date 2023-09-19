package R10;

public class Ventana extends javax.swing.JFrame {
    public Ventana() {
        initComponents();
        txtNumInscripcion.setEditable(false);
        txtNombres.setEditable(false);
        txtPagoMatricula.setEditable(false);
    }

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {
        String numInscripcion = String.valueOf(txtNumInscripcion1.getText());
        String nombres = String.valueOf(txtNombres.getText());
        double patrimonio = Double.parseDouble(txtPatrimonio.getText());
        double estrato = Double.parseDouble(txtEstrato.getText());
        CalculoMatricula matricula = new CalculoMatricula(patrimonio, estrato);
        double pagoMatricula = matricula.calcularPagoMatricula();
        txtNumInscripcion.setText(numInscripcion);
        txtNombres.setText(nombres);
        txtPagoMatricula.setText(String.valueOf(pagoMatricula));
    }

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {
        txtNumInscripcion1.setText("");
        txtNombres.setText("");
        txtPatrimonio.setText("");
        txtEstrato.setText("");
        txtNumInscripcion.setText("");
        txtNombres.setText("");
        txtPagoMatricula.setText("");
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
