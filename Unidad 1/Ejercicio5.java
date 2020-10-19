/**
*Modifica el programa anterior añadiendo colores. Puedes mostrar cada asignatura de un color diferente.
* 
* 
* Innecesario ajustar las barritas y sus colores, ya que la idea es ir jugando con el codigo de colores.
*
*@author Juan Miguel Sánchez Cruzado
*/
public class Ejercicio5 { // Clase principal
	public static void main(String[] args) {
		System.out.printf("%-10s %-10s %-10s %-10s %-10s %-1s \n","|\033[30mLunes","|\033[31mMartes","|\033[32mMiércoles","|\033[34mJueves","|\033[35mViernes","|");
		System.out.printf("%-50s \n","--------------------------------------------------");
		System.out.printf("%-10s %-10s %-10s %-10s %-10s %-1s \n","|\033[90mPROG","|\033[95mSISTEMAS","|\033[91mBDD","|\033[90mPROG","|\033[95mSISTEMAS","|");
		System.out.printf("%-10s %-10s %-10s %-10s %-10s %-1s \n","|\033[90mPROG","|\033[91mBDD","|\033[90mPROG","|\033[90mPROG","|\033[95mSISTEMAS","|");
		System.out.printf("%-10s %-10s %-10s %-10s %-10s %-1s \n","|\033[91mBDD","|\033[91mBDD","|\033[90mPROG","|\033[90mPROG","|\033[95mSISTEMAS","|");
		System.out.printf("%-10s %-10s %-10s %-10s %-10s %-1s \n","|\033[92mL.MAR","|\033[90mPROG","|\033[95mSISTEMAS","|\033[91mBDD","|\033[94mFOL","|");
		System.out.printf("%-10s %-10s %-10s %-10s %-10s %-1s \n","|\033[92mL.MAR","|\033[92mL.MAR","|\033[95mSISTEMAS","|\033[91mBDD","|\033[94mFOL","|");
		System.out.printf("%-10s %-10s %-10s %-10s %-10s %-1s \n","|\033[95mSISTEMAS","|\033[92mL.MAR","|\033[94mFOL","|\033[91mBDD","|\033[94mFOL","|");

	}
}
