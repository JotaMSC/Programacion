/**
Igual que el programa anterior, pero esta vez la pirámide estará hueca (se debe
ver únicamente el contorno hecho con asteriscos).
Ejemplo:
    *
   * *
  *   *
 *     *
*********
*
*@author Juan Miguel Sánchez Cruzado
*/
public class Ejercicio7 { // Clase principal
	public static void main(String[] args) {
		System.out.printf("%-4s %s \n","","*");
		System.out.printf("%-3s %s %s \n","","*","*");
		System.out.printf("%-2s %s %-1s %s \n","","*","","*");
		System.out.printf("%-1s %s %-3s %s \n","","*","","*");
		System.out.printf("%s %-9s \n","","*********");

	}
}
