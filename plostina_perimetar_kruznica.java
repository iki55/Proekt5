package proekt_5;

import java.util.Scanner;

public class plostina_perimetar_kruznica {

	public static void main(String[] args) {
		double r,plostina,perimetar;
		Scanner tastatura= new Scanner (System.in);
		System.out.println("Programata presmetuva povrsina i perimetar na kruznica");
		System.out.println("Vnesete ja vrednosta za r");
		r=tastatura.nextDouble();
		perimetar= 2*r*3.14;
		plostina=2*2*3.14;
		System.out.println();
		System.out.println("Perietarot e:"+perimetar);
		System.out.println("plostinata e:"+plostina);

	}

}
