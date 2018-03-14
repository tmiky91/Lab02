package it.polito.tdp.alien;

import java.util.*;

public class Word {
	
	private String alienWord;
	private String translate;
	
	public Word(String alienWord, String translate) {
		super();
		this.alienWord = alienWord;
		this.translate = translate;
	}

	public String getAlienWord() {
		return alienWord;
	}

	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}

	public String getTranslate() {
		return translate;
	}

	public void setTranslate(String translate) {
		this.translate = translate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alienWord == null) ? 0 : alienWord.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		if (alienWord == null) {
			if (other.alienWord != null)
				return false;
		} else if (!alienWord.toLowerCase().equals(other.alienWord.toLowerCase()))
			return false;
		return true;
	}
	
	
	
	
	

}
