package karthi.android.activity2.Fragment;

import karthi.android.activity2.R;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;



public class HeadlinesFragment extends Fragment implements OnItemClickListener {
	
	
	public interface IheadlineSelectedListener{
		public void onHeadLineSelected(String textHeadLine,int positionHeadLine);
	}
	
	IheadlineSelectedListener mcallback;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		
		super.onCreateView(inflater, container, savedInstanceState);
		View view=inflater.inflate(R.layout.fragment_headlines,null);
		ListView headlinesListView=(ListView)view.findViewById(R.id.listViewHeadlines);
		headlinesListView.setOnItemClickListener(this);
		return view;
	} 
		public void onAttach(Activity activity)
			{
				super.onAttach(activity);
				mcallback=(IheadlineSelectedListener)activity;
			}

	
	@Override
	public void onItemClick(AdapterView<?> adapter, View arg1, int pos, long arg3) {
		// TODO Auto-generated method stub
		mcallback.onHeadLineSelected(adapter.getItemAtPosition(pos).toString(), pos);
		
	}
	
}
