package Ejercicios1;

import java.util.Scanner;

public class Propuesto12 {
	/*12. (Ejercicio de dificultad alta) Realiza un programa que dado un importe en euros nos indique el mínimo número
	* de billetes y la cantidad sobrante que se pueden utilizar para obtener dicha cantidad.
	* Por ejemplo:
	232 euros:
	1 billete de 200.
	1 billete de 20.
	1 billete de 10
	Sobran 2 euros.
	*/
	public static void main(String[] args) {
		
		int pasta=0;
		int quini=0,dosci=0,cien=0,cincu=0,venti=0,dieci=0,cinqui=0,m2=0,m1=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime el importe entero: ");
		 pasta = sc.nextInt();
		while (pasta >= 500) {
			quini++;
			pasta -= 500;
		} 
		while (pasta >= 200) {
			dosci++;
			pasta -= 200;
		}
		while (pasta >= 100) {
			cien++;
			pasta-=100;
		}
		while (pasta >= 50) {
			cincu++;
			pasta-=50;
		}
		while (pasta >= 20) {
			venti++;
			pasta-=20;
		}
		while (pasta >= 10) {
			dieci++;
			pasta-=10;
		}
		while (pasta >= 5) {
			cinqui++;
			pasta-=5;
		}
		while (pasta >= 2) {
			m2++;
			pasta-=2;
		}
		while (pasta >= 1) {
			m1++;
			pasta-=1;
		}
		
		if (quini >=1) {
			System.out.println("El resultado es: "+quini+" billete de 500, "+dosci+" billete de 200, "+cien+" billete de 100, "+cincu+" billete de 50, "+venti+" billete de 20, "+dieci+" billete de 10, "+cinqui+" billete de 5, "+m2+ " moneda/s de 2, "+m1+" moneda/s de 1");
		}else if (dosci >=1) {
			System.out.println("El resultado es: "+dosci+" billete de 200, "+cien+" billete de 100, "+cincu+" billete de 50, "+venti+" billete de 20, "+dieci+" billete de 10, "+cinqui+" billete de 5, "+m2+ " moneda/s de 2, "+m1+" moneda/s de 1");
		}else if (cien >=1) {
			System.out.println("El resultado es: "+cien+" billete de 100, "+cincu+" billete de 50, "+venti+" billete de 20, "+dieci+" billete de 10, "+cinqui+" billete de, 5 "+m2+ " moneda/s de 2, "+m1+" moneda/s de 1");
		}else if (cincu >=1) {
			System.out.println("El resultado es: "+cincu+" billete de 50, "+venti+" billete de 20 "+dieci+" billete de 10, "+cinqui+" billete de 5, "+m2+ " moneda/s de 2, "+m1+" moneda/s de 1");
		}else if (venti >=1) {
			System.out.println("El resultado es: "+venti+" billete de 20, "+dieci+" billete de 10 "+cinqui+" billete de 5, "+m2+ " moneda/s de 2, "+m1+" moneda/s de 1");
		}else if (dieci >=1) {
			System.out.println("El resultado es: "+dieci+" billete de 10, "+cinqui+" billete de 5 "+m2+ " moneda/s de 2, "+m1+" moneda/s de 1");
		}else if (cinqui >=1) {
			System.out.println("El resultado es: "+cinqui+" billete de 5, "+m2+ " moneda/s de 2 "+m1+" moneda/s de 1");
		}else if (m2 >=1) {
			System.out.println("El resultado es: "+m2+ " moneda/s de 2, "+m1+" moneda/s de 1");
		}else {
			System.out.println("El resultado es: "+m1+" moneda/s de 1");
		}
		
		sc.close();
		
		
	}

}