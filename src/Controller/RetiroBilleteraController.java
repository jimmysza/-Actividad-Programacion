package Controller;

import javax.swing.JOptionPane;

import Model.ClienteModel;

public class RetiroBilleteraController extends BilleteraController {

    private int retiro_dinero;
    
    public RetiroBilleteraController(ClienteModel cliente_model) {
        super(cliente_model);
    }
    
    @Override
    public void transaccion() {
        int retiro_dinero = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuanto Dinero deseas Retirar: "));

        int saldoActual = cliente_model.getBilletera().getDinero();

        if (retiro_dinero > saldoActual) {
            JOptionPane.showMessageDialog(null, "No tiene suficiente dinero para realizar esta transacción.");
        } else {
            cliente_model.getBilletera().setDinero(saldoActual - retiro_dinero);

            JOptionPane.showMessageDialog(null, "Retiro realizado. Nuevo saldo: " + cliente_model.getBilletera().getDinero());
        }
    }

    
    public void setRetiro_dinero(int retiro_dinero) {
        this.retiro_dinero = retiro_dinero;
    }

    
    public boolean validarTransaccionRetiro(int retiro_dinero) {
        
        return true;
    }
}
