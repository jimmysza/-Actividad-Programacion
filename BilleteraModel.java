
package Model;

 
public class BilleteraModel extends ClienteModel {
    private int dinero;

    public BilleteraModel() {
    }

    public BilleteraModel(int dinero, String nombre_usuario, String contraseña, String billetera) {
        super(nombre_usuario, contraseña, billetera);
        this.dinero = dinero;
    }


    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return super.toString() + "BilleteraModel{" + "dinero=" + dinero + '}';
    }  
    
}
