package net.srcf.user.twdl3.radio;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    Button startStreamButton;
    Button stopStreamButton;
    MediaPlayer mediaPlayer = new MediaPlayer();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        startStreamButton =  (Button)findViewById(R.id.startStreamButton);
        stopStreamButton =  (Button)findViewById(R.id.stopStreamButton);

//        Resources res = getResources();
        startStreamButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startStreamButton.setText("Loading...");
                // Perform action on click
//                if (mediaPlayer == null){

//                }
                try
            	{
                    mediaPlayer.setDataSource("http://119.110.85.35:8000/low");
//                    mediaPlayer.setDataSource("http://radio.mediacorp.sg/RadioLive/987FM.aspx");
                    mediaPlayer.prepare();
                }catch(Exception e)
            	{
                    e.printStackTrace();
                    Log.e("DANIEL", e.toString());
                }
                mediaPlayer.start();
                startStreamButton.setText("987");
            }
        });

        stopStreamButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.stop();
            }
        });
//        mTabHost.setCurrentTab(1);
    }
    
    
}