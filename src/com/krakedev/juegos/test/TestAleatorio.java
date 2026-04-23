package com.krakedev.juegos.test;

import com.krakedev.juegos.entidades.Dealer;

public class TestAleatorio {

	public static void main(String[] args) {
		
		Dealer dealer= new Dealer();
		
		for(int i=1;i<=100;i++) {
			int aleatorio=dealer.generarAleatorio(i);
			if(aleatorio==0) {
				System.out.println("Valor aleatorio = 0 ");
			}else if(aleatorio<=i) {
				System.out.println("Valor dentro del rango : "+aleatorio);
			}else {
				System.out.println("Valor fuera del rango : "+aleatorio);
			}
		}

	}

}
