package csc445.lye.edu.missouriwestern.beatbox;

/**
 * Created by Lisa on 3/23/2017.
 */

public class Sound {
    private String mAssetPath;
    private String mName;

    public Sound (String assetPath){
        mAssetPath = assetPath;
        String[] compnents = assetPath.split("/");
        String filename = compnents[compnents.length - 1];
        mName = filename.replace(".wav", "");
    }

    public String getAssetPath(){
        return mAssetPath;
    }

    public String getName(){
        return mName;
    }
}
