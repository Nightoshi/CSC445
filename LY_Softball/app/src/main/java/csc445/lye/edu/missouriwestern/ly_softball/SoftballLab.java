package csc445.lye.edu.missouriwestern.ly_softball;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class SoftballLab {
    private static SoftballLab sSoftballLab;
    private List<Softball> mSoftballs;

    public static SoftballLab get(Context context){
        if (sSoftballLab == null) {
            sSoftballLab = new SoftballLab(context);
        }
        return sSoftballLab;
    }

    private SoftballLab(Context context){
        mSoftballs = new ArrayList();
        for (int i=0; i<100; i++){
            Softball softball = new Softball();
            softball.setTitle("Player #" + i);
            mSoftballs.add(softball);
        }
    }

    public List<Softball> getSoftBall(){
        return mSoftballs;
    }

    public Softball getSoftball(UUID id) {
        for (Softball softball : mSoftballs){
            if(softball.getId().equals(id)){
                return softball;
            }
        }
        return null;
    }
}
