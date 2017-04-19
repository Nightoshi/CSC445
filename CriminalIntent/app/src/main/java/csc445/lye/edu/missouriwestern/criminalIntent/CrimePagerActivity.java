package csc445.lye.edu.missouriwestern.criminalIntent;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import java.util.List;
import android.support.v7.app.AppCompatActivity

public class CrimePagerActivity extends AppCompatActivity{
	private ViewPager;
	private List<Crime> mCrimes;
	private static final String EXTRA_CRIME_ID = "csc445.lye.edu.missouriwestern.criminalIntent.crime_id";
	
	public static Intent newIntent(Context packageContext, UUID crimeId){
		Intent intent = new Intent(packageContext, CrimePagerActivity.class);
		intent.putExtra(EXTRA_CRIME_ID, crimeId);
		return intent
	}
	
	@Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime_page);
        
	UUID crimeId = (UUID) getIntent().getSerializableExtra(EXTRA_CRIME_ID);
	
	
	mViewPager = (ViewPager) findViewById(R.id.activity_crime_pager_view_pager);
	
	mCrimes = CrimeLab.et(this).getCrimes();
	FragmentManager fragmentManager = getSupportFragmentManagaer();
	mViewPager.setAdapter(new FragmentStatePagerAdapter(fragmentManager){
	
	@Override
	public fragment getItem(int position){
		Crime crime = mCrimes.get(position);
		return CrimeFragment.newInstance(crime.getId());
	}
	
	@Override
	public int getCount(){
	return mCrimes.size();
	}
	
	for (int i = 0; i < mCrimes.size(); i++{
		if(mCrimes.get(i).getId().equals(crimeId)){
			mViewPager.setCurrentItem(i);
		}
	}
	
});
}
}
