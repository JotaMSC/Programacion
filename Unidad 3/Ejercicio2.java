/**
Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
convertir debe ser introducida por teclado.
*
*@author Juan Miguel Sánchez Cruzado
*/
public class Ejercicio2 { // Clase principal
	public static void main(String[] args) {
		//introducimos el valor que tiene 1 euro
		double valorEuro = 166.386;
		double cantidad;
		String dato;
		
		System.out.print(" Introduce la cantidad de euros que quieres convertir a pesetas");
		dato = System.console().readLine();
		cantidad = Integer.parseInt( dato );
		
		System.out.println(valorEuro + "*" + cantidad + "=" + (valorEuro * cantidad));
	}
}
