package com.krakedev.juegos.test;

import com.krakedev.juegos.entidades.Jugador;
import com.krakedev.juegos.servicios.Juego21;

public class TestJuego21 {

	public static void main(String[] args) {
		
		Juego21 partida1= new Juego21();
		
		partida1.agregarJugador(new Jugador("Pablo"));
		partida1.agregarJugador(new Jugador("Mayte"));
		partida1.agregarJugador(new Jugador("Daniel"));
		
		partida1.inicializar();
		partida1.repartirRonda();
		partida1.repartirRonda();
		
		for(Jugador jugador:partida1.getJugadores()) {
			jugador.imprimir();
			
		}
		System.out.println();
		partida1.getDealer().imprimirNaipe();
	
	}

}
