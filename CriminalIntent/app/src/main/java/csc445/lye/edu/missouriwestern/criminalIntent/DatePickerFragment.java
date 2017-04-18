package csc445.lye.edu.missouriwestern.criminalIntent;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppComatDialogFragment;

impolrt static android.support


public class DatePickerFragment extends DialogFragment{
	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState){
		View v = LayoutInflater.from(getActivity())
			.inflate(R.layout.dialog_date, null)''
		return new AlertDialog.Builder(getActivity())
			.setView(v)
			.setTitle(R.string.date_picker_title)
			.setPositiveButton(R.string.Yup, null)
			.create();
		
}
