package csc445.lye.edu.missouriwestern.ly_softball;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import java.util.UUID;


public class SoftballActivity extends SingleFragmentActivity {

    public static final String EXTRA_CRIME_ID = "csc445.lye.edu.missouriwestern.ly_softball.softball_id";

    public static Intent newIntent(Context packageContext, UUID softballId){
        Intent intent = new Intent(packageContext,SoftballActivity.class);
        intent.putExtra(EXTRA_CRIME_ID, softballId);
        return intent;
    }

    @Override
    protected Fragment createFragment(){
        return new SoftballFragment();
    }
}
