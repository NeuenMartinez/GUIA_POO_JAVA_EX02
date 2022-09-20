/*
 * @author NeuenMartinez
 * Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus 
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos 
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en 
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia 
que existe entre los dos puntos que existen en la clase Puntos.
 */
package POOej_Ex02;

import Entidades_Ex02.Puntos;
import Servicios_Ex02.PuntosService;

public class POOej_Ex02 {

    public static void main(String[] args) {

        PuntosService ps = new PuntosService();
        Puntos p1 = ps.crearPunto();
        Puntos p2 = ps.crearPunto();
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("La distancia entre los puntos es: " + ps.distanciaPuntos(p1, p2));
    }

}
