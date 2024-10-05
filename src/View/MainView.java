package View;

import Controller.ClienteController;
import Controller.ConsultaBilleteraController;
import Controller.DepositoBilleteraController;
import Controller.RetiroBilleteraController;
import Model.ClienteModel;
import javax.swing.JOptionPane;

public class MainView {

    private ClienteController clienteController;
    private ConsultaBilleteraController consultaBilleteraController;
    private DepositoBilleteraController depositoBilleteraController;
    private RetiroBilleteraController retiroBilleteraController;
    private ClienteModel modelCliente; 

    public MainView() {
        modelCliente = new ClienteModel(); // Inicializa modelCliente
        this.clienteController = new ClienteController();
        this.consultaBilleteraController = new ConsultaBilleteraController(modelCliente);
        this.depositoBilleteraController = new DepositoBilleteraController(modelCliente);
        this.retiroBilleteraController = new RetiroBilleteraController(modelCliente);
    }

    public static void main(String[] args) {
        MainView view = new MainView();
        view.mostrarMenuPrincipal();
    }

    private void mostrarMenuPrincipal() {
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
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        }
    }

    private int mostrarMenuCliente() {
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

    private void formularioCrearCuenta() {
        String nombre_usuario = JOptionPane.showInputDialog(null, "Crea un usuario");
        String contraseña = JOptionPane.showInputDialog(null, "Crea una Contraseña");

        modelCliente.setNombre_usuario(nombre_usuario); 
        modelCliente.setContraseña(contraseña);
    }

    private boolean formularioAccederCuenta() {
        String usuario = JOptionPane.showInputDialog(null, "Ingresa tu usuario");
        String contraseña = JOptionPane.showInputDialog(null, "Ingresa tu Contraseña");

        
        return usuario.equals(modelCliente.getNombre_usuario()) && contraseña.equals(modelCliente.getContraseña());
    }
}
