import java.util.Scanner;

public class Tema3Ejercicio10 {
  
  public static void main(String[] args){
    
    Scanner s=new Scanner(System.in);
    
    System.out.print("Introduce el valor en Mb: ");
    
    double m=s.nextDouble();
    double k= m*1000;
    
    System.out.println(m+" MegaBits son: "+k+" KiloBits");
    
    
  }
  
}
