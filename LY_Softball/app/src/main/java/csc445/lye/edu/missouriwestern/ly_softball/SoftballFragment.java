package csc445.lye.edu.missouriwestern.ly_softball;


import android.os.Bundle;
import android.support.v4.app.Fragment;

public class SoftballFragment extends Fragment{
    private Softball mSoftball;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        mSoftball = new Softball();
    }
}
