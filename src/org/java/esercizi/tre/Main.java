// ## **Es 3**
// Vogliamo realizzare una classe che contenga un elenco di interi e che ci permetta di ciclarli (dal primo all’ultimo).

// La classe dovrà offrire due metodi:
// - `int getElementoSuccessivo()`: che restituisce il prossimo elemento rispetto all’ultima volta che è stato invocato (la prima volta restituisce il primo elemento, la seconda volta il secondo, e cosi' via)
// - `boolean hasAncoraElementi()`: che deve restituire `true` se ci sono ancora elementi da restituire, `false` altrimenti

// La classe deve avere **un costruttore** che prende come parametro un array di interi (che sarà l’elenco che viene gestito internamente)

// Internamente alla classe vogliamo mantenere l’elenco di interi come `array`, non come `ArrayList` o altre strutture dati.

// #### Bonus
// Prevedere anche un **costruttore che non prenda parametri** e un metodo `addElemento` che permetta di aggiungere un nuovo intero all’elenco da ciclare.
package org.java.esercizi.tre;

public class Main {
	public static void main(String[] args) {

		int counter = 0;
		boolean elementiPresenti = true;

		// int[] interi = {0, 1, 2, 3, 4, 5};
		// OPPURE
		int[] interi = new int[6];

		interi[0] = 0;
		interi[1] = 1;
		interi[2] = 2;
		interi[3] = 3;
		interi[4] = 4;
		interi[5] = 5;

		NumeriInteri numeriInteriArray = new NumeriInteri(interi, counter, elementiPresenti);

		// System.out.println(interi.length);
		for( counter = 0; numeriInteriArray.hasAncoraElementi();){
			System.out.println(interi[numeriInteriArray.getElementoSuccessivo()]);
		}

	}
}
