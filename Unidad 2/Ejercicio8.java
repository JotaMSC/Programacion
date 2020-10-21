/**
Escribe un programa que declare 5 variables de tipo char. A continuación, crea
otra variable como cadena de caracteres y asígnale como valor la concatenación de las anteriores 5 variables. Por último, muestra la cadena de caracteres
por pantalla ¿Qué problemas te encuentras? ¿cómo lo has solucionado?
*
*@author Juan Miguel Sánchez Cruzado
*/
public class Ejercicio8 { // Clase principal
	public static void main(String[] args) {
		char varChar1 = 'A';
		char varChar2 = 'B';
		char varChar3 = 'C';
		char varChar4 = 'D';
		char varChar5 = 'F';
		String varString = varChar1 + "" + varChar2 + "" + varChar3 + "" + varChar4 + "" + varChar5;
		System.out.println(varString);

	}
}
