package Controller;

import Model.ClienteModel;

import javax.swing.JOptionPane;

public class ConsultaBilleteraController extends BilleteraController {

    public ClienteModel cliente_model;


    //1
    public ConsultaBilleteraController(ClienteModel cliente_model) {
        this.cliente_model = cliente_model;
    }
    //2
    public void transaccion(){
        JOptionPane.showMessageDialog(null,"Tu dinero Actual es: " + cliente_model.getBilletera().getDinero());
    }

}
