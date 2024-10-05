package Controller;

import Model.ClienteModel;

public class DepositoBilleteraController extends BilleteraController {

    private int deposito_dinero;

    private ClienteModel cliente_model;

    public DepositoBilleteraController(ClienteModel cliente_model) {
        super(cliente_model);
    }


    public void setDeposito_dinero(int deposito_dinero){
        this.deposito_dinero = deposito_dinero;
    }

    @Override
    protected int transaccion() {
        
    }
}
