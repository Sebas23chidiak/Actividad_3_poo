package P_18;

public class VentanaPrincipal extends javax.swing.JFrame {
    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {
        double horas, retencion, tarifa, salarioNeto, salarioBruto;
        String codigo, nombre;
        codigo = String.valueOf(txtCodigoEmpleado.getText());
        nombre = String.valueOf(txtNombre.getText());
        horas = Double.parseDouble(txtHorasTrabajadas.getText());
        tarifa = Double.parseDouble(txtTarifaHora.getText());
        retencion = Double.parseDouble(txtRetencionFuente.getText());
        SalarioEmpleado empleado = new SalarioEmpleado(horas, tarifa, retencion);
        double salarioBrutoCalculado = empleado.calcularSalarioBruto();
        double salarioNetoCalculado = empleado.calcularSalarioNeto();
        txtCodigo.setText(String.valueOf(codigo));
        txtNombreDos.setText(nombre);
        txtSalarioBruto.setText(String.valueOf(salarioBrutoCalculado));
        txtSalarioNeto.setText(String.valueOf(salarioNetoCalculado));
    }

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {
        txtCodigoEmpleado.setText("");
        txtHorasTrabajadas.setText("");
        txtTarifaHora.setText("");
        txtRetencionFuente.setText("");
        txtRetencionFuente.setText("");
        txtCodigo.setText("");
        txtSalarioNeto.setText("");
        txtSalarioBruto.setText("");
        txtNombre.setText("");
        txtNombreDos.setText("");
    }

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    public VentanaPrincipal() {
        initComponents();
        txtCodigo.setEditable(false); // Campos no editables
        txtNombreDos.setEditable(false);
        txtSalarioBruto.setEditable(false);
        txtSalarioNeto.setEditable(false);
    }
}
