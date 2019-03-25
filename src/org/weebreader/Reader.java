/*
 * Esta clase es solo de prueba, probar las clases Manga y Chapter, tambien probar el hashmap.
 * Pronto sera removida/cambiada/destruida xdxdxd
 * 
 */

package org.weebreader;

import java.io.*;
import java.util.*;

public class Reader{
	
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String,Manga> M = new HashMap<String,Manga>();
		String[] tags = new String[3];
		tags[0] = "TEST1";
		tags[1] = "TEST2";
		tags[2] = "TEST2";
		M.put("Naruto",new Manga("Naruto", "Esta wea es una mierda pero es chistosa broder k guea XD", tags, "Penecito xd"));
		
		Manga aux;
		String search;
		
		System.out.println("Bienvenido al gran lector epico de mangas WeebReader");
		System.out.print("Que manga quiere senior uwu?: ");
		search = r.readLine();
		if (M.containsKey(search)) {
			aux = M.get(search);
			System.out.println("INFORMACION SOBRE " + aux.getTitle() + ": ");
			System.out.println("Autor: " + aux.getAuthor());
			System.out.println("Sinopsis: " + aux.getDesc());
			System.out.println("Capitulos: " + aux.ch.length);
			
			
		}
		else {
			System.out.println("Ese manga no existe wey.");
		}
		
	}
	
}
