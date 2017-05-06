package csc445.lye.edu.missouriwestern.ly_softball;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

public class SoftballFragment extends Fragment{
    private Softball mSoftball;
    private Button mDateButton;
    private CheckBox mPitcherCheckBox;
    private CheckBox mCatcherCheckBox;
    private CheckBox mInfieldCheckBox;
    private CheckBox mOutfieldCheckBox;
    private EditText mLastNameField;
    private EditText mFirstNameField;
    private EditText mJerseyField;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        mSoftball = new Softball();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_softball, container, false);

        mDateButton = (Button)v.findViewById(R.id.date_button);
        mDateButton.setText(mSoftball.getLastUpdate().toString());
        mDateButton.setEnabled(false);

        mLastNameField = (EditText)v.findViewById(R.id.softball_last_name);
        mLastNameField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int count, int after) {
                mSoftball.setLastName(s.toString());

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        mFirstNameField = (EditText)v.findViewById(R.id.softball_first_name);
        mFirstNameField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int count, int after) {
                mSoftball.setLastName(s.toString());

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        mJerseyField = (EditText)v.findViewById(R.id.softball_jersey);
        mJerseyField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int count, int after) {
                mSoftball.setLastName(s.toString());

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        mPitcherCheckBox = (CheckBox)v.findViewById(R.id.softball_pitcher);
        mPitcherCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mSoftball.setPitcher(isChecked);
            }
        });

        mCatcherCheckBox = (CheckBox)v.findViewById(R.id.softball_catcher);
        mCatcherCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mSoftball.setCatcher(isChecked);
            }
        });

        mInfieldCheckBox = (CheckBox)v.findViewById(R.id.softball_infield);
        mInfieldCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mSoftball.setInfield(isChecked);
            }
        });

        mOutfieldCheckBox = (CheckBox)v.findViewById(R.id.softball_outfield);
        mOutfieldCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mSoftball.setOutfield(isChecked);
            }
        });
        return v;
    }
}
