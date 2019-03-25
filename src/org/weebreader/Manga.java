package org.weebreader;

import org.weebreader.Chapter;

public class Manga{
	private String title;
	private String description;
	private double totalRating;
	private String[] tags;
	private String author;
	private int views;
	private boolean status; // 0 - Airing; 1 - finished	
	public Chapter[] ch; //Publico proque se debe acceder a los metodos de chapter, asi evitamos tener
						 //una variable auxiliar de capitulos. NO A LOS DUPLICADOS!
	
	
	public Manga(String title, String description, String[] tags, String author) {
		this.title = title;
		this.description = description;
		this.tags = tags;
		this.author = author;
		ch = new Chapter[10]; //Placeholder
		for(int i = 0; i<10; i++) 
			ch[i] = new Chapter();
		
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String[] getTags() {
		return tags;
	}
	
	public String getDesc() {
		return description;
	}
	
	
	
}