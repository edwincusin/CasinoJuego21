package com.krakedev.juegos.entidades;

import java.util.ArrayList;

public class Dealer {
	//ATRIBUTO
	private ArrayList<Carta> naipe;
	// constructor
	public Dealer() {
		this.naipe = new ArrayList<Carta>();
		generarNaipe();
		}
	//METODO GET Y SET
	public ArrayList<Carta> getNaipe() {
		return naipe;
	}

	public void setNaipe(ArrayList<Carta> naipe) {
		this.naipe = naipe;
	}
	//METODO GENERAR NAIPE
	public void generarNaipe() {
		ArrayList<String> auxiliar = new ArrayList<>();
		auxiliar.add("T");
		auxiliar.add("CN");
		auxiliar.add("CR");
		auxiliar.add("D");
		
		for(String palo : auxiliar) {
			naipe.add(new Carta("A",palo));
			naipe.add(new Carta("J",palo));
			naipe.add(new Carta("Q",palo));
			naipe.add(new Carta("K",palo));
			for(int i=2;i<=10;i++) {
				naipe.add(new Carta(i+"", palo));
			}
		}	
	}
	//IMPRIMIR NAIPE
	public void imprimirNaipe() {
		for (Carta carta : naipe) {
			carta.imprimir();
		}
	}
	
	//METODO GENERAR ALEATORIO 
	public int generarAleatorio(int maximo) {
		double aleatorio=Math.random()*(maximo+1);
		return (int)aleatorio;
	}
	
	//METODO ENTREGAR CARTA
	public Carta entregarCarta() {
		int numeroCarta=generarAleatorio(naipe.size()-1);
		Carta carta=naipe.get(numeroCarta);
		naipe.remove(numeroCarta);
		return carta;
	}
	
}
