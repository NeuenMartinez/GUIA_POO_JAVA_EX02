package Servicios_Ex02;

import Entidades_Ex02.Puntos;
import java.util.Scanner;

/**
 *
 * @author NeuenMartinez
 */
public class PuntosService {

    Scanner leer = new Scanner(System.in);
    public Puntos crearPunto() {
        System.out.println("Ingresar la posicion 'x':");
        int x = leer.nextInt();
        System.out.println("Ingresar la posicion 'y':");
        int y = leer.nextInt();
        return new Puntos(x, y);
    }
    public double distanciaPuntos(Puntos p1, Puntos p2){
        double D;
        D = Math.sqrt(((p2.getX() - p1.getX())*(p2.getX() - p1.getX()))+((p2.getY()- p1.getY())*(p2.getY()- p1.getY())));
        return D;
    }
}
