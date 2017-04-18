package csc445.lye.edu.missouriwestern.ly_softball;

import java.util.UUID;

/**
 * Created by Lisa on 4/18/2017.
 */

public class Softball {
    private UUID mId;
    private String mTitle;

    public Softball(){
        mId = UUID.randomUUID();
    }

    public UUID getId(){
        return mId;
    }

    public String getTitle(){
        return mTitle;
    }

    public void setTitle(String title){
        mTitle = title;
    }
}
