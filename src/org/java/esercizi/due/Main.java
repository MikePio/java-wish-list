// ## **Es 2**
// Data una parola definita dall'utente stampare per ogni carattere della parola 
// il numero delle occorrenze.

// #### Esempio
// La parola è `programma`
// Stampare a schermo:
// ```log
// p:1
// r:2
// o:1
// g:1
// a:2
// m:2
// ```
package org.java.esercizi.due;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Inserisci una parola: ");
		String parola = sc.nextLine();

		// converte una parola in una sequenza di caratteri
		char[] caratteri = parola.toCharArray();
		
		Map<Character, Integer> caratteriNumsMap = new HashMap<>();
		
		for(char carattere : caratteri){
			
			if(caratteriNumsMap.containsKey(carattere)){
				caratteriNumsMap.put(carattere, caratteriNumsMap.get(carattere) + 1);
			}else{
				caratteriNumsMap.put(carattere, 1);
			}

			// System.out.println(caratteriNumsMap);
			// System.out.println(caratteriNumsMap.keySet());
			// System.out.println(caratteriNumsMap.values());

			System.out.println("Ecco la quantità di caratteri presenti in '" + parola + "': ");
			for (char result : caratteriNumsMap.keySet()) {

				int quantità = caratteriNumsMap.get(result);
				System.out.println(result + ":" + quantità);

			}
		
			sc.close();
		}
		
	}
}
