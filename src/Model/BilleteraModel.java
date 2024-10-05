
package model;


public class BilleteraModel {
    private int dinero;

    public BilleteraModel() {
    }

    public BilleteraModel(int dinero) {
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
        return "BilleteraModel{" + "dinero: " + dinero + '}';
    }
    
  
        
}

    



