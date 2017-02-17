import java.util.Scanner;

public class EjercicioDos {
   private String printCapitalized (String nombre) {
    	String cadena = nombre;
        System.out.println("El texto que deseas convertir a mayúsculas es: "+cadena);
    	System.out.println(cadena.toUpperCase());
    	return cadena;
	}
    
    public static void main(String[] args) {
    	System.out.println("Agrega un texto:");
    	Scanner in = new Scanner(System.in);
    	String nombre = in.nextLine();
        EjercicioDos cap = new EjercicioDos();
        cap.printCapitalized(nombre);
	}

}