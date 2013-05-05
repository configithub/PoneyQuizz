package org.confisoft.poneyquizz;

import java.util.ArrayList;
import java.util.List;

import android.app.Application;

// master data structure class, accessible from any activity
// holds the list of quizz

public class PoneyQuizzApplication extends Application {

	List<Quizz> quizzs;
	
	// TODO method to build the quizz from a file or db
	
	public List<Quizz> getQuizzs() {
		return quizzs;
	}
	
	public void populateWithHardcodedStuff() {
		quizzs = new ArrayList<Quizz>();
		quizzs.add(get("Linux"));
		quizzs.add(get("Windows7"));
		quizzs.add(get("Suse"));
		quizzs.add(get("Eclipse"));
		quizzs.add(get("Ubuntu"));
		quizzs.add(get("Solaris"));
		quizzs.add(get("Android"));
		quizzs.add(get("iPhone"));
		quizzs.add(get("Linux"));
		quizzs.add(get("Windows7"));
		quizzs.add(get("Suse"));
		quizzs.add(get("Eclipse"));
		quizzs.add(get("Ubuntu"));
		quizzs.add(get("Solaris"));
		quizzs.add(get("Android"));
		quizzs.add(get("iPhone"));
		quizzs.add(get("Linux"));
		quizzs.add(get("Windows7"));
		quizzs.add(get("Suse"));
		quizzs.add(get("Eclipse"));
		quizzs.add(get("Ubuntu"));
		quizzs.add(get("Solaris"));
		quizzs.add(get("Android"));
		quizzs.add(get("iPhone"));
		quizzs.add(get("Linux"));
		quizzs.add(get("Windows7"));
		quizzs.add(get("Suse"));
		quizzs.add(get("Eclipse"));
		quizzs.add(get("Ubuntu"));
		quizzs.add(get("Solaris"));
		quizzs.add(get("Android"));
		quizzs.add(get("iPhone"));
		
	}

	private Quizz get(String s) {
		return new Quizz(s);
	}
}
