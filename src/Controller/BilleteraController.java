
package controller;
import model.ClienteModel;

public abstract class BilleteraController {
    
    protected ClienteModel cliente_model;

    public BilleteraController(ClienteModel cliente) {
        this.cliente_model = cliente;
    }

    
    public abstract int transaccion();
    
}


