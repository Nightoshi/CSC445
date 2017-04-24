package csc445.lye.edu.missouriwestern.criminalIntent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity

public class CrimeBaseHelper extends SQLiteOpenHelper{
	private static final int VERSION = 1;
	private static final String DATABASE_NAME = "crimeBase.db"
	
	public CrimeBaseHelper(Context context){
		super(context, DATABASE_NAME, null, VERSION);
	}
	
	@Override
	public void onCreate(SQLiteDatabase db){
		db.execSQL("create table" + CrimeSchema.CrimeTable.NAME + "(" +
		"_ID integer primary key autoincrement, " + 
		CrimeTable.cols.UUID + ", " + 
				CrimeTable.Cols.Title + ", " +
				CrimeTable.Cols.Date + ", " +
				CrimeTable.Cols.SOLVED + ", "
		);
	
	}
	
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
	
	}

}
