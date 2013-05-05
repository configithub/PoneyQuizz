package org.confisoft.poneyquizz;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class AboutActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// call inherited onCreate() function
		super.onCreate(savedInstanceState);
		// hide the top title bar
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		// set the content of the activity with stuff defined in activity_about.xml
		setContentView(R.layout.activity_about);
	}

}
