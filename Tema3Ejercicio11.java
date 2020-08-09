import java.util.Scanner;

public class Tema3Ejercicio11 {
  
  public static void main(String[] args){
    
    Scanner s=new Scanner(System.in);
    
    System.out.print("Introduce el valor en kB que quieres pasar a MB: ");
    
    double k=s.nextDouble();
    double m=k/1024;
    
    System.out.println("Los "+k+"KB son "+m+"MB");
  }
  
}