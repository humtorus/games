package jocs;

import java.util.Scanner;

public class ms {

	public static void main(String[] args) {
		String comprovant;
		StringBuilder menu=new StringBuilder("1.Crear tauler\n2.Repetir partida\n3.Mostrar bombes\n4.Sortir\n5.Carregar partida anterior");
		Scanner sc=new Scanner(System.in);
		int opcio;
		int x,y;
		System.out.println("Espai per iniciar el joc: ");
		comprovant = sc.nextLine();
		if(comprovant.contentEquals(" ")) {
			do {
				System.out.println(menu);
				System.out.println("Escriu la opcio: ");
				opcio=Integer.parseInt(sc.nextLine());
			switch(opcio) {
			case 1: 
				System.out.println("Introdueix tamany x:");
				x=Integer.parseInt(sc.nextLine());
				System.out.println("Introdueix tamany y:");
				y=Integer.parseInt(sc.nextLine());
				if(x>0 && y>0) {
					System.out.println("Tauler creat");
				}
				else {
					System.out.println("Valors introduits no valids");
				}
				break;
			case 2: 
				System.out.println("Tauler recreat");
				break;
			case 3: 
				System.out.println("Mostrant bombes");
				break;
			case 4: System.out.println("A reveure");break;
			case 5: System.out.println("Indiqui la ruta del fitxer : ");break;
			default:System.out.println("Opcio erronea");break;
			}
			}while(opcio!=4);
			
		}

	}

}
