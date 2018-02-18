package com.rathiesh.deckofcards.ui;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
/**
 * Created by rathiesh on 16/02/18.
 */
public class ButtonRegular extends AppCompatButton {
    public ButtonRegular(Context context, AttributeSet attributeSet) {
        super(context,attributeSet);
        this.setTypeface(Typeface.createFromAsset(context.getAssets(),"fonts/metropolis-regular.otf"));
    }
}
