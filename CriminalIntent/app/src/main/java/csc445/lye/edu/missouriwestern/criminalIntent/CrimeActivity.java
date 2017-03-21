
package csc445.lye.edu.missouriwestern.criminalIntent;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CrimeActivity extends SingleFragmentActivity {

	@Override
	protected Fragment createFragment(){
	return new CrimeFragment();
	}
}
