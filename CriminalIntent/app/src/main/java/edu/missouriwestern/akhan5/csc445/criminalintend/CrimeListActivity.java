package edu.missouriwestern.akhan5.csc445.criminalintend;


import android.support.v4.app.Fragment;

public class CrimeListActivity extends SingleFragmentActivity
{


    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
