package org.confisoft.poneyquizz;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomArrayAdapter extends ArrayAdapter<Model> {
	private final Context context;
	private final List<Model> values;

	public CustomArrayAdapter(Context context, List<Model> values) {
		super(context, R.layout.rowlayout, values);
		this.context = context;
		this.values = values;
	}

	@Override
	public int getViewTypeCount() {
		return 2;
	}

	@Override
	public int getItemViewType(int position) {
		return position % 2;
	}

	public static class ViewHolder {
		public TextView t;
		public ImageView i;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View rowView = null;

		if (convertView != null) {
			rowView = convertView;
		} else {
			LayoutInflater inflater = (LayoutInflater) context
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			rowView = inflater.inflate(R.layout.rowlayout, parent, false);

			TextView textView = (TextView) rowView.findViewById(R.id.label);
			ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
			ViewHolder holder = new ViewHolder();
			holder.t = textView;
			holder.i = imageView;
			rowView.setTag(holder);

		}
		ViewHolder tag = (ViewHolder) rowView.getTag();

		tag.t.setText(values.get(position).getName().toUpperCase() );
		// Change the icon for Windows and iPhone

		if (values.get(position).isSelected()) {
			tag.i.setImageResource(R.drawable.gm);
		} else {
			tag.i.setImageResource(R.drawable.sbd);
		}
		return rowView;
	}
}

