package Models;

public class Notebook extends ProductoInformatico{
    private Integer memoria;

    public Notebook() {
    }

    public Notebook(Integer stock, String nombre, Integer precio, String nombreFabricante, Integer memoria) {
        super(stock, nombre, precio, nombreFabricante);
        this.memoria = memoria;
    }

    public Integer getMemoria() {
        return memoria;
    }

    public void setMemoria(Integer memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "memoria=" + memoria + ". "+ super.toString() +
                '}';
    }


}
