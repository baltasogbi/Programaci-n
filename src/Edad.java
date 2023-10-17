import java.util.Scanner;

public class Edad {

	public static void main(String[] args) {
		int AñoActual,añodeNacimiento,edad;
		Scanner scanner=new Scanner (System.in);
		
		System.out.println("ingrese año actual");
		AñoActual=scanner.nextInt();
		
		System.out.println("ingrese Año de nacimiento");
		añodeNacimiento=scanner.nextInt();
		
		edad= AñoActual - añodeNacimiento;
		
		System.out.println("Su edad es"+edad+"años"); 
	}

}
