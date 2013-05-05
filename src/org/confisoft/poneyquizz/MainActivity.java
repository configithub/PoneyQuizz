package org.confisoft.poneyquizz;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends Activity {

	Button startButton;
	Button aboutButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// call inherited onCreate() function
		super.onCreate(savedInstanceState);
		// hide the top title bar
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		// set the content of the activity with stuff defined in activity_main.xml
		setContentView(R.layout.activity_main);
		// add a listener on about button to make it go to the about activity on click action
		addListenerOnAboutButton();
		// add a listener on start button to make it go to the quizzlist activity on click action
		addListenerOnStartButton();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void addListenerOnAboutButton() {
		final Context context = this;
		aboutButton = (Button) findViewById(R.id.about_button);
		aboutButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
			    Intent intent = new Intent(context, AboutActivity.class);
                            startActivity(intent);   
			}
		});
	}
	
	public void addListenerOnStartButton() {
		final Context context = this;
		startButton = (Button) findViewById(R.id.start_button);
		startButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
			    Intent intent = new Intent(context, QuizzlistActivity.class);
                            startActivity(intent);   
			}
		});
	}

}
