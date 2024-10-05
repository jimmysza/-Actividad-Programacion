
package Controller;

import javax.swing.JOptionPane;

import Model.ClienteModel;

public class ClienteController {
    ClienteModel modelCliente = new ClienteModel();
    
    
    
    public boolean accederCuenta(){
        String usuario = JOptionPane.showInputDialog(null,"Crea un usuario");
        String contraseña = JOptionPane.showInputDialog(null,"Crea un Contraseña");
        
        if (usuario.equals(modelCliente.getNombre_usuario()) || contraseña.equals(modelCliente.getContraseña())) {
            return true;
        } else {
            return false;
        }
    }
    
    public void crearCuenta(){
        String nombre_usuario = JOptionPane.showInputDialog(null,"Crea un usuario");
        String contraseña = JOptionPane.showInputDialog(null,"Crea un Contraseña");
        
        modelCliente.setNombre_usuario(nombre_usuario);
        modelCliente.setContraseña(contraseña);
    }

    public boolean existeCliente(){
        if (modelCliente.getNombre_usuario() != "" && modelCliente.getContraseña() != "") {
            return true;
        } else {
            return false;
        }
    }
    
}
