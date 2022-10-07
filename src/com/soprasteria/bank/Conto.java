package com.soprasteria.bank;

import java.util.Random;

public class Conto {
	private int codiceConto;
	private String nomeProprietario;
	private double saldoConto = 0;
	
	public Conto(String nomeProprietario) {
		Random r= new Random();
		this.codiceConto = r.nextInt(1000) ;
		this.nomeProprietario = nomeProprietario;
		
	}
	
	public int getCodiceConto = codiceConto;
	public double getSaldoConto = saldoConto;

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}
	
	public void versamentoUtente(double sommaVersataDaUtente) {
		this.saldoConto = saldoConto + sommaVersataDaUtente;
	}
	
	public double prelievoUtente(double prelievoEffettuatoDaUtente) {
		
		if (saldoConto > prelievoEffettuatoDaUtente) {
			saldoConto = this.saldoConto - prelievoEffettuatoDaUtente;
			return saldoConto;
		} else {
			return -1;

		}
	}
	
	public String infoConto() {
		return "Codice del conto: " +codiceConto + "Nome: " +nomeProprietario + "il saldo è: " +saldoConto;
	}
	
	public double formattaSaldo(){
		return saldoConto = 0;
	}
	
}
