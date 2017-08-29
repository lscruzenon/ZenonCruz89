
// Importar calses de un paquete
// Puede también importar solo una clase en especifico
// Ejempo: import.amistad.Amigo (Es la clase que se esta usando)
import amistad.*;

// Curso Java Beginer 
public class Saludos{

	// Declaracion de variables (Existen diferentes tipos)
	static String dia = "Martes 29 de Agosto";

	
	public static void main(String[] args){
						
		// Imprimir en consola un mensaje (un saludo)
		System.out.println("Bienvenido al Universo JAVA, hoy es: " +dia);
		
		// Crear una instancia de una clase que necesitamos usar 
		//(En este caso necesitamos el metodo llamado saludo())
		Amigo carlitos = new Amigo();
		carlitos.saludo(); // Ejecutar metodo saludo()
		
		// Ejempo de como importar solo una clase de un paquete especifico.
		// Aparte de la importación anterior o que normalmente conocemos.
		companerismo.Companero compa = new companerismo.Companero();
		compa.saludo(); // Ejecutar metodo saludo 
		
		int a = 10;
		int b = 3;
		double r = a / b;
		
		System.out.println("resultado: " + r);
	}
}