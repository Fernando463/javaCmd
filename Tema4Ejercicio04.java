public class Tema4Ejercicio04 {
  
  public static void main(String[] args){
    System.out.println("Por favor, introduce el número de horas trabajadas durante"
      + "la semana: ");
    
    
    int horas=Integer.parseInt(System.console().readLine());
    int sueldo;
    int horasE;
    
    if(horas >= 0 && horas <= 40){  // De 0 a 40 horas, se pagan a 12 euros/hora.
      sueldo= horas * 12;
    }else{
      horasE=horas-40; // Calcula cuantas horas extraordinarias se han trabajado (las que exceden a 40).
      sueldo=((horasE * 16)+(40 * 12)); // Si se ejecuta el ELSE, es porque se han trabajado más de 40 horas, de ahí 40*12 + extras.
    }
    
    System.out.println("El sueldo semanal que le corresponde es de: " 
    + sueldo + " euros");
  }
  
}