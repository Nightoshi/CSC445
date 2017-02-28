package csc445.lye.edu.missouriwestern.criminalIntent;

import java.util.UUID;

public class Crime {
    private UUID mId;
    private String mTitle;

    public Crime(){
        mId = UUID.randomUUID();
    }

    public UUID getId(){
        return mId;
    }

    public String getTitle(){
        return mTitle;
    }

    public void getTitle(String title){
        mTitle = title;
    }
}
