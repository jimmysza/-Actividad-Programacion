
package view;

import model.ClienteModel;
import controller.ClienteController;
import controller.ConsultaBilleteraController;
import controller.DepositoBilleteraController;
import controller.RetiroBilleteraController;
import javax.swing.JOptionPane;

public class MainView {
    private final ClienteController clienteController;
    private ConsultaBilleteraController consultaBilleteraController;
    private DepositoBilleteraController depositoBilleteraController;
    private RetiroBilleteraController retiroBilleteraController;

    public MainView() {
        clienteController = new ClienteController();
    }

    public void mainMenu() {
        while (true) {
            String[] opciones = {"Crear Cuenta","Acceder a Cuenta", "Salir"};
            int seleccion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Menú Principal",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones);

            switch (seleccion) {
                case 0:
                    crearCuenta();
                    break;
                case 1:
                    if (accederCuenta()) {
                        menuBilletera();
                    }
                    break;
                case 2:
                    System.exit(0);
            }
        }
    }

    public void crearCuenta() {
        String nombre_usuario = JOptionPane.showInputDialog("Ingrese su nombre de usuario:");
        String contraseña = JOptionPane.showInputDialog("Ingrese su contraseña:");
        clienteController.crearCuenta(nombre_usuario, contraseña);
    }

    public boolean accederCuenta() {
        String nombre_usuario = JOptionPane.showInputDialog("Ingrese su nombre de usuario:");
        String contraseña = JOptionPane.showInputDialog("Ingrese su contraseña:");
        return clienteController.accederCuenta(nombre_usuario, contraseña);
    }

    public void menuBilletera() {
        ClienteModel cliente = clienteController.getCliente();
        consultaBilleteraController = new ConsultaBilleteraController(cliente) {};
        depositoBilleteraController = new DepositoBilleteraController(cliente);
        retiroBilleteraController = new RetiroBilleteraController(cliente);

        while (true) {
            String[] opciones = {"Consultar saldo", "Depositar", "Retirar", "Salir"};
            int seleccion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Menú Billetera",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (seleccion) {
                case 0:
                    consultaBilleteraController.transaccion();
                    break;
                case 1:
                    depositoBilleteraController.transaccion();
                    break;
                case 2:
                    retiroBilleteraController.transaccion();
                    break;
                case 3:
                    return; 
            }
        }
    }
        public static void main(String[] args) {
        MainView mainView = new MainView();
        mainView.mainMenu();
    }
}

