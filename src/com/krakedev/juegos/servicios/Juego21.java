package com.krakedev.juegos.servicios;

import java.util.ArrayList;

import com.krakedev.juegos.entidades.Carta;
import com.krakedev.juegos.entidades.Dealer;
import com.krakedev.juegos.entidades.Jugador;

public class Juego21 {
	private ArrayList<Jugador> jugadores =new ArrayList<Jugador>(); 
	private Dealer dealer;
	
	
	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public Dealer getDealer() {
		return dealer;
	}

	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}

	//METODO CARGAR VALORES
	public void cargarValores() {
		
		
		for(Carta carta:dealer.getNaipe()) {
			if(carta.getValor()==("A")) {
				carta.setValorJuego(11);
			}else if(carta.getValor()==("J")
					||carta.getValor()==("Q")
					||carta.getValor()==("K")){
						carta.setValorJuego(10);
				
			}else {
				carta.setValorJuego(Integer.parseInt(carta.getValor()));
			}
		}
	}
	
	public void inicializar() {
		dealer= new Dealer();
		cargarValores();
	}
	public void agregarJugador(Jugador jugador) {
		jugadores.add(jugador);
	}
	
	public void repartirCarta(Jugador jugador) {
		Carta carta=dealer.entregarCarta();
		jugador.recibirCarta(carta);
	}
	
	//REPARTIR RONDA
	public void repartirRonda() {
		for(Jugador jugador : jugadores) {
			repartirCarta(jugador);
		}
		calcularTotal();
	}
	// METODO CALCULAR TOTAL
	public void calcularTotal() {
		for(Jugador jugador: jugadores) {
			int totalCartas=0;;
			for(Carta carta: jugador.getCartas()) {
				totalCartas+=carta.getValorJuego();
			}
			jugador.setPuntajeCartas(totalCartas);
		}
	}
	//10. METODO VALIDAR GANADOR
	public ArrayList<Jugador> validarGanadores(){
		ArrayList<Jugador> ganadores=new ArrayList<Jugador>();
		
		for(Jugador jugador: jugadores) {
			
			if(jugador.getPuntajeCartas()==21) {
				ganadores.add(jugador);
			}
		}
		return ganadores;
	}
	
	//11. METODO JUGAR 
	public ArrayList<Jugador> jugar(){
		ArrayList<Jugador> ganadores=new ArrayList<Jugador>();
		for (int i=0;i<3;i++) {
			repartirRonda();
			ganadores=validarGanadores();
			if(ganadores.size()>0) {
				break;
			}
		}
		return ganadores;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
