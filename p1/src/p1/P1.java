package p1;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		a();
	}

	public static void a() {
		Scanner sc = new Scanner(System.in);
		String stringNumeros = sc.nextLine();
		
		String[] arregStringloDeNumeros = stringNumeros.split(" "); 
		
		int[] arregloIntDeNumeros = new int[arregStringloDeNumeros.length];
		
		for (int i = 0; i < arregloIntDeNumeros.length; i++) {
			arregloIntDeNumeros[i]=Integer.parseInt(arregStringloDeNumeros[i]);
		}
		
		for (int i = 0; i < arregloIntDeNumeros.length; i++) {
			System.out.println(arregloIntDeNumeros[i]);
		}
		
		System.out.println("tamaño del arreglo: "+arregloIntDeNumeros.length);
		
		//--------------------------------------------
		
		int pos0Mas1 = 1;
		int pos0 = 0;
		boolean yaHayQueNoCumpla = false;
		int max = 0;
		int contador = 1;
		int posicionDelAnteriorQueNoCumpla = 0;
		
		while(pos0Mas1 < arregloIntDeNumeros.length) {
					
			if(arregloIntDeNumeros[pos0]>=arregloIntDeNumeros[pos0Mas1] && yaHayQueNoCumpla == false) {
				yaHayQueNoCumpla = true;
				contador ++;
				posicionDelAnteriorQueNoCumpla = pos0Mas1;
			}
			
			else if(arregloIntDeNumeros[pos0]>=arregloIntDeNumeros[pos0Mas1] && yaHayQueNoCumpla == true) {
				if(contador > max) {
					max = contador;
				}
				contador = 1;
				yaHayQueNoCumpla = false;
				pos0 = posicionDelAnteriorQueNoCumpla;
				pos0Mas1 = posicionDelAnteriorQueNoCumpla + 1;
			}
			
			if(arregloIntDeNumeros[pos0]<arregloIntDeNumeros[pos0Mas1]) {
				contador ++;
			}
			
			if(contador > max) {
				max = contador;
			}
			pos0Mas1++;
			pos0++;
		}
		
		System.out.println(max);
	}
}
