
package controller;
import model.BilleteraModel;
import javax.swing.JOptionPane;
import model.ClienteModel;
public class ClienteController {
    
    public ClienteModel cliente_model;

    
    public void crearCuenta(String nombre_usuario, String contraseña) {
        BilleteraModel billetera = new BilleteraModel(0); 
        cliente_model = new ClienteModel(nombre_usuario, contraseña, billetera);
        JOptionPane.showMessageDialog(null, "Cuenta creada exitosamente.");
    }

    
    public boolean accederCuenta(String nombre_usuario, String contraseña) {
        if (cliente_model!= null && cliente_model.getNombre_usuario().equals(nombre_usuario) && cliente_model.getContraseña().equals(contraseña)) {
            JOptionPane.showMessageDialog(null, "Acceso concedido.");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Credenciales incorrectas.");
            return false;
        }
    }


    public ClienteModel getCliente() {
        return cliente_model;
    }
}


