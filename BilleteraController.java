
package Controller;

import Model.BilleteraModel;
import Model.ClienteModel;


public abstract class BilleteraController {
     
    protected ClienteModel cliente_model = new ClienteModel();
    
    public abstract int BilleteraController(ClienteModel cliente_model);
    
    
}
