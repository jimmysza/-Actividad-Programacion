package Controller;

import javax.swing.JOptionPane;
import Model.ClienteModel;

public class ConsultaBilleteraController {

    private ClienteModel modelCliente;

    public ConsultaBilleteraController(ClienteModel modelCliente) {
        this.modelCliente = modelCliente;
    }

    // Método para consultar el saldo de la billetera del cliente
    public int consultarSaldo() {
        return modelCliente.getBilletera().getDinero();
    }

    // Método para realizar una transacción de dinero
    protected void realizarTransaccion() {
        int cantidadAEnviar = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuánto dinero desea enviar?"));
        int saldoActual = modelCliente.getBilletera().getDinero();

        if (cantidadAEnviar > saldoActual) {
            JOptionPane.showMessageDialog(null, "No tiene suficiente dinero para realizar esta transacción.");
        } else {
            // Actualizar el saldo restando el dinero enviado
            modelCliente.getBilletera().setDinero(saldoActual - cantidadAEnviar);
            JOptionPane.showMessageDialog(null, "Transacción realizada. Nuevo saldo: " + modelCliente.getBilletera().getDinero());
        }
    }
}
