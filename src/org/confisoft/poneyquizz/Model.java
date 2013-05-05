package org.confisoft.poneyquizz;

public class Model {

	// data structure for the listView used in QuizzlistActivity
	
	private String name;
	private boolean selected;

	public Model(String name) {
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
