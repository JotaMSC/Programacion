/**
Escribe un programa que calcule el total de una factura a partir de la base
imponible (precio sin IVA). La base imponible estará almacenada en una
variable.
*
*@author Juan Miguel Sánchez Cruzado
*/
public class Ejercicio6 { // Clase principal
	public static void main(String[] args) {
		double impuestoValorAnadido = 16;
		double baseImponible = 10;
		System.out.println("El precio con IVA:" + (baseImponible + (impuestoValorAnadido/100)));
		System.out.println("El precio sin IVA:" + (baseImponible));
		

	}
}
