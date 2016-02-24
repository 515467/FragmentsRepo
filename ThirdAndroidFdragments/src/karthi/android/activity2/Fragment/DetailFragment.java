package karthi.android.activity2.Fragment;

import android.app.Fragment;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
 
import karthi.android.activity2.R;

public class DetailFragment extends Fragment {
	TextView tvDetailsItem;
	 
	@Override
	public void onCreate(Bundle savedInstanceState) {
	        // TODO Auto-generated method stub
	        super.onCreate(savedInstanceState);
	       
	}
	 
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
	                Bundle savedInstanceState) {
	        // TODO Auto-generated method stub
	        super.onCreateView(inflater, container, savedInstanceState);
	        //Log.i(TAG,Constants.log_message.onCreateView);
	        View view=inflater.inflate(R.layout.fragment_details, null);
	        tvDetailsItem = (TextView)view.findViewById(R.id.textViewdetail);
	        return view;
	}
	 
	@Override
	public void onAttach(Activity activity) {
	 
	        super.onAttach(activity);
	        //Log.i(TAG,Constants.log_message.onAttach);
	}
	 
	public void updateNews(String string){
	        tvDetailsItem.setText(string);
	}
}
