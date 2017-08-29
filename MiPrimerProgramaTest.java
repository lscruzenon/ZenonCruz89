// Curso Java Beginer 
import java.util.Scanner;

public class MiPrimerProgramaTest{

	static String dia = "Martes 29 de Agosto";

	public static void main(String[] args){
		
		System.out.println("Ingrese su nombre completo:");	
		String nombre = "";
		Scanner scanner = new Scanner(System.in);
		nombre = scanner.nextLine();
		
		System.out.println("Bienvenido al Universo JAVA, "+ nombre +" hoy es: " +dia);
	}
}