import Models.*;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Producto> producto = new ArrayList<>(); ///punto 3
        double descuentoSilla;
        double descuentoImpresora;

        Silla silla = new Silla(50, "Silla Pro", 2500, true);
        Escritorio escritorio = new Escritorio(60, "Escritorio Premium", 4000, 1.5, 2.0);
        Impresora impresora = new Impresora(20, "Impresora Color", 1500, "Delta Computacion", 150);
        Notebook notebook = new Notebook(12, "Samsung Pro", 10000, "Samsung", 16);

        producto.add(silla);
        producto.add(escritorio);
        producto.add(impresora);
        producto.add(notebook);

        ///  Crear una instancia de cada clase y agregarla a un List. Luego recorrerlo mostrando por pantalla el
        ///  tipo de instancia que es.

        for (Producto p : producto) {
            System.out.println("\n" + p.toString() + "\n");
        }

        //punto 4 descuento para clientes VIP.
        System.out.println("==========================================================================================");
        descuentoSilla =  ofertaClientesVip(2500,5);
        System.out.println("Descuento Especial para clientes VIP :  " + descuentoSilla);
        System.out.println("==========================================================================================");
        descuentoImpresora =  ofertaClientesVip(1500,15);
        System.out.println("Descuento Especial para clientes VIP :  " + descuentoImpresora);
        System.out.println("============================================================================================");

     //Punto 5 actualizar Valores
        actualizarValores(producto);

    }
     /*4)Nos dice que tanto las Impresoras como las Sillas se encuentran
          de oferta. Y que para cada cliente se puede aplicar un descuento especial. Se debe indicar por parámetro
        el porcentaje de descuento y retornar el precio del producto con el descuento aplicado.
        */
    public static double ofertaClientesVip(int precioOriginal,float descuento){
        double v = precioOriginal- ((precioOriginal * descuento) / 100);
        return v;
    }

    /*5) Se solicita actualizar el valor de los precios del array del ejercicio 3. Esto se debe realizar a través
             de un método de la clase. Cree un bucle en donde se actualizan con los siguientes valores e imprima
           */
    public static void actualizarValores(List<Producto> producto) {
        DecimalFormat formato = new DecimalFormat("#");
        for (Producto nuevo:producto) {
            switch (nuevo.getClass().getSimpleName()){
                case "Silla":
                    System.out.println("SILLA:");
                    System.out.println("Precio Anterior: " + nuevo.getPrecio());
                    nuevo.aplicarDescuento(5);
                    String resultado = formato.format(nuevo.getPrecio());
                    System.out.println("Precio con Descuento : " + resultado);
                    System.out.println();
                    break;
                case "Escritorio":
                    System.out.println("ESCRITORIO");
                    System.out.println("Precio Anterior: " + nuevo.getPrecio());
                    nuevo.aplicarDescuento(10);
                    String resultado1 = formato.format(nuevo.getPrecio());
                    System.out.println("Precio con Descuento : " + resultado1);
                    System.out.println();
                    break;
                case "Impresora":
                    System.out.println("IMPRESORA");
                    System.out.println("Precio Anterior: " + nuevo.getPrecio());
                    nuevo.aplicarDescuento(15);
                    String resultado2 = formato.format(nuevo.getPrecio());
                    System.out.println("Precio con Descuento : " + resultado2);
                    System.out.println();
                    break;
                case "Notebook":
                    System.out.println("NOTEBOOK");
                    System.out.println("Precio Anterior: " + nuevo.getPrecio());
                    nuevo.aplicarDescuento(20);
                    String resultado3 = formato.format(nuevo.getPrecio());
                    System.out.println("Precio con Descuento : " + resultado3);
                    System.out.println();
                    break;
            }
        }
    }

}

