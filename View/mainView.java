package View;

import javax.swing.JOptionPane;

import Controller.ClienteController;


public class mainView {

    ClienteController cliente_controller = new ClienteController();
    
    public static void main(String[] args) {

    }

    // privado estatico y retorne int
    private void mostrarMenuCliente() {
        int option = Integer.parseInt(JOptionPane.showInputDialog(null,"""
        BIENVENID@ A JWALLET
        1. ACCEDER
        2. CREAR CUENTA
        3. SALIR
        """));
        switch (option) {
            case 1:
            cliente_controller.accederCuenta();
                break;
            case 2:
                cliente_controller.crearCuenta();
                break;
            case 3:
                cliente_controller.existeCliente();
                break;
            default:
                throw new AssertionError();
        }
    }

    // privado estatico y retorne int
    private void mostrarBilletera() {
        int option = Integer.parseInt(JOptionPane.showInputDialog(null,"""
        BIENVENID@ A JWALLET MARTZDEV
        MENU DE OPCIONES
        1. CONSULTAR
        2. DEPOSITAR
        3. RETIRAR
        4. CERRAR CUENTA
        """));
        switch (option) {
            case 1:
            cliente_controller.accederCuenta();
                break;
            case 2:
                cliente_controller.crearCuenta();
                break;
            case 3:
                cliente_controller.existeCliente();
                break;
            default:
                throw new AssertionError();
        }
    }
}