// ### Es 1
// Siamo a dicembre, è tempo di pensare alla lista dei regali di Natale e 
// vogliamo creare un programma che memorizzi la nostra lista.

// Il programma deve chiedere il nome del regalo da inserire in lista e 
// salvarlo in un `ArrayList` (finchè l’utente non decide di fermarsi).

// Ad ogni iterazione mostrare la lunghezza della lista e chiedere all’utente 
// se vuole continuare aggiungendo un nuovo regalo.

// Al termine dell’inserimento stampare la lista.

// #### Bonus
// - ogni elemento salvato in lista non deve avere solo il nome ma anche a chi 
// è destinato (mamma, papà, cugino,  …)
package org.java.esercizi.uno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {

		System.out.println("Lista regali di Natale");

		Scanner sc = new Scanner(System.in);
		
		List<String> regali = new ArrayList<>();
		List<String> persone = new ArrayList<>();
		boolean booleanValue = true;
		int counter = 0;
		
		do {
			
			if(counter != 0){
				System.out.print("Inserisci un altro regalo oppure termina cliccando '0' : ");
			}else{
				System.out.print("Inserisci il nome del regalo da aggiungere alla lista: ");
			}
			
			String regalo = sc.nextLine();
			
			if(regalo.equals("0")){
				booleanValue = false;
			}else{
				
				counter++;
				System.out.println("Regalo aggiunto! \nIl numero di regali in lista sono " + counter);
				regali.add(regalo);
				System.out.print(regalo + ", a chi lo/la vuoi dare ? ");
				String persona = sc.nextLine();
				persone.add(persona);
			}
			
		} while(booleanValue == true);{
			sc.close();
			//* soluzione 1 stampa l'ArrayList
			// System.out.println("Ecco la lista: " + regali); //? output: Ecco la lista: [cds, cds, cdsfsdcd, csdcdscds]
			
			//* + SEMPLICE soluzione 2 stampa l'ArrayList
			//! utilizza for-each
			// System.out.println("Ecco la lista: \n");

			// int c = 0;
			// for(String regaloString : regali){
			// 	c++;
			// 	System.out.println(c + ") " + regaloString);
			// }

			// System.out.println("\n");

			//?OUTPUT:
			// Ecco la lista:
			// 1) vdssdv
			// 2) sdsdvds
			// 3) vdsvds
			
			//* MIGLIORE soluzione 3 stampa l'ArrayList
			//! utilizza map e IntStream.range per generare numeri da 1 a n (dove n è la dimensione dell'ArrayList)
			System.out.println("Ecco la lista: \n");
			
			IntStream.range(0, regali.size())
			// .mapToObj(i -> (i+1) + ") " + regali.get(i))
			//* BONUS
				.mapToObj(i -> (i+1) + ") " + regali.get(i) + " da regalare a " + persone.get(i))
				.forEach(System.out::println);

			System.out.println("\n");

			//?OUTPUT:
			// Ecco la lista:
			// 1) vdssdv
			// 2) sdsdvds
			// 3) vdsvds

			//* soluzione 4 stampa l'ArrayList
			//! utilizza ciclo for
			// System.out.println("Ecco la lista: \n");

			// for(int i = 0; i < regali.size(); i++) {
			// 	System.out.println((i+1) + ") " + regali.get(i));
			// }

			// System.out.println("\n");

			//?OUTPUT:
			// Ecco la lista:
			// 1) vdssdv
			// 2) sdsdvds
			// 3) vdsvds

		}

	}
}
