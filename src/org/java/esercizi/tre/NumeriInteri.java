package org.java.esercizi.tre;

import java.lang.reflect.Array;

public class NumeriInteri {
	
	private int[] interi;
	private int counter;
	private boolean elementiPresenti;
	
	public NumeriInteri(int[] interi, int counter, boolean elementiPresenti){

		this.interi = interi;
		this.counter = counter;
		this.elementiPresenti = elementiPresenti;
	}

	int getElementoSuccessivo(){
		return counter++;
	}

	boolean hasAncoraElementi(){
		if(counter < interi.length){
			elementiPresenti = true;
		}else{
			elementiPresenti = false;
		}
		return elementiPresenti;
	}

}
