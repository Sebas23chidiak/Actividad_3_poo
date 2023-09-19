package geome_figuras;

public class InterfazPrincipal extends javax.swing.JFrame {
    public InterfazPrincipal() {
        initComponents();
    }

    private void circuloActionPerformed(java.awt.event.ActionEvent evt) {
        InterfazCirculo circulo = new InterfazCirculo();
        circulo.setVisible(true);
    }

    private void cuadradoActionPerformed(java.awt.event.ActionEvent evt) {
        InterfazCuadrado cuadrado = new InterfazCuadrado();
        cuadrado.setVisible(true);
    }

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }
}
