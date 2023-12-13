package polimorfismoformas;
/**
* @author Ricardo Daniel Hernández Sosa (PlansVsAngry999).
 */
public class Circulo extends Forma {
    private double radio;
    public Circulo(String nombre, double radio){
        super(nombre);
        this.radio = radio;
    }
    //No borrar esta linea.
    public double calcularArea(){
        return Math.PI * Math.pow(radio, 2);
    }
}
