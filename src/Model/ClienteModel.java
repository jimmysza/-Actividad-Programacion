package Model;

public class ClienteModel {
    private String nombre_usuario;
    private String contraseña;
    private BilleteraModel billetera;

    // Constructor vacío
    public ClienteModel() {
        this.billetera = new BilleteraModel();
    }

    // Constructor con parámetros
    public ClienteModel(String nombre_usuario, String contraseña, int dinero) {
        this.nombre_usuario = nombre_usuario;
        this.contraseña = contraseña;
        this.billetera = new BilleteraModel(dinero);
    }

    // Getters y Setters
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
        return "ClienteModel{" + "nombre_usuario=" + nombre_usuario + ", contraseña=" + contraseña + ", billetera=" + billetera + '}';
    }
}
