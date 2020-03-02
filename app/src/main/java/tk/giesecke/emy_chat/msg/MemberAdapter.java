package tk.giesecke.emy_chat.msg;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * MemberAdapter is the adapter to handle the MemberData class.
 * It provides an interface to access the MemberData entries
 */
public class MemberAdapter extends BaseAdapter {
	private final List<MemberData> members = new ArrayList<>();

	private final String[] colors = {"#FFCDD2", "#B2DFDB", "#FFF9C4", "#C5CAE9",
			"#F8BBD0", "#C8E6C9", "#FFECB3", "#BBDEFB",
			"#E1BEE7", "#FFE0B2"};

	public void add(MemberData data) {
		this.members.add((data));
		notifyDataSetChanged();
	}

	public int hasMember(String name) {
		for (int idx = 0; idx < members.size(); idx++) {
			if (getItem(idx).getName().equalsIgnoreCase(name)) {
				return idx;
			}
		}
		return -1;
	}

	public String getRandomColor() {
		return colors[new Random().nextInt(10)];
	}

	@Override
	public int getCount() {
		return members.size();
	}

	@Override
	public MemberData getItem(int position) {
		return members.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		return null;
	}
}
