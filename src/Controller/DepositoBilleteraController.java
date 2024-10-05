
package controller;

import javax.swing.JOptionPane;
import model.ClienteModel;


public class DepositoBilleteraController extends BilleteraController {
    private int deposito_dinero;
    
    public DepositoBilleteraController(ClienteModel cliente_model) {
        super(cliente_model);
    }

   @Override
    public int transaccion() {
        String input = JOptionPane.showInputDialog("Ingrese la cantidad a depositar:");
        int deposito = Integer.parseInt(input);
        cliente_model.getBilletera().setDinero(cliente_model.getBilletera().getDinero() + deposito);
        JOptionPane.showMessageDialog(null, "Depósito exitoso. Nuevo saldo: " + cliente_model.getBilletera().getDinero());
        return 0;
    }
}
  


