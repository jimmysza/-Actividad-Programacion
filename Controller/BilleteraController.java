package Controller;

import Model.ClienteModel;

public abstract class BilleteraController {
    protected ClienteModel cliente_model;

    public BilleteraController(ClienteModel cliente_model) {
        this.cliente_model = cliente_model;
    }

    protected abstract void transaccion();
}

