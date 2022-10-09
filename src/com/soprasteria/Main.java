package com.soprasteria;

import java.util.Iterator;
import java.util.Scanner;

import com.soprasteria.bank.Conto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Nel progetto java-oop-bank, creare la classe Conto caratterizzata da:
			- numero di conto
			- nome del proprietario
			- saldo
			
			Usate opportunamente i livelli di accesso (public, private), i costruttori, 
			i metodi getter e setter ed eventuali altri metodi di “utilità” per fare in modo che:
			- alla creazione di un nuovo conto il saldo sia 0€
			
			- Il codice conto sia accessibile solo in lettura, il proprietario sia accessibile in 
			lettura e in scrittura e il saldo sia accessibile solo in lettura
			
			- siano presenti un metodo per versare una somma di denaro sul conto e uno per 
			prelevare una somma di denaro dal conto (attenzione: il saldo non può mai diventare negativo)
			
			- altri metodi per ritornare le informazioni del conto e il saldo formattato
			
			Aggiungere una classe Bank con metodo main, dove chiediamo all’utente il suo nome e 
			generiamo un Conto intestato all’utente con un numero di conto random (da 1 a 1000)
			
			Poi chiediamo all’utente cosa vuole fare dando 3 opzioni: versare una somma o 
			prelevare una somma di denaro o uscire. Dopo la scelta dell’utente chiediamo quanti 
			soldi vuole versare o prelevare e proviamo ad effettuare l’operazione sul conto. 
			
			Se l’operazione non è valida mostriamo un messaggio di errore. Se l’operazione va a 
			buon fine mostriamo il saldo attuale del conto.
			Il menu continua ad apparire fino a che l’utente sceglie di uscire.
		 * 
		 * */
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("inserisci il tuo nome");
		String NomeUtente = in.nextLine();
		
		
		Conto contoIntestato = new Conto(NomeUtente);
		System.out.println(contoIntestato.getCodiceConto());
		System.out.println(NomeUtente);
		
		
		
		int sceltaUtente;
		
		do {
			System.out.println("1 prelevare 2 versare 3 esci");
			sceltaUtente = in.nextInt();
			
			switch (sceltaUtente) {
			case 1:
				System.out.println("quanto vuoi prelevare?");
				double prelievo = in.nextDouble();
				System.out.println(contoIntestato.prelievoUtente(prelievo));
				
				
				break;
			
			case 2:
				System.out.println("quanto vuoi versare?");
				double versamento = in.nextDouble();
				System.out.println(contoIntestato.versamentoUtente(versamento));
			
				
				break;
				
			default:
				System.out.println("scelta non valida");
				break;
			}
			
			
			
		} while (sceltaUtente != 3);
		
	
		}
	}


