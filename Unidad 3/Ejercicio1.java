/**
Realiza un programa que pida dos números y que luego muestre el resultado
de su multiplicación.
*
*@author Juan Miguel Sánchez Cruzado
*/
public class Ejercicio1 { // Clase principal
	public static void main(String[] args) {
		int x;
		int y;
		String dato;
		
		System.out.print("Introduce el primer numero de la multiplicacion: ");
		dato = System.console().readLine();
		x = Integer.parseInt( dato );
		System.out.print("El segundo numero: ");
		dato = System.console().readLine();
		y = Integer.parseInt( dato );
		
		System.out.println(x + "*" + y + "=" + (x * y));
	}
}
