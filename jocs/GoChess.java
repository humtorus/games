package jocs;

import java.util.Scanner;

public class games {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder menu = new StringBuilder("1.Go\n2.Chess");
		String opcio;
		System.out.println(menu);
		opcio = sc.nextLine();
		switch(Integer.parseInt(opcio)) {
		case 1:
			System.out.println("Soc el Go");
			System.out.println("A la Xina soc popular");
			break;
		case 2:
			System.out.println("Soc el Chess");
			break;
		default:break;
		}
	}

}
