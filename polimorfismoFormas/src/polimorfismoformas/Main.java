package polimorfismoformas;
/**
 * @author Ricardo Daniel Hernández Sosa (PlansVsAngry999).
 */
public class Main {
    public static void main(String[] args){
            //Crear un arreglo de la clase Forma.
        Forma[] formas = new Forma[3];
            //Asignar valor a cada espacio del arreglo.
        formas[0] = new Circulo("Circulo 1", 5.0);
        formas[1] = new Rectangulo("Rectangulo 1", 10.0, 5.0);
        formas[2] = new Triangulo("Triangulo 1", 8.0, 4.0);
            //Mostrar datos de las figuras.
        for(Forma forma : formas){
            System.out.println("Nombre: " + forma.getNombre());
            System.out.println("Area: " + forma.calcularArea());
        }
    }
}
