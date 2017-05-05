package csc445.lye.edu.missouriwestern.ly_softball;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class SoftballLab {
    private static SoftballLab sSoftballLab;
    private List<Players> mPlayers;

    public static SoftballLab get(Context context){
        if (sSoftballLab == null) {
            sSoftballLab = new SoftballLab(context);
        }
        return sSoftballLab;
    }

    private SoftballLab(Context context){
        mPlayers = new ArrayList();
        for (int i=0; i<100; i++){
            Players players = new Players();
            mPlayers.add(players);
        }
    }

    public List<Players> getPlayers(){
        return mPlayers;
    }

    public Players getPlayers(UUID id) {
        for (Players players : mPlayers){
            if(players.getId().equals(id)){
                return players;
            }
        }
        return null;
    }
}
