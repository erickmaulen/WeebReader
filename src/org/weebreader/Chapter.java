package org.weebreader;

import java.util.Random;


public class Chapter{
	private int chapter;
	private int totalpages;
	public String[] paginas;
	
	public Chapter() { //El constructor es un mero placeholder, va a cambiar. Creado para test
		int random = (int)Math.random()*50;
		totalpages = random;
		paginas = new String[random];
		for(int i=0; i<random; i++) //Placeholder
			paginas[i]="Esta es la pagina [i]/"+ random+ " Epic style xd!!!\n";
	}
	
	public int getChapter() {
		return chapter;
	}
	
	public String getPage(int i) {
		return paginas[i];
	}
	
	
}