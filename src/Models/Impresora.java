package Models;

public class Impresora extends ProductoInformatico{
    private Integer hoja;

    public Impresora() {
    }

    public Impresora(Integer stock, String nombre, Integer precio, String nombreFabricante, Integer hoja) {
        super(stock, nombre, precio, nombreFabricante);
        this.hoja = hoja;
    }

    public Integer getHoja() {
        return hoja;
    }

    public void setHoja(Integer hoja) {
        this.hoja = hoja;
    }

    @Override
    public String toString() {
        return "Impresora{" +
                "hoja=" + hoja+ ". " + super.toString()+
                '}';
    }

}
