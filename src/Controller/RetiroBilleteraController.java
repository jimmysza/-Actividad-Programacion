package controller;
import javax.swing.JOptionPane;
import model.ClienteModel;
        
public class RetiroBilleteraController extends BilleteraController {
    private int retiro_dinero;
    
    public RetiroBilleteraController(ClienteModel cliente_model) {
        super(cliente_model);
    }

   

  
    @Override
    public int transaccion() {
        String input = JOptionPane.showInputDialog("Ingrese la cantidad a retirar:");
        int retiro = Integer.parseInt(input);

        if (retiro > cliente_model.getBilletera().getDinero()) {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente.");
        } else {
            cliente_model.getBilletera().setDinero(cliente_model.getBilletera().getDinero() - retiro);
            JOptionPane.showMessageDialog(null, "Retiro exitoso. Nuevo saldo: " + cliente_model.getBilletera().getDinero());
            
        }
        return 0;
        
    }
}

