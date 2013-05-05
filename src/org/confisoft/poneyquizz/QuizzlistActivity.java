package org.confisoft.poneyquizz;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListView;

public class QuizzlistActivity extends Activity {

	// the scrolling list
	ListView listView;
	
	// data structure
	List<Model> list;
	
	// adapter between the data structure and the scrolling list
	CustomArrayAdapter adapter;
	
	// the index of the selected item in list
	int selectedItem;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// call inherited onCreate() function
		super.onCreate(savedInstanceState);
		// hide the top title bar
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		// set the content of the activity with stuff defined in activity_quizzlist.xml
		setContentView(R.layout.activity_quizzlist);
		// create the data structure that will be used to populate the listView
		listView = (ListView) findViewById(R.id.quizzlistview);
		list = getModel();
		// the adapter tells the listView how it should display its children
		// it also holds the list data structure that will populate the listView
		adapter = new CustomArrayAdapter(this, list);
		// binds the listView with its adapter
		listView.setAdapter(adapter);
		listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
		// add the item click listener that will collect the selected item index 
		// when the user clicks on one element of the listView
		addOnItemClickListener();
	}
	
	private void addOnItemClickListener() {
		listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, final View view,
					int position, long id) {
				// final String item = (String) parent.getItemAtPosition(position);
				// recover the index of the selected element
				selectedItem = position;
			}
		});
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
