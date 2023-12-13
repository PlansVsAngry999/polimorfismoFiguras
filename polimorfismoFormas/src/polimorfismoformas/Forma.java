package polimorfismoformas;
/**
 * @author Ricardo Daniel Hernández Sosa (PlansVsAngry999).
 */
abstract class Forma {
   private String nombre; 
   public Forma(String nombre){
       this.nombre = nombre;
   }
        //Función que calcula el area de la figura.
   public abstract double calcularArea();
        //Métodos get y set.
   public String getNombre(){
       return nombre;
   }
   public void setNombre(String nombre){
       this.nombre = nombre;
   }
}