/**
Escribe un programa que declare variables de tipo char y de tipo String. Intenta
mostrarlas por pantalla todas juntas en la misma línea y con una sola sentencia
de Java (con un solo println) ¿es posible?
*
*@author Juan Miguel Sánchez Cruzado
*/
public class Ejercicio7 { // Clase principal
	public static void main(String[] args) {
		String varString = "Esto es una variable String junto con una variable char";
		char varChar = 'X';
		System.out.println(varString + " " + varChar);
		

	}
}
