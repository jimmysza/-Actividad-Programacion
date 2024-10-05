
package Controller;

import Model.ClienteModel;


public abstract class BilleteraController {

    protected ClienteModel cliente_model = new ClienteModel();
    
    private ConsultaBilleteraController[] consulta;

    public BilleteraController(){
        this.consulta = new consulta[2];
    }

    public abstract int BilleteraController(ClienteModel cliente_model);
    
    
}
