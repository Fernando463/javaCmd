
public class Tema4Ejercicio04Mejorado {
  public static void main(String[] args){
    
    System.out.print("Por favor, introduce el número de horas trabajadas"
      + " durante la semana: ");
    
    int horas=Integer.parseInt(System.console().readLine());
    int sueldo;
    
    if(horas >= 0 && horas <= 40){
      sueldo=(horas * 12);
           
    }else{
      sueldo=(((horas - 40) * 16)+ (40 * 12));
    }
    System.out.println("El sueldo semanal que le corresponde es de" + sueldo
       + "euros");
  }
  
}