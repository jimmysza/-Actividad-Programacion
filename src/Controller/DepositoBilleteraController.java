package Controller;

import javax.swing.JOptionPane;
import Model.ClienteModel;

public class DepositoBilleteraController extends BilleteraController {

    private int deposito_dinero;

    public DepositoBilleteraController(ClienteModel cliente_model) {
        super(cliente_model);
    }

    public void setDeposito_dinero(int deposito_dinero) {
        this.deposito_dinero = deposito_dinero;
    }

    @Override
    public void transaccion() {
        
        deposito_dinero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad a depositar:"));

        
        int saldoActual = cliente_model.getBilletera().getDinero();

        
        cliente_model.getBilletera().setDinero(saldoActual + deposito_dinero);

        
        JOptionPane.showMessageDialog(null, "El Dinero ha sido depositado. Nuevo saldo: " + cliente_model.getBilletera().getDinero());
    }
}
