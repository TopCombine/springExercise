package com.sfy;

public class TextEditor {
	private String name;
	private SpellChecker spellChecker;

	/**
	 * 构造方式的依赖注入
	 * 
	 * @param spellChecker
	 */
	// public TextEditor(SpellChecker spellChecker) {
	// System.out.println("Inside TextEditor constructor.");
	// this.spellChecker = spellChecker;
	// }

	public TextEditor(SpellChecker spellChecker, String name) {
		this.spellChecker = spellChecker;
		this.name = name;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("Inside setSpellChecker.");
		this.spellChecker = spellChecker;
	}

	// a getter method to return spellChecker
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
