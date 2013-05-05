package org.confisoft.poneyquizz;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ListView;

public class QuizzlistActivity extends Activity {

	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// call inherited onCreate() function
		super.onCreate(savedInstanceState);
		// hide the top title bar
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		// set the content of the activity with stuff defined in activity_quizzlist.xml
		setContentView(R.layout.activity_quizzlist);
		// create the data structure that will be used to populate the listView
		ListView listView = (ListView) findViewById(R.id.quizzlistview);
		List<Model> list = getModel();
		// the adapter tells the listView how it should display its children
		// it also holds the list data structure that will populate the listView
		CustomArrayAdapter adapter = new CustomArrayAdapter(this, list);
		// binds the listView with its adapter
		listView.setAdapter(adapter);
	}
	
	private List<Model> getModel() {
		List<Model> list = new ArrayList<Model>();
		list.add(get("Linux"));
		list.add(get("Windows7"));
		list.add(get("Suse"));
		list.add(get("Eclipse"));
		list.add(get("Ubuntu"));
		list.add(get("Solaris"));
		list.add(get("Android"));
		list.add(get("iPhone"));
		list.add(get("Linux"));
		list.add(get("Windows7"));
		list.add(get("Suse"));
		list.add(get("Eclipse"));
		list.add(get("Ubuntu"));
		list.add(get("Solaris"));
		list.add(get("Android"));
		list.add(get("iPhone"));
		list.add(get("Linux"));
		list.add(get("Windows7"));
		list.add(get("Suse"));
		list.add(get("Eclipse"));
		list.add(get("Ubuntu"));
		list.add(get("Solaris"));
		list.add(get("Android"));
		list.add(get("iPhone"));
		list.add(get("Linux"));
		list.add(get("Windows7"));
		list.add(get("Suse"));
		list.add(get("Eclipse"));
		list.add(get("Ubuntu"));
		list.add(get("Solaris"));
		list.add(get("Android"));
		list.add(get("iPhone"));
		// Initially select one of the items
		list.get(1).setSelected(true);
		return list;
	}

	private Model get(String s) {
		return new Model(s);
	}
	
}
