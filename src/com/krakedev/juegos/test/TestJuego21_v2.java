package com.krakedev.juegos.test;

import java.util.ArrayList;

import com.krakedev.juegos.entidades.Jugador;
import com.krakedev.juegos.servicios.Juego21;

public class TestJuego21_v2 {

	public static void main(String[] args) {
		
		Juego21 partida1= new Juego21();
		
		partida1.agregarJugador(new Jugador("Pablo"));
		partida1.agregarJugador(new Jugador("Mayte"));
		partida1.agregarJugador(new Jugador("Daniel"));
		
		ArrayList<Jugador>GanadoresJuego=new ArrayList<Jugador>();
		
		
		
		for (int i=1;i<=10;i++) {//hacemos 10 iteraciones 
			partida1.inicializar();
			GanadoresJuego=partida1.jugar();
						
			for(Jugador jugador:partida1.getJugadores()) {
				jugador.imprimir();				
			}
			
			System.out.println();
			
			if (GanadoresJuego.size()>0) {
				System.out.println("___GANADORES_____");
				
				for(Jugador jugador :GanadoresJuego) {
					System.out.println(jugador.getNickname());
				}
			}else {
				System.out.println(">>>>>>>SIN GANADORES<<<<<<<<");
			}	
			
			System.out.println();
			System.out.println();
		}
		
	
		
	}

}
