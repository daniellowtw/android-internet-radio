package net.srcf.user.twdl3.radio;
import android.media.MediaPlayer;

import java.io.IOException;
public class AudioStream {
    public void audioPlayer(String path, String fileName){
        //set up MediaPlayer        android:background=""
        MediaPlayer mp = new MediaPlayer();
        try {
            mp.setDataSource(path+"/"+fileName);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            mp.prepare();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        mp.start();
    }

}
