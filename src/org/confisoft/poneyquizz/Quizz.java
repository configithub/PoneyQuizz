package org.confisoft.poneyquizz;

import java.util.List;

public class Quizz {

	// data structure for the listView used in QuizzlistActivity
	
	private String name;
	private boolean selected;
	// quick description of the quizz, shown in the launch screen
	private String description;
	

	// the list of questions
	private List<Question> questions;
	
	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Quizz(String name) {
		this.name = name;
		selected = false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

}
