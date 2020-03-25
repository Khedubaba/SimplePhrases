package com.codellion.simplephrases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer doYouEng, goodEve, hello, howAreYou, iLiveIn, myNameIS, please, welcome;

    public void phraseBtnClick(View view){
        Button button = (Button) view;
//
        switch (view.getId()){
            case R.id.doYouEngBtn:
                Log.i("case1: ", button.getTag().toString());
                doYouEng.start();
                break;

            case R.id.goodEveBtn:
                Log.i("case2: ", button.getTag().toString());
                goodEve.start();
                break;

            case R.id.helloBtn:
                Log.i("case3: ", button.getTag().toString());
                hello.start();
                break;

            case R.id.howAreYouBtn:
                Log.i("case4: ", button.getTag().toString());
                howAreYou.start();
                break;

            case R.id.iLiveInBtn:
                Log.i("case5: ", button.getTag().toString());
                iLiveIn.start();
                break;

            case R.id.myNameIsBtn:
                Log.i("case6: ", button.getTag().toString());
                myNameIS.start();
                break;

            case R.id.pleaseBtn:
                Log.i("case7: ", button.getTag().toString());
                please.start();
                break;

            case R.id.welcomeBtn:
                Log.i("case8: ", button.getTag().toString());
                welcome.start();
                break;

            default:
                Log.i("Default Case: ", "Default default.");
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        doYouEng = MediaPlayer.create(this, R.raw.doyouspeakenglish);
        goodEve = MediaPlayer.create(this, R.raw.goodevening);
        hello = MediaPlayer.create(this, R.raw.hello);
        howAreYou = MediaPlayer.create(this, R.raw.howareyou);
        iLiveIn = MediaPlayer.create(this, R.raw.ilivein);
        myNameIS = MediaPlayer.create(this, R.raw.mynameis);
        please = MediaPlayer.create(this, R.raw.please);
        welcome = MediaPlayer.create(this, R.raw.welcome);
    }
}
