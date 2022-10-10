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
	
	public int getCodiceConto(){
		return codiceConto;
	}
	public double getSaldoConto(){
		return saldoConto;
	} 

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}
	
	public double versamentoUtente(double sommaVersataDaUtente) {
		this.saldoConto = saldoConto + sommaVersataDaUtente;
		return saldoConto;
	}
	
	public double prelievoUtente(double prelievoEffettuatoDaUtente) {
		
		if (saldoConto >= prelievoEffettuatoDaUtente) {
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
		return Math.round(saldoConto *100.0) / 100.0;
	}
	
}
