package View;

import java.nio.file.ClosedFileSystemException;

import javax.swing.JOptionPane;

import Controller.ClienteController;
import Controller.ConsultaBilleteraController;
import Controller.DepositoBilleteraController;
import Controller.RetiroBilleteraController;
import Model.ClienteModel;

public class mainView {

    private ClienteController clienteController = new ClienteController();
    private ConsultaBilleteraController consultaBilleteraController;
    private DepositoBilleteraController depositoBilleteraController;
    private RetiroBilleteraController retiroBilleteraController;

    private boolean control_menu_billetera;
    private boolean control_menu_cliente;

    
    public mainView() {
        ClienteModel cliente = new ClienteModel(); 
        this.consultaBilleteraController = new ConsultaBilleteraController(cliente);
        this.depositoBilleteraController = new DepositoBilleteraController(cliente);
        this.retiroBilleteraController = new RetiroBilleteraController(cliente);
    }

    public static void main(String[] args) {
        mostrarMenuPrincipal();
    }

    
    private static void mostrarMenuPrincipal() {
        while (true) {
            int option = mostrarMenuCliente();
            switch (option) {
                case 1:
                    if (formularioAccederCuenta()) {
                        mostrarMenuBilletera();
                    } else {
                        JOptionPane.showMessageDialog(null, "Acceso fallido. Verifica tus credenciales.");
                    }
                    break;
                case 2:
                    formularioCrearCuenta();
                case 3:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        }
    }

    
    private static int mostrarMenuCliente() {
        return Integer.parseInt(JOptionPane.showInputDialog(null, """
            BIENVENID@ A JWALLET
            1. ACCEDER
            2. CREAR CUENTA
            3. SALIR
            """));
    }


    private void mostrarMenuBilletera() {

        while (true) {
            
            int option = Integer.parseInt(JOptionPane.showInputDialog(null, """
                BIENVENID@ A JWALLET MARTZDEV
            MENU DE OPCIONES
            1. CONSULTAR SALDO
            2. DEPOSITAR DINERO
            3. RETIRAR DINERO
            4. CERRAR SESIÓN
            """));
            switch (option) {
                case 1:
                    consultaBilleteraController.transaccion();
                    break;
                case 2:
                    depositoBilleteraController.transaccion();
                    break;
                case 3:
                    int cantidadRetirar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad a retirar:"));
                    retiroBilleteraController.validarTransaccionRetiro(cantidadRetirar);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Cerrando sesión");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
                }
        }
    }

    private static boolean formularioCrearCuenta(){
        
        String nombre_usuario = JOptionPane.showInputDialog(null,"Crea un usuario");
        String contraseña = JOptionPane.showInputDialog(null,"Crea un Contraseña");
        
        modelCliente.setNombre_usuario(nombre_usuario);
        modelCliente.setContraseña(contraseña);
    }

    private static void formularioAccederCuenta(){
        String usuario = JOptionPane.showInputDialog(null,"Crea un usuario");
        String contraseña = JOptionPane.showInputDialog(null,"Crea un Contraseña");
        
        if (usuario.equals(modelCliente.getNombre_usuario()) || contraseña.equals(modelCliente.getContraseña())) {
            return true;
        } else {
            return false;
        }
    }
}
