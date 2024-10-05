package Controller;

import Model.ClienteModel;

public class RetiroBilleteraController extends BilleteraController {

    public  ClienteModel cliente_model;

    private int retiro_dinero;
    
    public RetiroBilleteraController(ClienteModel modelCliente) {
        super(modelCliente);
    }
    
    
    @Override
    public int transaccion() {

    }

    
    public void setRetiro_dinero(int retiro_dinero) {
        this.retiro_dinero = retiro_dinero;
    }

    
    public boolean validarTransaccionRetiro(int retiro_dinero) {
        
        return retiro_dinero;
    }
}
