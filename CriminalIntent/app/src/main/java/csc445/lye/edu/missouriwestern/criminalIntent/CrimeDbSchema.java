package csc445.lye.edu.missouriwestern.criminalIntent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity

public class CrimeDbSchema{
	public static final class CrimeTable {
	public static final String NAME = "crimes";
	
	public static final class Cols{
	public static final String UUID = "uuid";
	public static final String TITLE = "title";
	public static final String DATE = "date";
	public static final String SOLVED = "solved";

}
}
}
