package Controller;

import Model.ClienteModel;
import javax.swing.JOptionPane;

public class ConsultaBilleteraController extends BilleteraController {

    private final ClienteModel cliente_model;

    // Constructor
    public ConsultaBilleteraController(ClienteModel cliente_model) {
        super(cliente_model);
        this.cliente_model = cliente_model;
    }

    
    @Override
    public void transaccion() {
        JOptionPane.showMessageDialog(null, "Tu dinero actual es: " + cliente_model.getBilletera().getDinero());
    }
}
