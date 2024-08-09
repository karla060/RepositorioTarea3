/**
 * Algoritmo para hallar el promedio de 4 calificaciones de exámenes
 * @author Karla Pirir García 
 * @since 08/08/2024
 */

 import java.util.Scanner;
 /**
  *importar la clase Scanner para poder ingresar datos 
 * */
 public class Ejercicio1 {
     public static void main (String [] args){
         Scanner scan = new Scanner (System.in);
 
 /*Ingreso de los datos a sumar y dividir */
      int primeraNota = scan.nextInt();
      int segundaNota = scan.nextInt();
      int terceraNota = scan.nextInt();
      int cuartaNota = scan.nextInt();
      int quintaNota = scan.nextInt();
      int sextaNota = scan.nextInt();
 /**
  * Calcular el promedio de 4 notas con misma ponderación.
  *
  *  @param primeraNota la primera calificación a sumar
  *  @param segundaNota la segunda calificación a sumar 
  *  @param terceraNota la tercera calificación a sumar 
     @param cuartaNota la cuarta calificacióln a sumar
     @param quintaNota la quinta calificacióln a sumar
  *  @param SextaNota la sexta y última calificación a sumar,
  *  para luego dividir este resultado dentro de 4
  *  @return el promedio de las cuatro calificaciónes 
  * 
  */
      int promedio = (primeraNota + segundaNota + 
      terceraNota + cuartaNota + quintaNota + sextaNota) / 6 ;
      System.out.print(promedio);
     }
 }