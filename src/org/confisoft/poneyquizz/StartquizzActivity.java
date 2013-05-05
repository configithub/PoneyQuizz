package org.confisoft.poneyquizz;

import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

public class StartquizzActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// call inherited onCreate() function
		super.onCreate(savedInstanceState);
		// hide the top title bar
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		// set the content of the activity with stuff defined in activity_startquizz.xml
		setContentView(R.layout.activity_startquizz);
		Bundle extras = getIntent().getExtras();
		if (extras == null) { return; }
		// Get data via the key
		int quizzId = extras.getInt("quizzToStart");
		// recover the master data structure via the application class
		PoneyQuizzApplication appState = ((PoneyQuizzApplication)this.getApplication());
		List<Quizz> quizzList = appState.getQuizzs();
		Quizz quizz = quizzList.get(quizzId);
		((TextView)findViewById (R.id.quizz_description_textview)).setText (quizz.getName());
	}

}
