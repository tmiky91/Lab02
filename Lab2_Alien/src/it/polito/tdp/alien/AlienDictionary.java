package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {
	
	private List<Word> words;
	
	public AlienDictionary() {
		words = new LinkedList<Word>();
	}
	
	public void addWord(String alienWord, String translate) {
		Word newAlienWord = new Word(alienWord, translate);
		words.remove(newAlienWord);
		words.add(newAlienWord);
	}
	
	public String translateWord(String alienWord) {
		/*
		for(Word w:words) {
			if(w.getAlienWord().toLowerCase().equals(alienWord)) {
				return w.getTranslate();
			}
		}
		return null;
		*/
		Word newAlienWord = new Word(alienWord, "");
		int index= words.indexOf(newAlienWord);
		if(index<0) {
			return null;
		}
		return words.get(index).getTranslate();
	}
	
	public void reset() {
		words.clear();
	}

}
