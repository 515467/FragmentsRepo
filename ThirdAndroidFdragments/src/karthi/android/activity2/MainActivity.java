package karthi.android.activity2;

/*import karthi.android.activity2.Fragment.detailsFragment;
import karthi.android.activity2.Fragment.newsArticleFragment;*/
import karthi.android.activity2.Fragment.DetailFragment;
import karthi.android.activity2.Fragment.HeadlinesFragment.IheadlineSelectedListener;
import karthi.android.activity2.Fragment.NewsActivityFragment;
import karthi.android.activity2.Fragment.NewsActivityFragment.INewsButtonClickedListener;
//import karthi.android.activity2.Fragment.newsArticleFragment.INewsButtonClickedListener;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity implements IheadlineSelectedListener,INewsButtonClickedListener{
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_main);
		}
		
		
		

		@Override
		public void onHeadLineSelected(String textHeadLine, int positionHeadLine) {
			// TODO Auto-generated method stub
				Toast.makeText(this,"pos"+ positionHeadLine, Toast.LENGTH_SHORT).show();
				NewsActivityFragment nFragment=(NewsActivityFragment)getFragmentManager().findFragmentById(R.id.fragment2);
				nFragment.updateNews(textHeadLine);
		}
		
		@Override
        public void onNewsButtonClicked(String textHeadline) {
                DetailFragment dFragment =
                                (DetailFragment)getFragmentManager().findFragmentById(R.id.fragment3);
                dFragment.updateNews(textHeadline);
               
        }
	}

