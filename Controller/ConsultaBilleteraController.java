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
        int cantidadAEnviar;

        int saldoActual = cliente_model.getBilletera().getDinero();

        if (cantidadAEnviar > saldoActual) {
            JOptionPane.showMessageDialog(null, "No tiene suficiente dinero para realizar esta transacción.");
        } else {
            cliente_model.getBilletera().setDinero(saldoActual - cantidadAEnviar);
            JOptionPane.showMessageDialog(null, "Transacción realizada. Nuevo saldo: " + cliente_model.getBilletera().getDinero());
        }
    }

}
