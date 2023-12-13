package polimorfismoformas;
/**
 * @author Ricardo Daniel Hernández Sosa (PlansVsAngry999).
 */
public class Rectangulo extends Forma{
    private double base, altura;
    public Rectangulo(String nombre, double base, double altura){
        super(nombre);
        this.base = base;
        this.altura = altura;
    }
    public double calcularArea(){
        return base * altura;
    }
}
