package geome_figuras;

public class InterfazRectangulo extends javax.swing.JFrame {
    public InterfazRectangulo() {
        initComponents();
        txtArea.setEditable(false);
        txtPerimetro.setEditable(false);
    }

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {
        double area, perimetro;
        double base = Double.parseDouble(txtBase.getText());
        double altura = Double.parseDouble(txtAltura.getText());
        Rectangulo rectangulo = new Rectangulo(base, altura);
        area = rectangulo.calcularArea();
        perimetro = rectangulo.calcularPerimetro();
        txtArea.setText(String.valueOf(area));
        txtPerimetro.setText(String.valueOf(perimetro));
    }

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {
        txtBase.setText("");
        txtAltura.setText("");
        txtArea.setText("");
        txtPerimetro.setText("");
    }

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }
}
