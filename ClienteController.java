
package Controller;

import Model.ClienteModel;
import javax.swing.JOptionPane;

public class ClienteController {
    ClienteModel modelCliente = new ClienteModel();
    
    public void menuCliente() {
        int option = Integer.parseInt(JOptionPane.showInputDialog(null,"""
        BIENVENID@ A JWALLET
        1. ACCEDER
        2. CREAR CUENTA
        3. SALIR                                              
                                                      """));
        switch (option) {
            case 1:
                accederCuenta();
                break;
            case 2:
                crearCuenta();
                break;
            case 3:
                existeCliente();
                break;
            default:
                throw new AssertionError();
        }
    }
    
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
        modelCliente.setBilletera(contraseña);
    }

    public boolean existeCliente(){
        if (modelCliente.getNombre_usuario() != "" && modelCliente.getContraseña() != "") {
            return true;
        } else {
            return false;
        }
    }
    
}
