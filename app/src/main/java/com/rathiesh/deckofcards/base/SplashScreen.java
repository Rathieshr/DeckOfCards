package com.rathiesh.deckofcards.base;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;

import com.rathiesh.deckofcards.R;
import com.rathiesh.deckofcards.activities.CardDeck;


/**
 * Created by rathiesh on 16/02/18.
 *
 * This Activity is the launch activity of application.
 * This screen holds the business logo and is also used for initial background operations used for app initializations.
 */

public class SplashScreen extends BaseActivity {
    private Handler mhandler = new Handler(); //handler to delay / make the screen wait
    private Context mContext;
    private int mTimeDelay = 3 * 1000; // Splash screen delay in millis
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        mContext = this;
        delaySplash();  // Call delay method in oncreate to execute.
    }

    /**
     * Method includes handler to delay the screen in order show business logo
     * and redirect to landing screen.
     */
    public void delaySplash(){
        mhandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent toMainActivityIntent = new Intent(mContext, CardDeck.class);
                startActivity(toMainActivityIntent);
                finish();
            }
        },mTimeDelay); // wait for 3 seconds

    }
}
