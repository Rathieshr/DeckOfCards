package com.rathiesh.deckofcards.base;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.rathiesh.deckofcards.R;

/**
 * Created by rathiesh on 16/02/18.
 *
 * This activity acts as the base activity. All the other activities are extended to this base activity
 * to inherit the basic essential functions.
 */

public class BaseActivity extends AppCompatActivity {

    private boolean isDoubbleTappedToExit; // Boolean - to know is the back button tapped once
    private Context mContext;      // context declaration of the activity

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;    // Context given reference of the current activity.
    }
    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    /**
     * Method invokes clicking android system back button
     */
    @Override
    public void onBackPressed() {
        //If double tapped - User want to exit, finish all activity.
        if (isDoubbleTappedToExit) {
            super.onBackPressed();
            finishAffinity();
            return;
        }
        //if single time pressed make single click boolean true and wait for 5 seconds
        this.isDoubbleTappedToExit = true;
        // Show the about to exit message to user on single click
        Toast.makeText(mContext,getResources().getString(R.string.press_again_to_exit),Toast.LENGTH_SHORT).show();
        //handler to wait for the press again action of system back button.
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                isDoubbleTappedToExit = false; // If not pressed again 5 secs the boolean is resetted by turning into false.
            }
        }, 5000); // delay in millis
    }
}
