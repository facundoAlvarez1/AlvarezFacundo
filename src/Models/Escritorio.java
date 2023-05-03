package Models;

public class Escritorio extends Muebles{
    private Double alto;
    private Double ancho;

    public Escritorio() {
    }

    public Escritorio(Integer stock, String nombre, Integer precio, Double alto, Double ancho) {
        super(stock, nombre, precio);
        this.alto = alto;
        this.ancho = ancho;
    }

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "Escritorio{" +
                "alto=" + alto +
                ", ancho=" + ancho + ". " + super.toString()+
                '}';
    }


}
