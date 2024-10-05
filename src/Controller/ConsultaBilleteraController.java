


package controller;

import javax.swing.JOptionPane;
import model.ClienteModel;

public abstract class ConsultaBilleteraController extends BilleteraController {
    
   

    public ConsultaBilleteraController(ClienteModel cliente_model) {
        super(cliente_model);
    }

    
     @Override
    public int transaccion() {
        JOptionPane.showMessageDialog(null, "Saldo actual: " + cliente_model.getBilletera().getDinero());
        return 0;
    }
}