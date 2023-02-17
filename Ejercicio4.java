package generation.otros;
import java.util.Scanner;


public class Ejercicio4 {

    Scanner s = new Scanner(System.in);
    
    // los meti en un metodo
    void introduceNumero(){
    	System.out.print("Introduzca un número: ");    	
	    
    	// los converti en int
    	int ni = s.nextInt();
	    int c = ni;
    

	    	int digito = (int)(ni % 10);
	    	if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
	    		System.out.println("El " + c + " es un número afortunado.");
	    		
	    	} else {
	    		System.out.println("El " + c + " no es un número afortunado.");
	    	}
	    
    }
}

