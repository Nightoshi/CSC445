<<<<<<< e76e72ed08f722e9079f21f6d5c77b5fa8da2ea9
package csc445.lye.edu.missouriwestern.criminalIntent;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CrimeActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);
    }
=======
public class CrimeActivity extends SingleFragmentActivity {
	@Override
	protected Fragment createFragment(){
		return new CrimeFragment();
	}
>>>>>>> Criminal Intent
}
