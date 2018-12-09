package p2;

import java.util.Arrays;
import java.util.Scanner;

public class p2 {

	public static void main(String[] args) {

		setUp();
		
	}
	
	public static void setUp() {
		
		Scanner sc = new Scanner(System.in);
		
		String cString = sc.nextLine();
		int c = Integer.parseInt(cString);
		
		String nString = sc.nextLine();
		int n = Integer.parseInt(nString);
		
		String aString = sc.nextLine();
		String[] arregloAString = aString.split(" ");
		int[] a = new int[arregloAString.length];
		for (int i = 0; i < a.length; i++) {
			a[i]=Integer.parseInt(arregloAString[i]);
		}
		
		String bString = sc.nextLine();
		String[] arregloBString = bString.split(" ");
		int[] b = new int[arregloBString.length];
		for (int i = 0; i < b.length; i++) {
			b[i]=Integer.parseInt(arregloBString[i]);
		}
		
		System.out.println("c:" + c);
		System.out.println("n: " + n);
		System.out.println("a: " + Arrays.toString(a));
		System.out.println("b" + Arrays.toString(b));
		System.out.println("----------------------------------");
		calcular(c, n, a, b);
		
	}
	
	public static void calcular(int c, int n, int[] a, int[] b) {
		for (int i = 0; i < n; i++) {
			int r = max(a[i],b[i]);
			c = c + ganancia(c, r);
		}
		System.out.println("Capital final: " + c);
	}
	
	public static int max(int a, int b) {
		if(a>b) {
			return a;
		}
		else return b;
	}
	
	public static int ganancia(int c, int r) {
		double a = (c*r)/100;
		System.out.print(a + "\n");
		return parteEntera(a);
	}
	
	public static int parteEntera(double a) {
		double frac = a%1;
		double intPart = a-frac;
		return (int) intPart;
		
	}

}
