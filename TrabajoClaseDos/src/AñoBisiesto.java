import java.util.Scanner;

public class AñoBisiesto {
	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		
		System.out.println("introduce el año que desee");
		int anio = sn.nextInt();
		
		if ((anio %4 ==0 && anio %100 !=0) || (anio %400 ==0)){
		
			System.out.println("El año" + anio + "es bisiesto");
		} else {
			System.out.println("El año" + anio + "no es bisiesto");
		}
		
	}
	}


