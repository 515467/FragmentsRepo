package karthi.android.activity2.Fragment;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
 
import karthi.android.activity2.R;
 
public class NewsActivityFragment extends Fragment implements OnItemClickListener, OnClickListener{
                TextView newsArticleTextView;
                public interface INewsButtonClickedListener{
         public void onNewsButtonClicked(String textHeadline);
}
INewsButtonClickedListener mCallBack;
                public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                                Bundle savedInstanceState) {
                                super.onCreateView(inflater, container, savedInstanceState);
       
        View view=inflater.inflate(R.layout.fragment_news_article, null);
        Button newsButton=(Button)view.findViewById(R.id.button1);
        newsButton.setOnClickListener(this);
        newsArticleTextView = (TextView)view.findViewById(R.id.textViewNewsItem);
        return view;
                               
                }
 
                public void updateNews(String string)
                {
                                newsArticleTextView.setText(string);
                }
                @Override
     public void onClick(View v) {
 
             mCallBack.onNewsButtonClicked(newsArticleTextView.getText().toString());
     }
                @Override
     public void onAttach(Activity activity) {
                 
         super.onAttach(activity);
       
         mCallBack = (INewsButtonClickedListener)activity;
}

				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {
					// TODO Auto-generated method stub
					
				}

				



 
}
