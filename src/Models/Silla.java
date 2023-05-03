package Models;

public class Silla extends Muebles{
    private Boolean rueda;

    public Silla() {
    }

    public Silla(Integer stock, String nombre, Integer precio, Boolean rueda) {
        super(stock, nombre, precio);
        this.rueda = rueda;
    }

    public Boolean getRueda() {
        return rueda;
    }

    public void setRueda(Boolean rueda) {
        this.rueda = rueda;
    }

    @Override
    public String toString() {
        return "Silla{" +
                "rueda=" + rueda +". " + super.toString() +
                '}';
    }


}
