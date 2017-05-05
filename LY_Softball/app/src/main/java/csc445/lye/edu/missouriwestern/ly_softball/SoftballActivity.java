package csc445.lye.edu.missouriwestern.ly_softball;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;

public class SoftballActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment(){
        return new SoftballFragment();
    }
}
