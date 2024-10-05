
package model;


public class ClienteModel {
    private String nombre_usuario;
    private String contraseña;
    private BilleteraModel billetera;

    public ClienteModel() {
    }

    public ClienteModel(String nombre_usuario, String contraseña, BilleteraModel billetera) {
        this.nombre_usuario = nombre_usuario;
        this.contraseña = contraseña;
        this.billetera = billetera;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public BilleteraModel getBilletera() {
        return billetera;
    }

    public void setBilletera(BilleteraModel billetera) {
        this.billetera = billetera;
    }

    @Override
    public String toString() {
        return "ClienteModel{" + "nombre_usuario=" + nombre_usuario + ", contrase\u00f1a=" + contraseña + ", billetera=" + billetera.getDinero() + '}';
    }

    
    }

  
    

